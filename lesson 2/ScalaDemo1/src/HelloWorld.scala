/**
  * Created by Jax on 2016/10/19.
  */
object HelloWorld {
  def main (args: Array[String]) {
    def say() = "Hello"
    println(say())

    def addOne(m:Int)= m + 1
    println(addOne(1))
  }

  def say(): Unit = {
    println("调用了HelloWorld.")
  }

  val cal = new Calculator(1, "t")
  val cal1 = new Calculator(2, "t")
  val cal2 = new Calculator(1, "a")
  case class Calculator(m: Int, n: String)

}

