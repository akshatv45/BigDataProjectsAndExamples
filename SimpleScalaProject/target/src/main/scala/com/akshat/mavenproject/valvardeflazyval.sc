val volume = 1000 //val creates a value variable
  //var creates a variable
volume
println(s"Volume is : $volume")

def volume:Int =1000 //def is used to specify a method
def stockPrice =79

def finalValue = volume*stockPrice

finalValue //finalValue is not evaluated until it is explicitly called and has to return value at run time , this is known as lazy evaluation

lazy val lazyFaceValue = 5 //immutable


lazyFaceValue
