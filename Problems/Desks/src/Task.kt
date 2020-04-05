import java.util.Scanner
import kotlin.math.ceil

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val group1 = scanner.nextInt()
    val group2 = scanner.nextInt()
    val group3 = scanner.nextInt()

    var desk1 = group1 / 2 + group1 % 2
    var desk2 = group2 / 2 + group2 % 2
    var desk3 = group3 / 2 + group3 % 2

    println(desk1 + desk2 + desk3)
}
