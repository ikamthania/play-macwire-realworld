package realworld.server

import endpoints.play.server.{Endpoints, JsonEntitiesFromCodec, PlayComponents}
import play.api.routing.Router.Routes
import realworld.shared.{UserResponse, UsersEndpoints}

class UsersApi(protected val playComponents: PlayComponents) extends UsersEndpoints with Endpoints with JsonEntitiesFromCodec {

  val routes: Routes = routesFromEndpoints(
    userLogin.implementedBy(e => UserResponse("user created"))
  )

}
