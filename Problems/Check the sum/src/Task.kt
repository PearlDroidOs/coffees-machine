import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()

    val isCheck = n1 + n2 == 20 || n1 + n3 == 20 || n2 + n3 == 20

    print("$isCheck")
}