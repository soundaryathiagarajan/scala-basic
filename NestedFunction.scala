def a(i:Int)={
	if (i > 0) 
	(j:Int)=>i * j
}
val b={
	//if (i > 0) This condition check is not possible with function
	(j:Int)=>i * j
}
Console.println(a(10)) 
//a() is not going to return any function when it has negative value
Console.println(a(-10))

Console.println(b(10)) 
//a() is not going to return any function when it has negative value
Console.println(b(-10))

