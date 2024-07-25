package Kotlin

import com.sun.tools.jdeps.Graph

// Function scope

// fun dfs(graph: Graph) {
//    fun dfs(current: Vertex, visited: MutableSet<Vertex>) {
//        if (!visited.add(current)) return
//        for (v in current.neighbors)
//            dfs(v, visited)
//    }
//
//    dfs(graph.vertices[0], HashSet())
//}

// Kotlin functions can be declared at the top level in a file, meaning you do not need to create a class to hold a function, which you are required to do in languages such as Java, C#,etc.
// Kotlin functions can also be declared locally as member functions and extension functions.
// Local Functions : Kotlin supports local functions which are functions inside functions.



// local function
//fun dfs(graph: Graph) {
//    fun dfs(current: Vertex, visited: MutableSet<Vertex>) {
//        if (!visited.add(current)) return
//        for (v in current.neighbors)
//            dfs(v, visited)
//    }
//
//    dfs(graph.vertices[0], HashSet())
//}


// fun dfs(graph: Graph) {
//    val visited = HashSet<Vertex>()
//    fun dfs(current: Vertex) {
//        if (!visited.add(current)) return
//        for (v in current.neighbors)
//            dfs(v)
//    }
//
//    dfs(graph.vertices[0])
//}


//Member functions
// A member function is a function that is defined inside a class or object:

class Sample {
    fun foo() { print("Foo") }
}
//Member functions are called with dot notation:

fun main(){
    Sample().foo() // creates instance of class Sample and calls foo
}


//Generic functions
//Function can have generic parameters, which are specified using angle brackets before the function name:
//
//fun <T> singletonList(item: T): List<T> { /*...*/ }


// Tail recursive function
//Kotlin supports a style of functional programming known as tail recursion. For some algorithms that would normally use loops, you can use a recursive function instead without the risk of stack overflow. When a function is marked with the tailrec modifier and meets the required formal conditions, the compiler optimizes out the recursion, leaving behind a fast and efficient loop based version instead:
//
//val eps = 1E-10 // "good enough", could be 10^-15
//
//tail recursive fun findFixPoint(x: Double = 1.0): Double =
//    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))
//This code calculates the fixpoint of cosine, which is a mathematical constant. It simply calls Math.cos repeatedly starting at 1.0 until the result no longer changes, yielding a result of 0.7390851332151611 for the specified eps precision. The resulting code is equivalent to this more traditional style:

// Tail recursive functions﻿
//Kotlin supports a style of functional programming known as tail recursion. For some algorithms that would normally use loops, you can use a recursive function instead without the risk of stack overflow. When a function is marked with the tailrec modifier and meets the required formal conditions, the compiler optimizes out the recursion, leaving behind a fast and efficient loop based version instead:
//
//val eps = 1E-10 // "good enough", could be 10^-15
//
//tailrec fun findFixPoint(x: Double = 1.0): Double =
//    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))
//This code calculates the fixpoint of cosine, which is a mathematical constant. It simply calls Math.cos repeatedly starting at 1.0 until the result no longer changes, yielding a result of 0.7390851332151611 for the specified eps precision. The resulting code is equivalent to this more traditional style:
//
//val eps = 1E-10 // "good enough", could be 10^-15
//
//private fun findFixPoint(): Double {
//    var x = 1.0
//    while (true) {
//        val y = Math.cos(x)
//        if (Math.abs(x - y) < eps) return x
//        x = Math.cos(x)
//    }
//}
//To be eligible for the tailrec modifier, a function must call itself as the last operation it performs. You cannot use tail recursion when there is more code after the recursive call, within try/catch/finally blocks, or on open functions. Currently, tail recursion is supported by Kotlin for the JVM and Kotlin/Native.