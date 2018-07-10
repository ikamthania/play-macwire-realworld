import sbt.Keys._
import sbt._

object Server {

  lazy val server = (project in file("server"))
    .dependsOn(Shared.sharedJvm)
    .settings(
    libraryDependencies ++= AppSettings.jvmDependencies.value
  )

}
