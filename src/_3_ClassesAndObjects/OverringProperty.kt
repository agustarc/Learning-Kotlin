package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
// Overriding properties works in a similar way to overriding methods;
// properties declared on a superclass that are then redeclared on a derived class must be prefaced with override,
// and they must have a compatible type.
// Each declared property can be overridden by a property with an initializer or by a property with a getter method.
open class SuperProperty {
    open val x: Int = 0
}

class ChildProperty : SuperProperty() {
    override val x: Int = 10
}

// ou can also override a val property with a var property, but not vice versa.
// This is allowed because a val property essentially declares a getter method,
// and overriding it as a var additionally declares a setter method in the derived class.
// Note that you can use the override keyword as part of the property declaration in a primary constructor.
interface Base {
    val count: Int
}

class InterfaceProperty(override val count: Int) : Base
class InterfaceProperty2 : Base {
    override val count: Int = 20
}