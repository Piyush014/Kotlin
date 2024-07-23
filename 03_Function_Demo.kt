// A function with two int parameters and Int return type.
fun fun1(a: Int, b: Int): Int {
    return a + b
}

// It shows that the function body can be an expression.
fun fun2(a: Int, b:Int) = a + b

// Function that prints no meaningful values
//fun printSum(a: Int, b: Int): Unit {
//println("sum of $a and $b is ${a + b}")
//}

//Unit return type can be omitted:
fun printSum2(p: Int, q: Int): Int {
    val res = p + q
    return res
}


fun main() {
    val a: Int = 10
    val b: Int = 20
    val p: Int = 50
    val q: Int = 60
    val c: Int
    val d:Int
    val e: Int
    val f:Int
    c = fun1(a, b)
    println("The Sum of two Numbers using Fun1 = $c")
    d = fun2(p, q)
    println("The Sum of two Numbers using Fun1 = $d")
    // Using the Unit it will not return useful values
    f = printSum2(p, q)
    println("The Sum of two Numbers using printSum2 = $f")
}