import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    val n3 = scanner.nextInt()

    val isCheck = n1 in n2..n3 || n1 in n3..n2

    print("$isCheck")
}