package _3_ClassesAndObjects

import org.junit.Assert
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class ObjectExpressionsAndDeclarationsTest {

    @Test fun testSimpleObjectCreation() {
        val obj: ObjectA = createSimpleObject(30)
        Assert.assertEquals(30, obj.y)
    }

    @Test fun testSimpleObjectType() {
        val obj: ObjectA = createSimpleObject(30)
        Assert.assertTrue(obj is InterfaceB)
    }

    @Test fun testJustAnObject() {
        val sum: Int = justAnObjectCallSum(10, 20)
        Assert.assertEquals(30, sum)
    }
}