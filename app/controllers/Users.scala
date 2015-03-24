package controllers

/**
 * Created by Dilshod on 24.03.2015.
 */
import play.api.mvc._
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import models._
import play.api.Logger
import scala.slick.lifted.TableQuery

class Users extends Controller{
  val users = TableQuery[UsersTable]
  def add = DBAction { implicit request =>
    val formParams = request.body.asFormUrlEncoded
    val firstName = formParams.get("firstName")(0)
    val lastName = formParams.get("lastName")(0)
    val gender = formParams.get("gender")(0)
    val eMail = formParams.get("eMail")(0)
    val password = formParams.get("password")(0)
    val birthYear = formParams.get("birthYear")(0)
    val UsersId = (users returning users.map(_.userId)) += User(None, firstName, lastName, gender, eMail, password, birthYear)
    Redirect(routes.Application.index())
  }
  def showAddon = Action {
    Ok(views.html.register())
  }
}
