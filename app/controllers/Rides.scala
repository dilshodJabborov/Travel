package controllers

import play.api.mvc._
import models.Ride

/**
 * Created by Dilshod on 12.03.2015.
 */
object Rides extends Controller{
  def list() = Action {
    implicit request =>
      val formParams = request.body.asFormUrlEncoded
      val fromCity = formParams.get("fromCity")(0)
      val toCity = formParams.get("toCity")(0)
      Ok(views.html.list(Ride.findByParams(fromCity,toCity)))
  }
}
