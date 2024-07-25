package Kotlin

// Lambda expressions and anonymous functions are function literals. Function literals are functions that are not declared but are passed immediately as an expression. Consider the following example:
//
//max(strings, { a, b -> a.length < b.length })
//The function max is a higher-order function, as it takes a function value as its second argument. This second argument is an expression that is itself a function, called a function literal, which is equivalent to the following named function:
//
fun compare(a: String, b: String): Boolean = a.length < b.length

class  Lambda_Expressions: (Int) -> Int {
    override operator fun invoke(x: Int): Int = TODO()
}

// val intFunction: (Int) -> Int = IntTransformer()
// Non-literal values of function types with and without a receiver are interchangeable, so the receiver can stand in for the first parameter, and vice versa.

// Invoking a function type instance
//A value of a function type can be invoked by using its invoke(...) operator: f.invoke(x) or just f(x).

//If the value has a receiver type, the receiver object should be passed as the first argument. Another way to invoke a value of a function type with receiver is to prepend it with the receiver object, as if the value were an extension function: 1.foo(2).

// Inline functions
//Sometimes it is beneficial to use inline functions, which provide flexible control flow, for higher-order functions.


// Lambda expression
// Lambda expressions and anonymous functions are function literals. Function literals are functions that are not declared but are passed immediately as an expression. Consider the following example:
//max(strings, { a, b -> a.length < b.length })
//The function max is a higher-order function, as it takes a function value as its second argument. This second argument is an expression that is itself a function, called a function literal, which is equivalent to the following named function:
//fun compare(a: String, b: String): Boolean = a.length < b.length




// Lambda expression syntax

// The full syntactic form of lambda expressions is as follows:
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
// - A lambda expression is always surrounded by curly braces.
// - Parameter declarations in the full syntactic form go inside curly braces and have optional type annotations.
// - The body goes after the ->.
// - If the inferred return type of the lambda is not Unit, the last (or possibly single) expression inside the lambda body is treated as the return value.
//If you leave all the optional annotations out, what's left looks like this:
val sums = { x: Int, y: Int -> x + y }
// Passing trailing lambdas
//According to Kotlin convention, if the last parameter of a function is a function, then a lambda expression passed as the corresponding argument can be placed outside the parentheses:
//val product = items.fold(1) { acc, e -> acc * e }
//Such syntax is also known as trailing lambda.
//If the lambda is the only argument in that call, the parentheses can be omitted entirely:
//run { println("...") }



// it: implicit name of a single parameter
// It's very common for a lambda expression to have only one parameter.
// If the compiler can parse the signature without any parameters, the parameter does not need to be declared and -> can be omitted. The parameter will be implicitly declared under the name it:
// ints.filter { it > 0 } // this literal is of type '(it: Int) -> Boolean'


// Returning a value from a lambda expression
//You can explicitly return a value from the lambda using the qualified return syntax. Otherwise, the value of the last expression is implicitly returned.
//Therefore, the two following snippets are equivalent:
//ints.filter {
//    val shouldFilter = it > 0
//    shouldFilter
//}
//ints.filter {
//    val shouldFilter = it > 0
//    return@filter shouldFilter
//}
fun main() {
    val a = { i: Int -> i + 1 } // The inferred type is (Int) -> Int

    val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
    val twoParameters: (String, Int) -> String = repeatFun // OK

    fun runTransformation(f: (String, Int) -> String): String {
        return f("hello", 3)
    }
    val result = runTransformation(repeatFun) // OK

    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3)) // extension-like call

    // strings.filter { it.length == 5 }.sortedBy { it }.map { it.uppercase() }

    // Destructuring in lambdas.
    //Destructuring in lambdas is described as a part of destructuring declarations.
}
