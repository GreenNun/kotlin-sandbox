package chapter5

/**
 * Created by Stanislav Bausov on 14.08.2019.
 */
fun main() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2019
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

    println(greetingFunction("Guyal", 2))
}