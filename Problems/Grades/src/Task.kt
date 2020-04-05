import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val gradeStudents = IntArray(num)
    repeat(num) {
        gradeStudents[num - it - 1] = scanner.nextInt()
    }

    print(checkIndex(2, num, gradeStudents))
    print(" ${checkIndex(3, num, gradeStudents)}")
    print(" ${checkIndex(4, num, gradeStudents)}")
    print(" ${checkIndex(5, num, gradeStudents)}")
}

fun checkIndex(grade: Int, size: Int, info: IntArray): Int {
    var i = 0

    repeat(size) {
        if (info[it] == grade)
            i++
    }

    return i
}