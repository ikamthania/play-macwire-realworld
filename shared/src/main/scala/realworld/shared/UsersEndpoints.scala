package realworld.shared

import endpoints.algebra.Endpoints
import endpoints.algebra.circe.JsonEntitiesFromCodec
import io.circe.generic.JsonCodec


trait UsersEndpoints extends Endpoints with JsonEntitiesFromCodec {

  val userLogin = endpoint(post(path / "users" / "login", jsonRequest[User](docs = Some("The user json"))), jsonResponse[UserResponse](docs = Some("Api for user login")))

}

@JsonCodec
case class User(username: String, password: String, email: String)

@JsonCodec
case class UserResponse(status: String)

