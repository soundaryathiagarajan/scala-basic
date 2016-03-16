
def findName(i:Any) ={
	i match {
		case i:Int => "Int"
		case i:String => "String"
		case _ => "Any"
	}
}

println(findName(10))
println(findName("Ranjth"))
println(findName(9.0))