import Console._

val doubleTheInputIfOnlyEven : PartialFunction[Int,Int] = new PartialFunction[Int,Int] {
	def isDefinedAt(x:Int) = x % 2 == 0
	def apply(x:Int) = x * 2
}
val tripleTheInputIfOnlyOdd : PartialFunction[Int,Int] = new PartialFunction[Int,Int] {
	def isDefinedAt(x:Int) = x % 2 != 0
	def apply(x:Int) = x * 3
}
val addFive = (x: Int) => x + 5

def doIt(i:Int) = {
	print(i+"..")
	doubleTheInputIfOnlyEven orElse tripleTheInputIfOnlyOdd andThen addFive
}

println(doIt(2)(2))


val div : PartialFunction[(Int,Int),Int]={
	case (x,y) if(y!=0) => x / y 	
}
val multiple : PartialFunction[(Int,Int),Int]={
	case (x,y) => x * y 	
}

val mathFun = div orElse multiple

println(mathFun(2,0))
println(mathFun(2,2))

// PrtialFunction Any , Unit
def parti : PartialFunction[Any,Unit]= {
	case n:Int => println(n)
	case unexpected => println("Nothing")
}
parti(2)

