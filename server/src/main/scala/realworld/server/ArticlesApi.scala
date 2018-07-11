package realworld.server

import endpoints.play.server.{Endpoints, JsonEntitiesFromCodec, PlayComponents}
import play.api.routing.Router.Routes
import realworld.shared.{ArticlesEndpoints, Test}

class ArticlesApi(protected val playComponents: PlayComponents) extends ArticlesEndpoints with Endpoints with JsonEntitiesFromCodec {

  val routes: Routes = routesFromEndpoints(
    firstBlood.implementedBy(_ => Test("Adding endpoints")))
  Test("Adding endpoints")

}
