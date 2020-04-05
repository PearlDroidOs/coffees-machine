import java.util.Scanner

enum class Rainbow() {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET, NULL;

    companion object {
        fun isCheck(color: String): Int {
            for (enum in values()) {
                if (color == enum.name)
                    return enum.ordinal + 1
            }
            return NULL.ordinal + 1
        }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    println(Rainbow.isCheck(input.next().toUpperCase()))
}