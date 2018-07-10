
lazy val server = Server.server

lazy val sharedJs = Shared.sharedJs

lazy val sharedJvm = Shared.sharedJvm

// loads the Play server project at sbt startup
onLoad in Global ~= (_ andThen ("project server" :: _))


