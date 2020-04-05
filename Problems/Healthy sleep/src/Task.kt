import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a: Int = scanner.nextInt()
    var b: Int = scanner.nextInt()

    while(a > b){
        b = scanner.nextInt()
    }

    val h = scanner.nextInt()

    when {
        h in a until b -> {
            println("Normal")
        }
        h < a -> {
            println("Deficiency")
        }
        h > b -> {
            println("Excess")
        }
    }

}