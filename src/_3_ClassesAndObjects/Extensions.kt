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


// Extensions do not actually modify classes they extend. By defining an extension,
// you do not insert new members into a class,
// but merely make new functions callable with the dot-notation on variables of this type.
// We would like to emphasize that extension functions are dispatched statically, i.e. they are not virtual by receiver type.
// This means that the extension function being called is determined by the type of the expression on which the function is invoked, not by the type of the result of evaluating that expression at runtime.
open class Super
class Sub : Super()

fun Super.getMessage() = "Super"
fun Sub.getMessage() = "Sub"



// If a class has a member function, and an extension function is defined which has the same receiver type,
// the same name and is applicable to given arguments, the member always wins.
class Member {
    fun getMessage() = "Member"
}

fun Member.getMessage() = "Extension"


// However, it's perfectly OK for extension functions to overload member functions
// which have the same name but a different signature
// The call to Member2().getMessage(2) will print "Extension2".
class Member2 {
    fun getMessage() = "Member2"
}

fun Member2.getMessage(i: Int) = "Extension" + i


// Note that extensions can be defined with a nullable receiver type.
// Such extensions can be called on an object variable even if its value is null,
// and can check for this == null inside the body.
// This is what allows you to call toString()
// in Kotlin without checking for null: the check happens inside the extension function.
fun Any?.toString(): String {
    if (this == null) {
        return "isNull"
    }

    return toString()
}