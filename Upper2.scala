object Upper {
	def main(args: Array[String]) = {
		//args.map(_.toUpperCase()).foreach(printf("%s ",_))		
		val test = Array[String]("A","B","CD")	
		print(test.map(_.toUpperCase()).mkString(" "))
	}
}