import endpoints.play.server.{ Endpoints, JsonEntitiesFromCodec, PlayComponents }

class BootstrapEndpoints(protected val playComponents: PlayComponents) extends ArticlesEndpoints with Endpoints with JsonEntitiesFromCodec {

  val routes = routesFromEndpoints(
    firstBlood.implementedBy(_ => Test("Adding endpoints")))

}
