import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num = scanner.nextInt()

    listOf(2, 3, 5, 6).forEach {
        if (num % it == 0)
            println("Divided by $it")
    }
}