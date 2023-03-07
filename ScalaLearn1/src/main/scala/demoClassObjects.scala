//Classes and Objects
//Access Levels in class - public - used anywhere/private - used in the class its defined
// protected - inherited class
 class Car{
   var topClassExtraCost = 0
   var roadTax = 100

  def cost(basicCost:Int) = basicCost + topClassExtraCost + roadTax
}

 class smallCar extends Car{
  println(roadTax)

 }
//method is defined in a class - while a function is defined anywhere outside the class
object demoClassObjects {

  def main(args:Array[String])={
   println("Hello classes and objects")
    var bmw = new Car
    println(bmw.roadTax)
    bmw.roadTax = 200
    println(bmw.cost(10000))

    var misc = new Car
    println(misc.roadTax)
  }


}
