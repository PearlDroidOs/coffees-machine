import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val num = scanner.nextInt()
    var large: Int = 0
    var small: Int = 0
    var perfect: Int = 0
    repeat(num){
        when(scanner.nextInt()) {
            1 -> large++
            0 -> perfect++
            -1 -> small++
        }
    }
    println("$perfect $large $small")
}