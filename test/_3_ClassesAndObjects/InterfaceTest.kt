package _3_ClassesAndObjects

import org.junit.Assert
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class InterfaceTest {

    @Test fun testInterfaceImplementation() {
        val obj: SimpleInterface = SimpleClass()
        Assert.assertEquals("Class", obj.getMessage())
    }

    @Test fun testInterfaceMethod() {
        val obj: SimpleInterface = SimpleClass()
        Assert.assertEquals("TestInterface", obj.getMessageWith("Test"))
    }

    @Test fun testOverrideInterfaceProp() {
        val obj: PropertyInterface = PropertyClass(20)
        Assert.assertEquals("20", obj.getValueString())
    }
}
