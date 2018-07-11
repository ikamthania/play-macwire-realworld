import sbt._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._

object AppSettings {

  object SharedSettings {
    val scalaVersion = "2.12.6"
    val appVersion = "0.0.1-SNAPSHOT"
    val compileOptions = Seq(
      "-target:jvm-1.8", "-encoding", "UTF-8", "-feature", "-deprecation", "-explaintypes", "-feature", "-unchecked",
      "–Xcheck-null", "-Xfatal-warnings",  "-Xlint",  "-Xcheckinit", "-Xfuture", "-Yrangepos",
      "-Yno-adapted-args", "-Ywarn-dead-code", "-Ywarn-inaccessible", "-Ywarn-nullary-override", "-Ywarn-numeric-widen", "-Ywarn-infer-any"
    )
  }

  val sharedDependecies = Def.setting(
    Seq(
      "io.circe" %%% "circe-generic" % "0.9.3",
      "org.julienrf" %%% "endpoints-algebra-circe" % "0.6.0"

    )
  )

  val crossDependencies = Def.setting(
    Seq(
      "org.julienrf" %%% "endpoints-xhr-client-circe" % "0.6.0"
    )
  )

  val jvmDependencies = Def.setting(
    Seq(
      "org.julienrf" %% "endpoints-openapi" % "0.6.0",
      // (optional) JSON serialization using circe.io
      "org.julienrf" %% "endpoints-algebra-circe" % "0.6.0",
      "com.typesafe.play" %% "play" % "2.6.15",
      "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
      "com.softwaremill.macwire" %% "macros" % "2.3.1" % "provided",
      // server based on play framework
      "org.julienrf" %% "endpoints-play-server" % "0.6.0",
      // JSON serialization using circe.io
      "org.julienrf" %% "endpoints-play-server-circe" % "0.6.0"
    )
  )

  

}
