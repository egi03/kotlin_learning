fun main(){
    val langs: Set<String> = setOf("kt","cpp","java")
    langs.size
    langs.contains("kt")

    val mutLang: MutableSet<String> = mutableSetOf("")
    mutLang.add("kt")
    mutLang.remove("kt")

    val testScores = mapOf(Pair(123, 22.2), Pair(345, 33.4), 789 to 99.9)
    println(testScores[123])

    for((id, score) in testScores){ // for(kvp in map) -> kvp.key, kvp.value
        println("key: ${id} value:${score}")
    }

    testScores.contains(123)
    testScores.containsValue(22.2)

    testScores.keys.forEach{println(it)}

    val mutmap = mutableMapOf<Int, Double>()
    mutmap.put(123,1.11)
    mutmap[345] = 222.2
    mutmap.remove(123)
    mutmap.replace(345, 999.9)

    mutmap.forEach{println(it.value)}

}
