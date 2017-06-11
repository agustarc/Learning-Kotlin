package _3_ClassesAndObjects

import org.junit.Assert
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class OverridingRuleTest {

    @Test fun testSuperType() {
        val message: Message = Message(true)
        Assert.assertEquals("Super", message.getMessage())
    }

    @Test fun testInterfaceType() {
        val message: Message = Message(false)
        Assert.assertEquals("Interface", message.getMessage())
    }
}
