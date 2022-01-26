package com.akshat.mavenproject

object defkeyword {
  def main(args: Array[String]): Unit = {
    def stockPrice:Int={
      println("returning stock price value")
      14
    }
    def volume = {
      println("returning volumne")
      1000
    }

    def finalValue: Int = stockPrice*volume
    println(s"The final value is: $finalValue")
  println("----------------------------")

  def finalValueAgain: Int = stockPrice*volume
  println(s"The final value is: $finalValueAgain")

  /*
  * The output is
  * returning stock price value
  * returning volumne
  * The final value is: 14000
  * ----------------------------
  * returning stock price value
  * returning volumne
  * The final value is: 14000
  * This means that the methods defined by def keyword are invoked at the time of their call/invocation
  * */

    def data : Array[String] = {
      println("Array is initialized");
      Array("MSFT","GOOGL","TM")
    }

    println("Before Accessing Data")
    data.foreach(println)

    println("----------------------")
    data.foreach(println)

    /*
    * Before Accessing Data
    * Array is initialized
    * MSFT
    * GOOGL
    * TM
    * ----------------------
    * Array is initialized
    * MSFT
    * GOOGL
    * TM
    * So this proves that the methods are evaluated only when they are invoked and not when they are declared
    * */
  }
}
