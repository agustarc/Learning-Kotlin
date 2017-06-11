package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
// In Kotlin, implementation inheritance is regulated by the following rule:
// if a class inherits many implementations of the same member from its immediate superclasses,
// it must override this member and provide its own implementation (perhaps, using one of the inherited ones).
// To denote the supertype from which the inherited implementation is taken,
// we use super qualified by the supertype name in angle brackets

open class SuperMessage {
    open fun getMessage(): String {
        return "Super"
    }
}

interface InterfaceMessage {
    fun getMessage(): String { // interface members are 'open' by default
        return "Interface"
    }
}

class Message(var isSuper: Boolean) : SuperMessage(), InterfaceMessage {
    override fun getMessage(): String {
        if (isSuper) {
            return super<SuperMessage>.getMessage()
        } else {
            return super<InterfaceMessage>.getMessage()
        }
    }
}
