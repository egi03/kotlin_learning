// open znaci da se moze nasljedit
open class Person(
    age: Int,
    protected val firstName: String,
    protected val lastName:String
){
    init{
    }

    val age:Int = age

    // open fun -> moze se override
    open fun printName() = println("$firstName $lastName")
}

class Student(
    age: Int,
    firstName: String,
    lastName: String
): Person(age, firstName, lastName) {

    override fun printName() {
        println("s: $firstName $lastName")
    }
}

fun main(){
    val p: Person = Student(2, "eig", "eg")
    p.printName()

}
