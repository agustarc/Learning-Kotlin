package _3_ClassesAndObjects

import org.junit.Assert
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class ExtensionsTest {

    @Test fun testExtensionFunction() {
        val list: MutableList<Int> = mutableListOf()
        list.add(1)
        list.add(2)
        list.swap(0, 1)
        Assert.assertEquals(2, list[0])
    }

    @Test fun testExtensionGenericFunction() {
        val list: MutableList<String> = mutableListOf()
        list.add("A")
        list.add("B")
        list.swapGeneric(0, 1)
        Assert.assertEquals("B", list[0])
    }

    @Test fun testExtensionFunctionDependOnType() {
        val a: Super = Sub()
        Assert.assertEquals("Super", a.getMessage())

        val b: Sub = Sub()
        Assert.assertEquals("Sub", b.getMessage())
    }

    @Test fun testExtensionMemberFunction() {
        val m: Member = Member()
        Assert.assertEquals("Member", m.getMessage())
    }

    @Test fun testExtensionMemberFunctionDifferentSignature() {
        val m: Member2 = Member2()
        Assert.assertEquals("Member2", m.getMessage())
        Assert.assertEquals("Extension2", m.getMessage(2))
    }

    @Test fun testNullReceiver() {
        val a: Any? = null
        Assert.assertEquals("isNull", a.toString())
    }
}