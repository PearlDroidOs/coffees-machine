import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var num = scanner.nextInt()
    var naturalNum = 1

    while (naturalNum * naturalNum <= num) {
        println(naturalNum * naturalNum)
        naturalNum++
    }
}