import Console._

def math(f:(Int,Int) => Int,x:Int,y:Int):Int={
	f(x,y)
}


//OtherWay
val fun1 = new Function1[Int,Int] {
	def apply(x:Int) = x + x
}

//val result = math((x:Int,y:Int)=>x + y , 10 ,20)
val result = fun1(20)

println(result)


