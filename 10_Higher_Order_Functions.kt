package Kotlin

// Higher order Functions

// fun <T, R> Collection<T>.fold(
//    initial: R,
//    combine: (acc: R, nextElement: T) -> R
//): R {
//    var accumulator: R = initial
//    for (element: T in this) {
//        accumulator = combine(accumulator, element)
//    }
//    return accumulator
//}


// In the code above, the combine parameter has the function type (R, T) -> R, so it accepts a function that takes two arguments of types R and T and returns a value of type R. It is invoked inside the for loop, and the return value is then assigned to accumulator.
//
//To call fold, you need to pass an instance of the function type to it as an argument, and lambda expressions (described in more detail below) are widely used for this purpose at higher-order function call sites:

//val items = listOf(1, 2, 3, 4, 5)
//
//// Lambdas are code blocks enclosed in curly braces.
//items.fold(0, {
//    // When a lambda has parameters, they go first, followed by '->'
//    acc: Int, i: Int ->
//    print("acc = $acc, i = $i, ")
//    val result = acc + i
//    println("result = $result")
//    // The last expression in a lambda is considered the return value:
//    result
//})
// Parameter types in a lambda are optional if they can be inferred:
// val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

// Function references can also be used for higher-order function calls:
//val product = items.fold(1, Int::times)
