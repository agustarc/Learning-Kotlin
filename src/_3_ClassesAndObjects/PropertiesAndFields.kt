package _3_ClassesAndObjects

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */

// Properties the value of which is known at compile time can be marked as compile time constants using the const modifier.
// Such properties need to fulfil the following requirements:
// 1. Top-level or member of an object
// 2. Initialized with a value of type String or a primitive type
// 3. No custom getter
const val DEPRECATED_MESSAGE = "this method is deprecated."

class LearnField {

    var counter: Int = 10
    set (value) {
        if (value > 10) {
            field = value
        }
    }

    val isChange: Boolean
        get() = this.counter != 10

    // Since Kotlin 1.1, you can omit the property type if it can be inferred from the getter
    val isChangeTypeOmitted
        get() = this.counter != 10

    var displayName: String = "Leopold"
        get() = "Hi " + field
        set(value) {
            field = if (value.isEmpty()) "Leopold" else value
        }

    // If you need to change the visibility of an accessor or to annotate it,
    // but don't need to change the default implementation,
    // you can define the accessor without defining its body
    var privateSetter: String = ""
        private set

    @Deprecated(DEPRECATED_MESSAGE) fun constVal() {}
}
