val amounts = Array(10, 20, 34, 23, 12)
val currencies = Array("INR", "USD")

val value1 :  Array[String] = for {
  currency <- currencies
  amount <- amounts
} yield currency + " " + amount
//difference between generator placement in the two for loops is clearly visible
val value2 :  Array[String] = for {
  amount <- amounts
  currency <- currencies
  if amount > 20 //we can use conditionals here as well, these are known as guards
} yield currency + " " + amount


//foreach is a statement in scala
amounts.foreach(amount => println(amount*100))