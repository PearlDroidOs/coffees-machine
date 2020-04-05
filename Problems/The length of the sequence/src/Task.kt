import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var count = 0
    do{
        val n = scanner.nextInt()
        count++
    }while(n != 0)
    count--
    println(count)
}

