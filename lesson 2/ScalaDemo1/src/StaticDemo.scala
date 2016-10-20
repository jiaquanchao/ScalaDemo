/**
  * Created by Jax on 2016/10/19.
  */
object StaticDemo {

  def bigger(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case text: String => text + "s"
    }
  }

  def main(args: Array[String]) {
    HelloWorld.say()
    println(bigger(66))
    println(bigger(66.0))
    println(bigger("text"))

//    var csG = new ClassSay(7)
    var csI = new ClassSay(7)

    var csD = new ClassSay(7.0)
    var csS = new ClassSay("jjj")



    var cs = new ClassSay()
    println(cs.say(9))
  }

}
