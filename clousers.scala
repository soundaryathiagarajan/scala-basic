	
def inc()={
	var incrementer = 100
	def closure = {
  		x: Int => x + incrementer
	}
	closure
}

println(inc()(3))

def inc1(y:Int)={	
	def closure = {
  		x: Int => x + y
	}
	closure
}

println(inc1(3)(3))

//Currying
def inc2(y:Int)(x:Int)={		
  		x + y	
}
def process(x:Int,f:Int=>Int)={
	f(x)
}
println(process(2,inc2(3)))
