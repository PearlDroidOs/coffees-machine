import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()
    val num4 = scanner.nextInt()
    val num5 = scanner.nextInt()
    val num6 = scanner.nextInt()

    println(((num4-num1)*3600)+((num5-num2)*60)+(num6-num3))

    val scan = Scanner(System.`in`)
    val time1 = IntArray(3) { scan.nextInt() }
    val time2 = IntArray(3) { scan.nextInt() }

    var secondsInBetween = 0

    repeat(3) {
        when (it) {
            0 -> secondsInBetween += (time2[it] - time1[it]) * 3600
            1 -> secondsInBetween += (time2[it] - time1[it]) * 60
            2 -> secondsInBetween += time2[it] - time1[it]
        }
    }

    println(secondsInBetween)


    val num = scanner.nextLine()

    val d1 = num[0].toString()
    val d2 = num[1].toString()
    val d3 = num[2].toString()

    /*val tempNum = mutableListOf(d1, d2, d3)
    tempNum.sort()
    print((tempNum[0] + tempNum[1] + tempNum[2]).toString().toInt())*/
}