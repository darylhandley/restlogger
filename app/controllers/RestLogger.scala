package controllers

import java.util.Calendar

import play.Logger
import play.api.libs.json.Json
import play.api.mvc._

object RestLogger extends Controller {

  // some old code, probably donn't need it but keep around for now.
//  def index (path : String) = Action { implicit request =>
//
//    Logger.info(path)
//    Logger.info("=" * 80)
//    Logger.info("Method is " + request.method)
//    Logger.info(request.queryString.toString())
//    // Ok(views.html.index("Your new application is ready."))
//    val textBody: Option[String] = request.body.asText
//    // Logger.info("Query String is " + request.getQueryString.getOrElse(""))
//    request.headers.toSimpleMap.foreach(header =>
//      println(header._1 + ": " + header._2)
//    )
//    Logger.info("Request body is : \n" + textBody.getOrElse("No body found"))
//    request.body.asJson match {
//      case None => Logger.info("No JSON BODY")
//      case Some(jsonValue) => Logger.info(jsonValue.toString())
//    }
//
//    Logger.info("rawBody" + request.body.asRaw)
//
//    Ok("success")
//  }

  // TODO: does not currently support get since GET has no body
  // TODO: should add another method for GET probably and possibly DELETE
  def postMethod (path : String) = Action(parse.json) { request =>

    val now = Calendar.getInstance().getTime()
    val sep = "-" * 50
    val output =
        sep + "\n" +
        now + " " + " - " + request.method + " /" + path + "\n" +
        Json.prettyPrint(request.body) +  "\n" +
        sep + "\n"
    println(output)

    Ok("success")
  }

  def getMethod (path : String) = Action { request =>

    val now = Calendar.getInstance().getTime()
    val sep = "-" * 50

    var params = ""
    request.queryString.foreach(mapItem => {
      params += mapItem._1 + "=" + mapItem._2.mkString(",") + "\n"
    })

    val output =
      sep + "\n" +
        now + " " + " - " + request.method + " /" + path + "\n" +
        params +
        sep + "\n"
    println(output)

    Ok("success")
  }

}