abstract class MethodParent{
	def add(i:Int,j:Int):Int
	
	def sub(i:Int,j:Int):Int = {
		add(i,-(j))
	}
}
class MethodChild extends MethodParent{
	def method(i:Int,j:Int):Int= {
		i+j
	}
}
object MainApp{
	def main(args:Array[String]){
		val m =new MethodChild()
		println(m.method(1,2))
	}
}