package chapter5

/**
 * Created by Stanislav Bausov on 14.08.2019.
 */
fun main() {
    val greetingFunction: (String) -> String = {
        val currentYear = 2019
        "Welcome to SimVillage, $it! (copyright $currentYear)"
    }

    println(greetingFunction("Guyal"))
}