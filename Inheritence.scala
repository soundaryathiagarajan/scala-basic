class ParentGreetings(message: String){
   def greet = "Welcome "+message +" - Parent"
}

class ChildGreetings(message:String) extends ParentGreetings(message){
	override def greet = "Hi ! "+ message + " - Child"
}

println(new ParentGreetings("Ran").greet)
println(new ChildGreetings("Ran").greet)