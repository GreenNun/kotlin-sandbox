package chapter5

/**
 * Created by Stanislav Bausov on 14.08.2019.
 */
fun main() {
    runSimulation("Guyal") { playerName, numBuildings ->
        val currentYear = 2019
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}

inline fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playerName, numBuildings))
}