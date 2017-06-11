package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
open class Inheritance(p: String) {
    val name = p

    // The open annotation on a class is the opposite of Java's final:
    // it allows others to inherit from this class.
    // By default, all classes in Kotlin are final, which corresponds to Effective Java,
    // Item 17: Design and document for inheritance or else prohibit it.
    open fun generate(): String {
        return "Super : " + name
    }

    class Subclass : Inheritance {
        private var childName: String = ""

        constructor(p: String) : super(p) {
            childName = p
        }

        override fun generate(): String {
            return "Child : " + childName
        }
    }
}