//Program to demonstrate Functions
object Add {

  def main(args: Array[String]): Unit = {
    val a = 10
    val b = 20
    var res = add(a,b)
    println(res)
  }

  def add(a:Int,b:Int) = {
    var c = a + b
    c
  }

//  def addA(a: Int, b: Int) = {
//    var c = a + b
//    return c
//  }

  //if you specify return keyword its mandatory to specify return type

  def addB(a:Int,b:Int) = a+b
}
