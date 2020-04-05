import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)

    //Coffee machine
    val water = 1200
    val milk = 540
    val coffeeBeans = 120
    val cupsOfCoffee = 9
    val money: Int = 550
    val coffeeMachineInfo = arrayListOf(water, milk, coffeeBeans, cupsOfCoffee, money)

    printCoffeeMachineInformation(coffeeMachineInfo[0],
            coffeeMachineInfo[1], coffeeMachineInfo[2],
            coffeeMachineInfo[3], coffeeMachineInfo[4])

    println()
    print("Write action (buy, fill, take): > ")
    val type = scanner.nextLine()

    when (type) {
        "buy" -> {
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > ")
            buyOperation(scanner.nextInt(), coffeeMachineInfo)
        }
        "fill" -> filling(scanner, coffeeMachineInfo)
        "take" -> taking(scanner, coffeeMachineInfo)
        else -> println("Please try again")
    }
}

fun printCoffeeMachineInformation(water: Int, milk: Int, coffeeBeans: Int, cupsOfCoffee: Int, money: Int) {
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$coffeeBeans of coffee beans")
    println("$cupsOfCoffee of disposable cups")
    println("$money of money")
}


fun buyOperation(wantBuy: Int, coffeeMachineInfo: List<Int>) {
    println()
    //Info for buying
    val espresso = arrayListOf(250, 0, 16, 4)
    val latte = arrayListOf(350, 75, 20, 7)
    val cappuccino = arrayListOf(200, 100, 12, 6)
    when (wantBuy) {
        1 -> {
            printCoffeeMachineInfo(coffeeMachineInfo[0] - espresso[0],
                    coffeeMachineInfo[1] - espresso[1],
                    coffeeMachineInfo[2] - espresso[2],
                    coffeeMachineInfo[3] - 1,
                    coffeeMachineInfo[4] + espresso[3])
        }
        2 -> {
            printCoffeeMachineInfo(coffeeMachineInfo[0] - latte[0],
                    coffeeMachineInfo[1] - latte[1],
                    coffeeMachineInfo[2] - latte[2],
                    coffeeMachineInfo[3] - 1,
                    coffeeMachineInfo[4] + latte[3])
        }
        3 -> {
            printCoffeeMachineInfo(coffeeMachineInfo[0] - cappuccino[0],
                    coffeeMachineInfo[1] - cappuccino[1],
                    coffeeMachineInfo[2] - cappuccino[2],
                    coffeeMachineInfo[3] - 1,
                    coffeeMachineInfo[4] + cappuccino[3])
        }
    }
}

fun filling(scan: Scanner, coffeeMachineInfo: List<Int>) {
    print("Write how many ml of water do you want to add: > ")
    val addWater: Int = scan.nextInt()

    print("Write how many ml of milk do you want to add: > ")
    val addMilk: Int = scan.nextInt()

    print("Write how many grams of coffee beans do you want to add: > ")
    val addCoffeeBeans: Int = scan.nextInt()

    print("Write how many disposable cups of coffee do you want to add: > ")
    val addCups: Int = scan.nextInt()

    println()

    printCoffeeMachineInfo(addWater + coffeeMachineInfo[0],
            addMilk + coffeeMachineInfo[1],
            addCoffeeBeans + coffeeMachineInfo[2],
            addCups + coffeeMachineInfo[3],
            coffeeMachineInfo[4])
}

fun taking(scan: Scanner, coffeeMachineInfo: List<Int>) {
    println("I gave you ${coffeeMachineInfo[4]}")
    println()

    printCoffeeMachineInfo(coffeeMachineInfo[0],
            coffeeMachineInfo[1], coffeeMachineInfo[2],
            coffeeMachineInfo[3], 0)
}


