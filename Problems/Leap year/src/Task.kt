import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var year: Int = 0
    while (!(year in 1900..3000)) {
        year = scanner.nextInt()
    }

    if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
        println("Leap")
    } else {
        println("Regular")
    }
}