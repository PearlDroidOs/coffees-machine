import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val listNum: ArrayList<Int> = ArrayList()
    var i = 0
    while (true) {
        listNum.add(scanner.nextInt())
        if (listNum[i] == 0) {
            break
        }
        i++
    }

    listNum.sortDescending()
    println(listNum[0])
}