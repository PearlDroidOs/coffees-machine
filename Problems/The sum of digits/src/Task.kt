import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val num = scanner.nextLine()
    val firstDigit = num[0].toString().toInt()
    val secondDigit = num[1].toString().toInt()
    val thirdDigit = num[2].toString().toInt()

    print(firstDigit + secondDigit + thirdDigit)

    /*val scanner2 = Scanner(System.`in`)
    val int = scanner2.nextInt()
    val d1 = int / 100
    val d2 = int % 100 / 10
    val d3 = int % 100 % 10
    println(d1 + d2 + d3)*/
}