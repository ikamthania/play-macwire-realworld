import play.core.server.ServerConfig
import endpoints.play.server.{ DefaultPlayComponents, HttpServer }

object RealWorldApplication extends App {
  val config = ServerConfig(port = Some(9000))
  val playComponents = new DefaultPlayComponents(config)
  val bootstrapEndpoints = new BootstrapEndpoints(playComponents)
  HttpServer(config, playComponents, bootstrapEndpoints.routes)
}