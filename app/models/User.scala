package models

/**
 * Created by Dilshod on 24.03.2015.
 */
import play.api.db.slick.Config.driver.simple._

case class User(id: Option[Int],
                 firstName: String,
                 lastName: String,
                 gender: String,
                 eMail: String,
                 password: String,
                 birthYear: String)


class UsersTable(tag: Tag) extends Table[User](tag, "Users") {

  def userId = column[Int]("Userid", O.PrimaryKey, O.AutoInc)

  def firstName = column[String]("firstName", O.Default(""))

  def laststName = column[String]("lasttName", O.Default(""))

  def gender = column[String]("gender", O.Default(""))

  def eMail = column[String]("eMail", O.Default(""))

  def password = column[String]("password", O.Default(""))

  def birthYear = column[String]("birthYear", O.Default(""))

  def * = (userId.?, firstName, laststName, gender, eMail, password, birthYear) <> (User.tupled, User.unapply _)

}

