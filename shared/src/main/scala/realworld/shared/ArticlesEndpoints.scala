package realworld.shared

import endpoints.algebra.Endpoints
import endpoints.algebra.circe.JsonEntitiesFromCodec
import io.circe.generic.JsonCodec

trait ArticlesEndpoints extends Endpoints with JsonEntitiesFromCodec {

  val firstBlood = endpoint(get(path / "first"), jsonResponse[Test](docs= Some("Testing the first blod")))

}

@JsonCodec
case class Test(value: String)
