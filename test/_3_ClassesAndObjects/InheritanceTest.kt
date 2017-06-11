package _3_ClassesAndObjects

import org.junit.Assert
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class InheritanceTest {

    @Test fun parentTest() {
        val parent: Inheritance = Inheritance("Leo")
        Assert.assertEquals("Super : Leo", parent.generate())
    }

    @Test fun childTest() {
        val child: Inheritance.Subclass = Inheritance.Subclass("Leo")
        Assert.assertEquals("Child : Leo", child.generate())
    }

    @Test fun typeTest() {
        val child: Inheritance = Inheritance.Subclass("Leo")
        Assert.assertEquals("Child : Leo", child.generate())
    }

}
