/*def arith(f:(Int,Int)=>Int,i:Int,j:Int)={
	f(i,j)
}*/

/*val res = arith((i:Int,j:Int)=>i+j,10,20)*/

//def res = (i:Int,j:Int)=>i+j
//def res(i:Int,j:Int) = i+j

//Console.print(res(10,20))

var list = List(1,2,3,4,5)
println(list)
def e1 = (e:Int) => e+1
def e2(e:Int) = {e+1}
println(list.map(e1))

//expression evaluation

val i = 20
val i1 = (i:Int)=> i * i
def e3 = (i:Int)=> i * i

//print(e3(20))


