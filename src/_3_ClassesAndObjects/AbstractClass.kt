package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
open class NonAbstract {
    open fun call() {}
}

// A class and some of its members may be declared abstract.
// An abstract member does not have an implementation in its class.
// Note that we do not need to annotate an abstract class or function with open – it goes without saying.
// We can override a non-abstract open member with an abstract one
@Suppress("unused")
abstract class AbstractClass : NonAbstract() {
    override abstract fun call()
}
