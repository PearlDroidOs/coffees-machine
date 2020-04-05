import java.util.Scanner

enum class Rainbow() {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;

    companion object {
        fun isCheck(color: String): Boolean {
            for (enum in values()) {
                if (color == enum.name)
                    return true
            }
            return false
        }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    println(Rainbow.isCheck(input.next().toUpperCase()))
}