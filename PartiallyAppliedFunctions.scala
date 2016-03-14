import Console._

def accept(a:Int,b:Int) = a + b

def  acceptClone = accept _

def acceptFirstDefault = accept(10,_:Int)

println(acceptFirstDefault(7))

println(acceptClone(10,20))

println(accept(10,20))