import javax.print.attribute.standard.PrinterLocation

/**
  * Created by Jax on 2016/10/19.
  */
object ListDemo {

  def main(args: Array[String]) {
    val L = List(1, 2, 3)
    val L1 = List(4, L)
    println(L1)

    val T = (("jack", 1),("mass", 2))
    println(T)
    println(T._1._1)

    val S = Set(1, 2, 3, 3)
    println(S)

    val M = Map(("j", 1), ("b", 2))
    println(M.isDefinedAt(key = "j"))
  }

}
