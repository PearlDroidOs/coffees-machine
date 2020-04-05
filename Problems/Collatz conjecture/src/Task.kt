import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var num = scanner.nextInt()
    print("$num ")

    while (num != 1) {
        if (num % 2 == 0) num /= 2 else num = num * 3 + 1
        print("$num ")
    }
}