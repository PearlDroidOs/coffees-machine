import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here

    val categoryNum = scanner.nextInt()
    val category: String = when {
        categoryNum < 1 -> "no army"
        categoryNum in 1..4 -> "few"
        categoryNum in 5..9 -> "several"
        categoryNum in 10..19 -> "pack"
        categoryNum in 20..49 -> "lots"
        categoryNum in 50..99 -> "horde"
        categoryNum in 100..249 -> "throng"
        categoryNum in 250..499 -> "swarm"
        categoryNum in 500..999 -> "zounds"
        else -> "legion"
    }

    println(category)
}