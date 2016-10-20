/**
  * Created by Jax on 2016/10/19.
  */
class Calculator(m: Int, n: String) {

  val calm = {
    m match {
      case 1 => println(m)
      case _ => println("others")
    }
  }
  val caln = {
    n match {
      case _ if n == "a" => println(n)
      case _ => println("others")
    }
  }

}
