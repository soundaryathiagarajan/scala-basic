import java.io._
package abstractsample{
	package readersample{
		abstract class BulkReader{
			type In
			val source : In
			def read : String
		}
		class StringReader(val source:String) extends BulkReader{
			type In =String
			def read = source
		}	
		class FileBulkReader(val source: File) extends BulkReader {			
			type In = File
			def read = {
				val in = new BufferedInputStream(new FileInputStream(source))
				val numBytes = in.available()
				val bytes = new Array[Byte](numBytes)
				in.read(bytes, 0, numBytes)
				new String(bytes)
			}
		}
		object ReaderMain{
			def main(args:Array[String])={
				val strReader = new StringReader("Welcome to scala abstract type")
				println(strReader.read)
				//println( new FileBulkReader(new File("test.scala")).read )
			}
		}		
	}
}
/**
 scalac AbstactSample.scala
 scala abstractsample.readersample.ReaderMain
*/