package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val water = scanner.nextInt()
    val milk = scanner.nextInt()
    val coffeeBeans = scanner.nextInt()
    val wantCupsOfCoffee = scanner.nextInt()

    var waterTemp = water
    var milkTemp = milk
    var coffeeBeansTemp = coffeeBeans

    var makeCupsOfCoffee = 0
    var isCoffeeMoreThan = false


    while (waterTemp >= 200 && milkTemp >= 50 && coffeeBeansTemp >= 15) {
        waterTemp -= 200
        milkTemp -= 50
        coffeeBeansTemp -= 15
        makeCupsOfCoffee += 1
    }

    isCoffeeMoreThan = makeCupsOfCoffee - wantCupsOfCoffee > 0

    println("Write how many ml of water the coffee machine has: > $water")
    println("Write how many ml of milk the coffee machine has: > $milk")
    println("Write how many grams of coffee beans the coffee machine has: > $coffeeBeans")
    println("Write how many cups of coffee you will need: > $wantCupsOfCoffee")

    if (makeCupsOfCoffee > 0 || wantCupsOfCoffee == 0) {
        if (makeCupsOfCoffee < wantCupsOfCoffee) {
            println("No, I can make only $makeCupsOfCoffee cups of coffee")
        } else if (isCoffeeMoreThan && makeCupsOfCoffee > wantCupsOfCoffee) {
            println("Yes, I can make that amount of coffee (and even ${makeCupsOfCoffee - wantCupsOfCoffee} more than that)")
        } else {
            println("Yes, I can make that amount of coffee")
        }
    } else {
        println("No, I can make only $makeCupsOfCoffee cups of coffee")
    }

}
