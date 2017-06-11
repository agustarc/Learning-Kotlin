package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class ChildClass: ParentClass {
    private var childName: String = ""
    constructor(p: String) : super(p) {
        childName = p
    }

    override fun generate(): String {
        return "Child : " + childName
    }
}