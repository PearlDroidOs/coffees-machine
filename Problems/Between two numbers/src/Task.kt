import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val num = scanner.nextLine().split(" ")
    val a = num[0].toInt()
    val b = num[1].toInt()
    val c = num[2].toInt()

    println(a in b..c)
}