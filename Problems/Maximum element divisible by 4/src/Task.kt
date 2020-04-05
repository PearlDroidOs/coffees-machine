import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val numElements = scanner.nextInt()
    val elementList = IntArray(numElements)

    repeat(numElements) {
        elementList[it] = scanner.nextInt()
    }

    elementList.sortDescending()

    var i = 0
    while (true) {
        if (elementList[i] % 4 == 0) {
            println(elementList[i])
            break
        }
        i++
    }
}