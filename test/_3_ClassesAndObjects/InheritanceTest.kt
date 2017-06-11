package _3_ClassesAndObjects

import org.junit.Assert
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class InheritanceTest {

    @Test fun parentTest() {
        val parent: SuperClass = SuperClass("Leo")
        Assert.assertEquals("Super : Leo", parent.generate())
    }

    @Test fun childTest() {
        val child: SubClass = SubClass("Leo")
        Assert.assertEquals("Child : Leo", child.generate())
    }

    @Test fun typeTest() {
        val child: SuperClass = SubClass("Leo")
        Assert.assertEquals("Child : Leo", child.generate())
    }

}
