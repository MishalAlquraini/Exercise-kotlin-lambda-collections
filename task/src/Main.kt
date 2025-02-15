
fun filterNames(names: List<String>, condition: (String) -> Boolean): List<String> {
    return names.filter(condition)
}

val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
val words = listOf("apple", "banana", "kiwi", "strawberry", "grape")

fun main() {
   val doubleNumbers = numbers.map { it * 2 }

    println(doubleNumbers)

    val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")

    val filteredNames = filterNames(names) { it.startsWith("A") }
    println(filteredNames)

    val sortedWords = words.sortedByDescending { it.length }
    println(sortedWords)
}