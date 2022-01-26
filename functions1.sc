def mul(x : Int, y : Int) : Int = x * y

val n1 = mul(10, 20)

//method overloading!
def mul (nums : Int*) : Int = {
  var product = 1
  for(num <- nums) { product = num * product }
  product
}

val n2 = mul(10,20,30)
val n3 = mul(30,40)