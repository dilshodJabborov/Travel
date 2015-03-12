package models

/**
 * Created by Dilshod on 12.03.2015.
 */
case class Ride(id: Int,name: String,fromCity: String,toCity: String,smoking: Boolean,cost:Float);
object Ride {
  var rides = List(Ride(1,"Liza","London","Manchester",false,12),
    Ride(1,"Sarah","London","Manchester",false,11),
    Ride(2,"James","New Castle","London",true,22),
    Ride(3,"Henderson","London","Manchester",false,15),
    Ride(4,"Alex","London","Manchester",true,12)
  )
  def findAll = rides.sortBy(_.id)
  def findById(fromCity: String,toCity:String) = rides.filter(_.fromCity == fromCity).toList
}
