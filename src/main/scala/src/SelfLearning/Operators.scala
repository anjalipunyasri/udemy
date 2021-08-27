package src.SelfLearning

object Operators extends App {
  //Main method
    //operands
    var a= 10; var b= 4; var c = true; var d=false; var result=0

    //Arithmetic Operators are + - * / %
    println("Addition is : "+ (a + b))
    println("Substraction is :"+(a - b))
    println("Multiplication is :"+ (a * b))
    println("Division is :"+ (a / b))
    println("Modulus is :"+ (a % b))


    //Relational operators are == != > < >= <=
    println("Equality of a == b is : "+ (a == b))
    println("not equals of a != b is :"+(a != b))
    println("Greater than of a>b is :"+(a > b))
    println("Lesser than of a<b is :"+(a < b))
    println("Greater than or equal to a >= b is :"+(a >= b))
    println("Lesser than or equal to a <= b is:"+(a <= b))

    //Logical operators are && || !
    println("Logical AND od c && d is:"+(c && d))
    println("Logical OR of c || d is:"+(c || d))
    println("Logical NOT of !(c && d) is :"+ !(c && d))


    //Bitwise operators are & | ^ << >> ~ >>>
    result = a & b
    println("Bitwise AND is:" + result)
    result = a | b
    println("Bitwise OR is:" + result)
    result = a ^ b
    println("Bitwise XOR is:" + result)
    result = ~a
    println("Bitwise once complement is:" + result)
    result = a << 3
    println("Bitwise left shit is:" + result)
    result = a >> 3
    println("Bitwise right shift is:" + result)


    //Assignment operators are = += -= *= /= %= **= <<= >>= &= ^= |=
    result = a + b
    println("simple addition is :" + result)
    result += a
    println("Add and assignment is:" + result)
    result -= a
    println("Substract and assignment is:" + result)
    result *= a
    println("Multiplication And assignment is:" + result)
    result /= a
    println("Division And assignment is:" + result)
    result %= a
    println("Modulus And assignment is:" + result)
    result <<= 3
    println("Left shift And assignment is:" + result)
    result >>= 3
    println("Right shift And assignment is:" + result)
    result &= a
    println("Bitwise And assignment is:" + result)
    result ^= a
    println("Bitwise XOR And assignment is:" + result)
    result |= a
    println("Bitwise OR And assignment  is:" + result)

}
