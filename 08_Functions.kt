package Kotlin

import kotlin.time.times

// Functions:
// kotlin functions are decclared using fun keyword
fun double(x: Int): Int {
    return 2 * x
}

// Parameters:
// Function parameters are defined using Pascal notation - name: type.
// Parameters are separated using commas, and each parameter must be explicitly typed:

fun powerOf(n: Int,
            e: Int,  //trailing comma
): Int {
    return (n*n)
}

fun read(b: ByteArray,
         off: Int = 0, // default value set by adding equal to the Type.
         len: Int = b.size,
         ) {
}


open class A{
    open fun foo(p: Int = 10){
        //
    }
}
class B: A(){
    override fun foo(p:Int){ // No default Value is allowed.
        //
    }
}

fun piyush(
    bar: Int = 10,
    baz: Int,
) {
}


fun proof(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit,
){}


fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
): String {
    val p = wordSeparator
    return p.toString()
}

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
}

fun doom(vararg str: String){
    //
}

//Single Expression functions
// fun doubleK(k: Int): Int = k * 2
// fun doubleP(k: Int) = k * 2 //Compiler can infer explicitly.


//var args
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

//infix fun Int.shl(x: Int): Int { }


// Note that infix functions always require both the receiver and the parameter to be specified. When you're calling a method on the current receiver using the infix notation, use this explicitly. This is required to ensure unambiguous parsing.

 class MyStringCollection {
    infix fun add(s: String) { /*...*/ }

    fun build() {
        this add "abc"   // Correct
        add("abc")       // Correct
        //add "abc"        // Incorrect: the receiver must be specified
    }
}
fun main(){

    // Functions are called using standard approach.
    // val p = double(5)
    // print(p)

    // val res = powerOf(5, 0)
    // println(res)

    // Calling Member function uses dot notation.
    // Stream().read() // Create instance of class Stream and call read().

    // piyush(baz = 1) //the default value bar  = 0 is used and the baz = 1 is the user entered value.

    // proof(1) { println("hello") }     // Uses the default value baz = 1
    // proof(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1
    // proof{ println("hello") }  // Uses both default values bar = 0 and baz = 1


    // reformat(
    //        "String!",
    //        false,
    //        upperCaseFirstLetter = false,
    //        divideByCamelHumps = true,
    //        '_'
    //    )
    // val p =  reformat("Hello")
    // println(p)
    //doom(str = *arrayOf("a", "b", "c"))
    // printHello("Piiyush")


    //     val list1 = asList(1, 2, 3) //variable no. of args
    //    println(list1)
    //
    //    val a = arrayOf(1, 2, 3)
    //    val list = asList(-1, 0, *a, 4)
    //    println(list)
    //
    //    val an = intArrayOf(1, 2, 3) // IntArray is a primitive type array
    //    val list2 = asList(-1, 0, *an.toTypedArray(), 4)
    //    println(list2)

    //   // calling the function using the infix notation
    //    1 shl 2
    //
    //// is the same as
    //    1.shl(2)

    // Infix function calls have lower precedence than arithmetic operators, type casts, and the rangeTo operator. The following expressions are equivalent:
    //
    //1 shl 2 + 3 is equivalent to 1 shl (2 + 3)
    //
    //0 until n * 2 is equivalent to 0 until (n * 2)
    //
    //xs union ys as Set<*> is equivalent to xs union (ys as Set<*>)
    //
    //On the other hand, an infix function call's precedence is higher than that of the boolean operators && and ||, is- and in-checks, and some other operators. These expressions are equivalent as well:
    //
    //a && b xor c is equivalent to a && (b xor c)
    //
    //a xor b in c is equivalent to (a xor b) in c


}