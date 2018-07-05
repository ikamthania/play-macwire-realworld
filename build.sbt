
lazy val server = Server.server

// loads the Play server project at sbt startup
onLoad in Global ~= (_ andThen ("project server" :: _))


