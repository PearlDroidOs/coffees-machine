import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    when (scanner.nextLine()) {
        "triangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            val c = scanner.nextDouble()
            val s = (a + b + c) / 2
            println(sqrt(s * (s - a) * (s - b) * (s - c)))
        }
        "rectangle" -> {
            val a = scanner.nextDouble()
            val b = scanner.nextDouble()
            println(a * b)
        }
        "circle" -> {
            val r: Double = scanner.nextDouble()
            println(3.14 * r * r)
        }
    }
}