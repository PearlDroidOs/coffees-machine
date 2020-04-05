import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val powOfa = a * a
    val powOfb = b * b
    val powOfc = c * c

    if (a + b > c && c + b > a && c + a > b)
        println("YES")
    else
        println("NO")
}