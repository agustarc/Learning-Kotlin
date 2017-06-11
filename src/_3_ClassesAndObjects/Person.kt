package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class Person(name: String) {
    private var children: ArrayList<Person> = arrayListOf()
    private var identity: String = name

    // If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor,
    // either directly or indirectly through another secondary constructor(s).
    // Delegation to another constructor of the same class is done using the this keyword
    constructor(name: String, parent: Person): this(name) {
        parent.add(this)
    }

    fun add(person: Person): Unit {
        children.add(person)
    }

    fun name(): String {
        return identity
    }

    fun count(): Int {
        return children.size
    }
}
