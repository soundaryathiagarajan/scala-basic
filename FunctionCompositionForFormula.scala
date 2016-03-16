/* (a+b)^2 = a^2 + b^2 + 2ab */
import Console._

def lhs(a:Int,b:Int)={
	math.pow(a+b,2)
}
def rhs(a:Int,b:Int)={
	power(a) + power(b) + (2 * a * b)
}

def power(a:Int) = math.pow(a,2)
println(lhs(2,2))
println(rhs(2,2))