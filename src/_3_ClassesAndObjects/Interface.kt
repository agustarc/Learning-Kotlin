package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
// Interfaces in Kotlin are very similar to Java 8.
// They can contain declarations of abstract methods, as well as method implementations.
// What makes them different from abstract classes is that interfaces cannot store state.
// They can have properties but these need to be abstract or to provide accessor implementations.
interface SimpleInterface {
    fun getMessage(): String
    fun getMessageWith(prefix: String): String {
        // optional body
        return prefix + "Interface"
    }
}

class SimpleClass : SimpleInterface {
    override fun getMessage(): String {
        return "Class"
    }
}

// You can declare properties in interfaces.
// A property declared in an interface can either be abstract, or it can provide implementations for accessors.
// Properties declared in interfaces can't have backing fields,
// and therefore accessors declared in interfaces can't reference them.
interface PropertyInterface {
    val value: Int

    fun getValueString(): String {
        return "".plus(value)
    }
}

class PropertyClass(override val value: Int) : PropertyInterface

// When we declare many types in our supertype list,
// it may appear that we inherit more than one implementation of the same method.
interface A {
    fun foo() {
        print("A")
    }
}

interface B {
    fun foo() {
        print("B")
    }
}

@Suppress("unused")
class C : A {
    override fun foo() {
        print("C")
    }
}

@Suppress("unused")
class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
}