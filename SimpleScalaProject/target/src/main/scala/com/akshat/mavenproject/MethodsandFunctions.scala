package com.akshat.mavenproject

object MethodsandFunctions extends App{
  val data = Array("PS","MSFT","GOOG","AAPL","TSLA")

  //def getNumRowsMethod() : Int = data.length
  def getNumRowsMethod : Int = data.length //empty paran method
  //converting a method to a function
  val NumRowsFunction = getNumRowsMethod _
  val getNumRowsFunction = () => data.length

  println("Total number of rows(method): " + getNumRowsMethod)
  //a method in Scala is defined using def keyword. Its a  part of a class, it has a name, signature, some annotations and bytecode
  println("Total number of rows(function): " + getNumRowsFunction)
  println("Total number of rows(function): " + getNumRowsFunction())

  //a function is a complete object  by itself, an instance of a class which implements traits contains its own methods
  println(getNumRowsMethod.getClass) //returns - int
  println(getNumRowsFunction.getClass) // returns - class com.akshat.mavenproject.MethodsandFunctions$$anonfun$1
  println(getNumRowsFunction.apply())

  println(getNumRowsFunction.isInstanceOf[Function0[_]])// returns - true


  //converting a method to a function
  println("Total number of rows (function): " + NumRowsFunction())
}

/*
akshatverma@Akshats-MacBook-Pro mavenproject % javap MethodsandFunctions$.class
Compiled from "MethodsandFunctions.scala"
public final class com.akshat.mavenproject.MethodsandFunctions$ implements scala.App {
  public static final com.akshat.mavenproject.MethodsandFunctions$ MODULE$;
  public static {};
  public long executionStart();
  public java.lang.String[] scala$App$$_args();
  public void scala$App$$_args_$eq(java.lang.String[]);
  public scala.collection.mutable.ListBuffer<scala.Function0<scala.runtime.BoxedUnit>> scala$App$$initCode();
  public void scala$App$_setter_$executionStart_$eq(long);
  public void scala$App$_setter_$scala$App$$initCode_$eq(scala.collection.mutable.ListBuffer);
  public java.lang.String[] args();
  public void delayedInit(scala.Function0<scala.runtime.BoxedUnit>);
  public void main(java.lang.String[]);
  public java.lang.String[] data();
  //from below we can see that the method is implemented with a return type int and is associated with the class MethodsandFunctions
  //whereas the functions are instances of the Function0 trait, they are not taking in any arguments as input but are returning some kind of an object as the output
  public int getNumRowsMethod();
  public scala.Function0<java.lang.Object> NumRowsFunction();
  public scala.Function0<java.lang.Object> getNumRowsFunction();
  public final void delayedEndpoint$com$akshat$mavenproject$MethodsandFunctions$1();
}
*/