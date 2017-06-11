package _3_ClassesAndObjects

import org.junit.Assert
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class InheritanceTest {

    @Test fun parentTest() {
        val parent: ParentClass = ParentClass("Leo")
        Assert.assertEquals("Super : Leo", parent.generate())
    }

    @Test fun childTest() {
        val child: ChildClass = ChildClass("Leo")
        Assert.assertEquals("Child : Leo", child.generate())
    }

    @Test fun typeTest() {
        val child: ParentClass = ChildClass("Leo")
        Assert.assertEquals("Child : Leo", child.generate())
    }

}
