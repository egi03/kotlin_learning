enum class Direction{
    NORTH, EAST, SOUTH, WEST
}

enum class HighlightColor(val value: Int){
    YELLOW(0xebba34),
    BLUE(0x3495eb),
    BLACK(0)
}


fun main(){
    val direction: Direction = Direction.EAST

    println(direction.name)
    println(direction.ordinal) // index u enumu

    val parsedDirection = Direction.valueOf("WEST")
    println(parsedDirection.name)

    val apiValue = Direction.values()[2]
    println(apiValue)

    val volor = HighlightColor.BLUE
    println(volor.value)
}
