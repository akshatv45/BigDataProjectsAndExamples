val anArray = Array(1,2,3)

anArray match {
  case Array(first, second, third) => println("second=" + second)
}

//to remove unused variable declarations, we can use _
anArray match {
  case Array(first, _, _) => println("first=" + first)
}

//tuples and pattern matching using tuples
//tuples are collections like array but they can store objects of different types inside them
val aTuple = ("USD", 100)

aTuple match {
  case (currency, amount) if currency == "USD" => println("USD " + amount)
  case (currency, amount) if currency == "NZD" => println("USD " + amount * (1/1.50))
}