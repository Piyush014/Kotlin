package Kotlin

// Anonymous functions

//The lambda expression syntax above is missing one thing – the ability to specify the function's return type. In most cases, this is unnecessary because the return type can be inferred automatically. However, if you do need to specify it explicitly, you can use an alternative syntax: an anonymous function.

// An anonymous function looks very much like a regular function declaration, except its name is omitted. Its body can be either an expression (as shown above) or a block:


//fun(x: Int, y: Int): Int = x + y

// An anonymous function looks very much like a regular function declaration, except its name is omitted. Its body can be either an expression (as shown above) or a block:

//fun(x: Int, y: Int): Int {
//    return x + y
// }

// Closures
//A lambda expression or anonymous function (as well as a local function and an object expression) can access its closure, which includes the variables declared in the outer scope. The variables captured in the closure can be modified in the lambda:
//var sum = 0
//ints.filter { it > 0 }.forEach {
//    sum += it
//}
//print(sum)
// The parameters and the return type are specified in the same way as for regular functions, except the parameter types can be omitted if they can be inferred from the context:
//ints.filter(fun(item) = item > 0)
//The return type inference for anonymous functions works just like for normal functions: the return type is inferred automatically for anonymous functions with an expression body, but it has to be specified explicitly (or is assumed to be Unit) for anonymous functions with a block body.

// Function literals with receiver

// Function types with receiver, such as A.(B) -> C, can be instantiated with a special form of function literals – function literals with receiver.
//As mentioned above, Kotlin provides the ability to call an instance of a function type with receiver while providing the receiver object.
//Inside the body of the function literal, the receiver object passed to a call becomes an implicit this, so that you can access the members of that receiver object without any additional qualifiers, or access the receiver object using a this expression.
//This behavior is similar to that of extension functions, which also allow you to access the members of the receiver object inside the function body.
//Here is an example of a function literal with receiver along with its type, where plus is called on the receiver object:
//val sum: Int.(Int) -> Int = { other -> plus(other) }


// The anonymous function syntax allows you to specify the receiver type of a function literal directly. This can be useful if you need to declare a variable of a function type with receiver, and then to use it later.
//val sum = fun Int.(other: Int): Int = this + other
//Lambda expressions can be used as function literals with receiver when the receiver type can be inferred from the context. One of the most important examples of their usage is type-safe builders:
//class HTML {
//    fun body() { ... }
//}
//fun html(init: HTML.() -> Unit): HTML {
//    val html = HTML()  // create the receiver object
//    html.init()        // pass the receiver object to the lambda
//    return html
//}
//html {       // lambda with receiver begins here
//    body()   // calling a method on the receiver object
//}
fun main(){

}