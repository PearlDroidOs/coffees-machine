import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val boxOne: List<String> = scanner.nextLine().split(" ")
    val boxTwo: List<String> = scanner.nextLine().split(" ")

    val x1 = boxOne[0].toInt()
    val y1 = boxOne[1].toInt()
    val z1 = boxOne[2].toInt()

    val x2 = boxTwo[0].toInt()
    val y2 = boxTwo[1].toInt()
    val z2 = boxTwo[2].toInt()

    val boxOneSize = x1 * y1 * z1
    val boxTwoSize = x2 * y2 * z2

    val maxSizeOfBoxOne = getMaxValue(x1, y1, z1)
    val maxSizeOfBoxTwo = getMaxValue(x2, y2, z2)

    val minSizeOfBoxOne = getMinValue(x1, y1, z1)
    val minSizeOfBoxTwo = getMinValue(x2, y2, z2)

    if (boxOneSize == boxTwoSize) {
        println("Box 1 = Box 2")
    } else if (boxOneSize < boxTwoSize && maxSizeOfBoxOne <= maxSizeOfBoxTwo && minSizeOfBoxOne <= minSizeOfBoxTwo) {
        println("Box 1 < Box 2")
    } else if (boxOneSize > boxTwoSize && maxSizeOfBoxOne >= maxSizeOfBoxTwo && minSizeOfBoxOne >= minSizeOfBoxTwo) {
        println("Box 1 > Box 2")
    } else {
        println("Incomparable")
    }
}

fun getMaxValue(x: Int, y: Int, z: Int): Int {
    return when {
        x > y && x > z -> {
            x
        }
        y > x && y > z -> {
            y
        }
        z > x && z > y -> {
            z
        }
        x == y -> {
            x
        }
        else -> y
    }
}

fun getMinValue(x: Int, y: Int, z: Int): Int {
    return when {
        x < y && x < z -> {
            x
        }
        y < x && y < z -> {
            y
        }
        z < x && z < y -> {
            z
        }
        x == y -> {
            x
        }
        else -> y
    }
}