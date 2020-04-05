import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextInt()

    var check = if (num % 2 == 0) {
        num + 2
    } else num + 1


    println(check)
}