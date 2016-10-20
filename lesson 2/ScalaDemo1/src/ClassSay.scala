/**
  * Created by Jax on 2016/10/19.
  */
class ClassSay(m : Any) {
  val STR = "Say Demo 常量 STR"

//  def ClassSay()
  val SAY:Any = {
  m match {
    case i: Int => println("say int")
    case d: Double => println("say Double")
    case _ => println("what's this")
  }
}


  def say(m:Int): String={
    (m + 0.1).toString
  }

}
