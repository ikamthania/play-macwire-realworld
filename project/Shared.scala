import sbt.Keys._
import sbt.{CrossVersion, _}
import AppSettings._
import sbtcrossproject.CrossPlugin.autoImport._
import sbtcrossproject.JVMPlatform
import scalajscrossproject.JSPlatform
import scalajscrossproject.ScalaJSCrossPlugin.autoImport._
import scoverage.ScoverageKeys.coverageEnabled

object Shared {
  lazy val commonSettings = Seq(
    scalaVersion := SharedSettings.scalaVersion,
    version := SharedSettings.appVersion,
    name:= "realworld-scala",
    organization := "com.ikamthania",
    scalacOptions ++= SharedSettings.compileOptions,
    scalacOptions in(Compile, console) ~= (_.filterNot(Set("-Ywarn-unused:imports", "-Xfatal-warnings"))),
    scalacOptions in(Compile, doc) := Seq("-encoding", "UTF-8")
  )


  lazy val shared =
    crossProject(JSPlatform, JVMPlatform)
      .crossType(CrossType.Pure)
      .in(file("shared"))
      .jsSettings(
        //disable coverage for scala.js: https://github.com/scoverage/scalac-scoverage-plugin/issues/196
        coverageEnabled := false
      )
      .jvmSettings(
        coverageEnabled := true
      )
      .settings(
        commonSettings: _*
      )
      .settings(
        libraryDependencies ++= sharedDependecies.value,
        addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
      )

  lazy val sharedJs = shared.js
  lazy val sharedJvm = shared.jvm


}
