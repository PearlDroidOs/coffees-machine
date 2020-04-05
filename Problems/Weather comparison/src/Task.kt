
data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            val weatherPlus = when (name) {
                "Moscow" -> 5
                "Hanoi" -> 20
                "Dubai" -> 30
                else -> 0
            }
            field = if (value < -92 || value > 57) {
                weatherPlus
            } else {
                value
            }
        }
}

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    val cityColder = if (firstCity.degrees < secondCity.degrees && firstCity.degrees < thirdCity.degrees) {
        firstCity.name
    } else if (secondCity.degrees < firstCity.degrees && secondCity.degrees < thirdCity.degrees) {
        secondCity.name
    } else if (thirdCity.degrees < firstCity.degrees && thirdCity.degrees < secondCity.degrees) {
        thirdCity.name
    } else if (thirdCity.degrees == third && secondCity.degrees == second && firstCity.degrees == first) {
        "neither"
    } else {
        if (firstCity.degrees == secondCity.degrees) firstCity.name else secondCity.name
    }
    print(cityColder)
}