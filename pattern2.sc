//pattern matching on types
abstract class Currency
case class USD() extends Currency
case class NZD() extends Currency
case class INR() extends Currency

val currency: Currency = NZD()
val amount = 100

currency match {
  case u: USD => println("USD " + amount)
  case n: NZD => println("USD " + amount * (1/1.50))
  case i: INR => println("USD " + amount * (1/70.0))
}