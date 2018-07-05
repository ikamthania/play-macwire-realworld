import play.sbt.{PlayLayoutPlugin, PlayScala}
import sbt.Keys._

import sbt._

object Server {

  lazy val server = (project in file("server"))
    .enablePlugins(PlayScala)
    .disablePlugins(PlayLayoutPlugin) // use the standard directory layout instead of Play's custom
    .settings(
    name := """play-macwire-realworld""",

    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.6",

    libraryDependencies ++= Seq("org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
      "com.softwaremill.macwire" %% "macros" % "2.3.1" % "provided",
      "com.lihaoyi" %% "upickle" % "0.6.6"
    )
  )

}
