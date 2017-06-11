package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
// Kotlin, similar to C# and Gosu, provides the ability to extend a class with new functionality
// without having to inherit from the class or use any type of design pattern such as Decorator.
// This is done via special declarations called extensions.
// Kotlin supports extension functions and extension properties.

fun MutableList<Int>.swap(idx1: Int, idx2: Int) {
    val temp = this[idx1]
    this[idx1] = this[idx2]
    this[idx2] = temp
}

fun <T> MutableList<T>.swapGeneric(idx1: Int, idx2: Int) {
    val temp = this[idx1]
    this[idx1] = this[idx2]
    this[idx2] = temp
}

