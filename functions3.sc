def logTransactions(
                   amount: Double,
                   debit: Boolean = true,
                   currency: String = "USD"
                   ) = {
  val symbol = if(debit) "_" else "+"
  println(symbol+currency+amount)
}

logTransactions(100.25)
logTransactions(232.67, false, "INR")