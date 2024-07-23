fun main() {

    // The val keyword is used to declare immutable, read-only local variables that can’t be reassigned a different value after initialization.
    val x: Int = 5


    // The var keyword is used to mutable variables, and their values can be changed after initialization.
    var y: Int = 10
    // Reassigns a new value 11 to the variable y
    y += 1


    // Kotlin supports type inference and automatically identifies the data type of a declared variable.
    // Declares the variable x with the value of 100; "Int" type is inferred
    val p = 100


    // Variables can also be declared and initialized separately.
    val NUM: Int
    // Initializes the variable NUM after the declaration.
    NUM = 3

    println(x)
    println(y)
    println(p)
    println(NUM)
}