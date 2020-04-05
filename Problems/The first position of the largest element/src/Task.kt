import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val listNum = scanner.nextLine().split(" ")
    var firstPosition: Int = 0
    var max: Int = listNum[0].toInt()

    for (num in listNum) {
        if (max < num.toInt()) {
            max = num.toInt()
            firstPosition = listNum.indexOf(num)
        }
    }

    println("$max ${firstPosition + 1}")
}