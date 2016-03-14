def a2(i:Int)={
	def b2(j:Int)={
		i+j
	}
	return b2
}

val a = a2(10)(100)
print(a)