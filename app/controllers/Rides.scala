package controllers

/**
 * Created by Dilshod on 24.03.2015.
 */
import play.api.mvc._
import models.Ride

class Rides extends Controller{
  def list() = Action {
    implicit request =>
      val formParams = request.body.asFormUrlEncoded
      val fromCity = formParams.get("fromCity")(0)
      val toCity = formParams.get("toCity")(0)
      Ok(views.html.list(Ride.findByParams(fromCity,toCity)))
  }
  def registr() = Action {
    Ok(views.html.offerSeats("Offer a ride and cover your motoring costs | Step 1 | sayohat.heroku.com"))
  }
}
