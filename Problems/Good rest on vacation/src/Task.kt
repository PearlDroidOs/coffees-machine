import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val info = arrayListOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt())

    println(info[1] * info[0] + info[2] * 2 + info[3] * (info[0] - 1))
}