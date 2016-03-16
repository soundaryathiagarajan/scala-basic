class Car(name:String){
	override def toString() = name
}

object Car{
	def apply(name:String) = new Car(name) 
}

val car = new Car("Ferrari");
println(car)

val car1 = Car("Audi")
println(car1)


/*  case class  with no type paramater is by default Singleton object*/