import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val strDateTime: List<String> = scanner.nextLine().split(" ")
    val hr = strDateTime[0]
    val min = strDateTime[1]
    val sec = strDateTime[2]
    val day = strDateTime[3]
    val month = strDateTime[4]
    val year = strDateTime[5]
    println("$hr:$min:$sec $day/$month/$year")
}