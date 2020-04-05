import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val q12: List<String> = scanner.nextLine().split(" ")

    val x1 = q12[0].toInt()
    val y1 = q12[1].toInt()

    val x2 = q12[2].toInt()
    val y2 = q12[3].toInt()

    if (abs(x1 - x2) == 1 && abs(y1 - y2) == 2 || abs(x1 - x2) == 2 && abs(y1 - y2) == 1) {
        println("YES")
    } else {
        println("NO")
    }
}