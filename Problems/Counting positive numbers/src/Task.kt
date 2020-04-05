import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println(IntArray(scanner.nextInt()) { scanner.nextInt() }.count() { it > 0 })
}