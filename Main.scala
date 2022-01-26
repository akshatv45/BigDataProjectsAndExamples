
object Main {
  def main(args: Array[String]): Unit = {
    val Array(code: String,value: String) = args(0).split("\\s")
    val valueDouble = value.toDouble
    if(!Set("NZD", "CAD").contains(code)) {
      println("Supported currencies are CAD, NZD")
      sys.exit()
    }
    //val utils: Utils = new Utils()
    val rate : Double = Utils.getRateFrom(code)
    println(args(0) + " USD = " + (rate*valueDouble))
  }
}

/*class Utils {
  private val CADtoUSD : Double = 1/1.30
  private val NZDtoUSD : Double = 1/1.50

  def getRateFrom(code: String) : Double = {
  println("getting rate from" + code)
    code match {
      case "NZD" => NZDtoUSD
      case "CAD" => CADtoUSD
    }*/
//instead of using class we can also use objects
object Utils {
  private val CADtoUSD : Double = 1/1.30
  private val NZDtoUSD : Double = 1/1.50

  def getRateFrom(code: String) : Double = {
    println("getting rate from" + code)
    code match {
      case "NZD" => NZDtoUSD
      case "CAD" => CADtoUSD
    }
  }
}
