
/*package utilities

import play.api.libs.json.Json
import upickle.Api

trait Mocker {
  val mockdataLocation: String = "server/src/main/scala/mockdata"

  def getMockWalletTokenListResponse(responseType: String): Seq[MockCaseClass] = {
    try {
      val mock = scala.io.Source.fromFile(s"${mockdataLocation}/${responseType}.json", "utf-8").mkString
      Json.parse(mock).validate[Seq[MockCaseClass]]
        .asEither match {
        case Left(err) =>
          //            log.error(s"Error in parsing content for $responseType : ${err}")
          Nil
        case Right(res) =>
          res
      }
    } catch {
      case e: Exception =>
        // log.error(s"Error in loading mock file at ${mockdataLocation}/${responseType}.json")
        Nil
    }
  }

}*/
