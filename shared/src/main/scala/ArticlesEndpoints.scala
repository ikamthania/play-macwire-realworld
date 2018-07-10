import endpoints.algebra.Endpoints
import endpoints.algebra.circe.JsonEntitiesFromCodec
import io.circe.generic.JsonCodec

trait ArticlesEndpoints extends Endpoints with JsonEntitiesFromCodec {

  val firstBlood = endpoint(get(path / "chacha"), jsonResponse[Test]())

}

@JsonCodec
case class Test(value: String)
