fun main() {

    // 1. Numbers

    // Integer types: Byte, short, Int, Long.

    // When you initialize a variable with no explicit type specification, the compiler automatically infers the type with the smallest range enough to represent the value starting from Int.
    //If it is not exceeding the range of Int, the type is Int. If it exceeds, the type is Long.
    val one = 1 //Int
    val threeBillion = 3000000000 //Long

    //Explicit type specification triggers the compiler to check the value not to exceed the range of the specified type.
    val oneLong = 1L // Long
    val oneByte: Byte  = 1 // Byte

    //Unsigned Integer types: UByte,  UShort, UInt, ULong.
    //u and U tags are for unsigned Literals.
    //The exact type is determined based on the expected type.

    //If no expected type is provided, compiler will use UInt or ULong depending on the size of literal:

    val b: UByte = 1u // UByte, expected type provided
    val s: UShort = 1u //UShort, expected type provided
    val l: ULong = 1u //ULong, expected type provided

    // no expected type provided, constant fits in UInt
    val a1 = 42u //UInt


    // no expected type provided, constant doesn't fit in UInt
    val a2 = 1UL //ULong

    //uL and UL explicitly tag literal as unsigned long:
    val a = 1UL // ULong
    // even though no expected type provided and constant fits into UInt

    //Floating Point Types: Float, Double
    //For variables initialized with fractional numbers, the compiler infers the Double type:
    val pi = 3.14

    // val one:Double = 1 //Error type Mismatch
    // val oneDouble = 1.0-// Double

    // To explicitly specify the Float type for a value, add the suffix f or F.
    //If such a value contains more than 6-7 decimal digits, it will be rounded:

    val num = 2.7812552f //Float
    //Unlike some other languages, there are no implicit widening conversions for numbers in Kotlin.
    //For example, a function with a Double parameter can be called only on Double values, but not Float, Int

    // Literal Constants for numbers
    // There are the following kinds of literal constants for integral values:
    //Decimals: 123
    //Longs are tagged by a capital L: 123L
    //Hexadecimals: 0x0F
    //Binaries: 0b00001011
    // Octal literals are not supported in Kotlin


    // Underscores can be used to make number constants more readable:
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val hexBytes = 0xFF_EC_DE_5E


    //Numbers representation on the JVM﻿
    //On the JVM platform, numbers are stored as primitive types: int, double, and so on.
    //Exceptions are cases when you create a nullable number reference such as Int? or use generics.
    //In these cases numbers are boxed in Java classes Integer, Double, and so on.
    //Nullable references to the same number can refer to different objects:

    val ac: Int = 127
    val boxedA: Int? = ac
    val anotherBoxedA: Int? = ac

    val bc: Int = 128
    val boxedB: Int? = bc
    val anotherBoxedB: Int? = bc

    // println(boxedA === anotherBoxedA) // true
    // println(boxedB === anotherBoxedB) // false

    // All nullable references to  are actually the same object because of the memory optimization that JVM applies to Integers between -128 and 127.
    // Memory optimization doesn't apply to the b references, so they are different objects.


    //Explicit number conversion

    val n: Byte = 1 // OK, literals are checked statically
    // val i: Int = n // ERROR
    val i1: Int = n.toInt()

    //All number types support conversions to other types:
    //toByte() : Byte
    //toShort() : Short
    //toInt() : Int
    //toLong() : Long
    //toFloat() : Float
    //toDouble() : Double
    //In many cases, there is no need for explicit conversions because the type is inferred from the context.
    //val num = 1L + 3
    //       // Long + Int => Long

    // Operation on Numbers
    // Kotlin supports Standard set of arithmetical operations: +, -, *, /, %.
    println(1 + 2) // 3
    println(2_500_000L - 1L) // 2499999
    println(3.14 * 2.71) // 8.5094
    println(10.0 / 3) // 3.3333333333333335

    // Division between integers numbers always returns an integer number. Any fractional part is discarded.
    val x = 5 / 2
    //println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2)     // true

    // This is true for a division between any two integer types:
    val xml = 5L / 2
    println(xml == 2L)

    // To return a floating-point type, explicitly convert one of the arguments to a floating-point type:
    val xp = 5 / 2.toDouble()
    println(xp == 2.5)   // true

    // Bitwise Operations: They can be applied only to Int and Long.
        //Bitwise operations:
            //shl(bits) – signed shift left
            //shr(bits) – signed shift right
            //ushr(bits) – unsigned shift right
            //and(bits) – bitwise AND
            //or(bits) – bitwise OR
            //xor(bits) – bitwise XOR
            //inv() – bitwise inversion

    // Floating-point numbers comparison
        //Equality checks: a == b and a != b
        //Comparison operators: a < b, a > b, a <= b, a >= b



    //Booleans
    // The type of Boolean objects that can have two values: true and false.
    // Boolean has a nullable counterpart declared as Boolean?

    //Characters
    //character are represented by the type Char.
    //Character literals go in single quotes: '1'.
    // On the JVM, a character stored as primitive type: `char`, represents a 16-bit Unicode character.

    // Special characters start from an escaping backslash \.
    //If a value of character variable is a digit, you can explicitly convert it to an Int number using the digitToInt() function.
    //On the JVM, characters are boxed in Java classes when a nullable reference is needed, just like with numbers.

    //Strings
    val str = "abcd 123"

    // Elements of a string are characters that you can access via the indexing operation: s[i]. You can iterate over these characters with a for loop:

    for (c in str) {
        println(c)
    }

    // Once you initialize a string, you can't change its value or assign a new value to it.
    //All operations that transform strings return their results in a new String object, leaving the original string unchanged:
    "abcd"
    // Creates and prints a new String object
    println(str.uppercase())        // ABCD

    // The original string remains the same
    println(str)                    // abcd

    val sni = "abc" + 1
    println(sni + "def") //abc1def

    //String literals
        //Kotlin has two types of string literals:
            //Escaped strings
                // Escaped string can contain escaped characters.
                val spi = "Hello, world!\n"
                // Escaping is done in the conventional way, with a backslash (\).
            //Multiline strings
                // Multiline string can contain newlines and arbitrary text, delimited by a triple quote (""").
                //It contains no escaping characters and can contain newlines and any other characters:
                val text = """
                for (c in "Android")
                    print(c)
                """

    // String templates
    //String literals may contain template expressions – pieces of code that are evaluated and whose results are concatenated into a string.
    //When a template expression is processed, Kotlin automatically calls the .toString() function on the expression's result to convert it into a string.

    val i = 10
    println("i = $i")               // i = 10

    val letters = listOf("a","b","c","d","e")
    println("Letters: $letters")    // Letters: [a, b, c, d, e]

    val st = "abc"
    println("$st.length is ${st.length}")     // abc.length is 3


    // Type checks and casts
    // is and !is operators

    val obj = "Piyush"
    if (obj is String) {
        print(obj.length)
    }

    if (obj !is String) { // Same as !(obj is String)
        print("Not a String")
    } else {
        print(obj.length)
    }

    //Smart Cast
    fun demo(x: Any) {
        if (x is String) {
            print(x.length) // x is automatically cast to String
        }
    }

    //if (x !is String) return
    //print(x.length) // x is automatically cast to String

    // x is automatically cast to String on the right-hand side of `||`
    // if (x !is String || x.length == 0) return

    // x is automatically cast to String on the right-hand side of `&&`
    //if (x is String && x.length > 0) {
    //    print(x.length) // x is automatically cast to String
    //}


    // "Unsafe" cast operator
    // Usually, the cast operator throws an exception if the cast isn't possible. Thus, it's called unsafe.
    //    val x: String = y as String

    // Note that null cannot be cast to String, as this type is not nullable.
        //If y is null, the code above throws an exception.
        //To make code like this correct for null values, use the nullable type on the right-hand side of the cast:
        //val x: String? = y as String?

    // "Safe" cast operator.
    //To avoid exceptions, use the safe cast operator as?, which returns null on failure.
    //val x: String? = y as? String
    
}