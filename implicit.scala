 

//val i: Int = 3.5

//implicit def defaultValue(x:Double) =  0

implicit def doubleToInt(x: Double) = x.toInt

val i: Int = 3.5
println(i)