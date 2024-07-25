package Kotlin

// Function types
//Kotlin uses function types, such as (Int) -> String, for declarations that deal with functions: val onClick: () -> Unit = ....
//
//These types have a special notation that corresponds to the signatures of the functions - their parameters and return values:
//
//All function types have a parenthesized list of parameter types and a return type: (A, B) -> C denotes a type that represents functions that take two arguments of types A and B and return a value of type C. The list of parameter types may be empty, as in () -> A. The Unit return type cannot be omitted.
//
//Function types can optionally have an additional receiver type, which is specified before the dot in the notation: the type A.(B) -> C represents functions that can be called on a receiver object A with a parameter B and return a value C. Function literals with receiver are often used along with these types.
//
//Suspending functions belong to a special kind of function type that have a suspend modifier in their notation, such as suspend () -> Unit or suspend A.(B) -> C.
//
//The function type notation can optionally include names for the function parameters: (x: Int, y: Int) -> Point. These names can be used for documenting the meaning of the parameters.
//
//To specify that a function type is nullable, use parentheses as follows: ((Int, Int) -> Int)?


// Function types can also be combined using parentheses: (Int) -> ((Int) -> Unit).
//
//The arrow notation is right-associative, (Int) -> (Int) -> Unit is equivalent to the previous example, but not to ((Int) -> (Int)) -> Unit.
//
//You can also give a function type an alternative name by using a type alias:
//
//typealias ClickHandler = (Button, ClickEvent) -> Unit


class IntTransformer: (Int) -> Int {
    override operator fun invoke(x: Int): Int = TODO()
}

val intFunction: (Int) -> Int = IntTransformer()

val a = { i: Int -> i + 1 } // The inferred type is (Int) -> Int

// val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
//val twoParameters: (String, Int) -> String = repeatFun // OK
//
//fun runTransformation(f: (String, Int) -> String): String {
//    return f("hello", 3)
//}
//val result = runTransformation(repeatFun) // OK

