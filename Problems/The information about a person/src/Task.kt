import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val info = scanner.nextLine()
    val firstName = info.split(" ")[0]
    val lastName = info.split(" ")[1]
    val age = info.split(" ")[2]

    println("${firstName.first()}. $lastName, $age years old")
}