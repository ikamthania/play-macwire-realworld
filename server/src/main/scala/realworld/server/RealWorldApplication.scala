package realworld.server

import endpoints.play.server.{DefaultPlayComponents, HttpServer}
import play.core.server.ServerConfig

object RealWorldApplication extends App {

  val config = ServerConfig(port = Some(9000))
  val playComponents = new DefaultPlayComponents(config)
  val articlesApi = new ArticlesApi(playComponents)
  val usersApi = new UsersApi(playComponents)
  HttpServer(config, playComponents, articlesApi.routes orElse usersApi.routes)
}