object TupelSample{
	def main(args:Array[String])={
		def tuple(x1:Any,x2:Any,x3:Any) = (x1, x2, x3)

		val (a,b,c) = tuple("0X23","PI",3.14)

		println(a +"\n "+b +"\n "+c)
	}
}