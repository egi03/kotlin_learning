data class Task(val id: String, val name: String)


fun main(){
    val task1 = Task("a1","Build")
    val task2 = Task("a2", "Add")

    println(task1.name)
    println(task2.name)

    val task2Copy = task2.copy(id = "c3")

    // mapira atribute klase po redu u varijable
    val (idVar, nameVar) = task1
    // idVar = a1
    // nameVar = Build

    if(task2Copy == task2) println("isti taskovi")


}
