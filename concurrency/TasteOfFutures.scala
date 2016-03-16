// src/main/scala/progscala2/typelessdomore/futures.sc
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

def sleep(millis: Long) = {
  Thread.sleep(millis)
}

// Busy work ;)
def doWork(index: Int) = {
  sleep((math.random * 1000).toLong)
  index
}

(1 to 5) foreach { index =>
  val future = Future (doWork(index))(executor)
  future onSuccess (case answer: Int => println(s"Success! returned: $answer")
  )
  future onFailure {
    case th: Throwable => println(s"FAILURE! returned: $th")
  }
}

sleep(1000)  // Wait long enough for the "work" to finish.
println("Finito!")

/*
The below code is the Future doc,
apply[T](body: => T)(implicit executor: ExecutionContext): Future[T]

which expect executor as the second parameter list, 
But we have not passed it from the code.
It has been imported as implicit via 

import scala.concurrent.ExecutionContext.Implicits.global
Even onsucess partial function expect executor.

How import Implicits.global is defined?
object Implicits {
implicit val global: ExecutionContextExecutor =
impl.ExecutionContextImpl.fromExecutor(null: Executor)
}

This all happening during the run time
*/