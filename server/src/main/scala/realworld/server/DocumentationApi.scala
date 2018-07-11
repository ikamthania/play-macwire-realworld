package realworld.server

import endpoints.openapi.model.OpenApi
import endpoints.play.server.circe.JsonEntities
import endpoints.play.server.{Assets, Endpoints, PlayComponents}

class DocumentationApi(protected val playComponents: PlayComponents) extends Endpoints with JsonEntities with Assets{

  val documentation  = endpoint(get(path / "documentation.json"), jsonResponse[OpenApi]())

  lazy val digests = AssetsD

}
