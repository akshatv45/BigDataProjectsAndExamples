val amount = 100

amount match {
  case 50 => println("$50")
  case 100 => println("INR100")
  case _ => println("No match")
  //the _ is a wildcard which basically means, match everything
  //therefore this wild card should be placed at the end of the match statement always
  //otherwise the layers below the wildcard will get ignored
}

//instead of hardcoding the variables to value 50 and 100, we can also use a variable
amount match {
  case a => println("The amount is " +  a)
}
//there is a problem but, this second pattern match will match everything as can be seen.
//to avoid this problem we need to use guards

amount match {
  case a if a >= 50 && a < 100 => println("bill is >= 50, it's " + a)
  //if we do not specify less than 100 in the guard condition, our next case will never get evaluated at all
  case a if a == 100 => println("it's a " + a + " bill")
}

//Note: Patterns are also expressions
val result: Unit = amount match {
  case a if a >= 50 && a < 100 => println("bill is >= 50, it's " + a)
  case a if a == 100 => println("it's a " + a + " bill")
}

val result2: String = amount match {
  case a if a >= 50 && a < 100 => "bill is >= 50, it's " + a
  case a if a == 100 => "it's a " + a + " bill"
}


