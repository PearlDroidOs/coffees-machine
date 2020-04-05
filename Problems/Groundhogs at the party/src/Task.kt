import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num = scanner.nextInt()
    val isWeekEnd = scanner.nextBoolean()

    val isCheck = if (isWeekEnd) num in 15..25 else num in 10..20

    print("$isCheck")
}