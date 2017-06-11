package _3_ClassesAndObjects

import org.junit.Assert
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class OverridingPropertyTest {

    @Test fun testParentProperty() {
        val property: SuperProperty = SuperProperty()
        Assert.assertEquals(0, property.x)
    }

    @Test fun testChildProperty() {
        val property: ChildProperty = ChildProperty()
        Assert.assertEquals(10, property.x)
    }

    @Test fun testTypeProperty() {
        val property: SuperProperty = ChildProperty()
        Assert.assertEquals(10, property.x)
    }
}
