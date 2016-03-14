import java.io._

package abstractsample{
	package otherway{
		abstract class BulkReader[In] {
			val source: In
			def read = String
		}
		class StringBulkReader(val source: String) extends BulkReader[String]{			
			def read = source
		}
		class FileBulkReader(val source: File) extends BulkReader[File] {			
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