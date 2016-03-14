class Upper{
	def upper(strings: String*): Seq[String] ={
		strings.map((s:String)=> s.toUpperCase())
	}
}

val u = new Upper
Console.println(u.upper("ranj","raj","amma"))

