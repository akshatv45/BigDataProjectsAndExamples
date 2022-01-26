package com.akshat.mavenproject

object Var {
  def main(args: Array[String]): Unit = {
    var data = {
      println("New Array is initialized");
      Array("ABC","DEF","GHI")
    } //the expression block which we use to assign the data to our var is evaluated at the time of assignment before we access the var

    println("Before accessing data")
    data.foreach(println)

    println("---------------------")
    data.foreach(println)//when we access the data var second time, the reassignment is not done! New Array is initialized is not printed to screen now.

    println("---------------------2")
    data = {println("New array is initialized");Array("wfqev")}//here the reassignment is done!
    data.foreach(println)
  }

}
