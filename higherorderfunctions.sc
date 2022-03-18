//higherorder functions and map, filter,reduce function difference
def transform(f: Int => Int, nums : Int*) = nums.map(f)

transform(n => n*n, 1,2,3,4,5)
transform(x => x*2, 1,2,3,4,5)

val numbers = Array(1,2,3,4,5,6,7,8,9)
numbers.map(num => num*2)
numbers.filter(num => num % 2 ==0)
numbers.filter(num => num % 2 == 1)
numbers.reduce((x,y) => x+y)
