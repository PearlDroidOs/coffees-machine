package machine

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scanner = Scanner(System.`in`)

    val machine = CoffeeMachine(scanner)
    do {
        print("Write action (buy, fill, take, remaining, exit): ")
    } while (machine.startCoffeeMachine(scanner.next()))
}

enum class CoffeesInfo(val water: Int, val milk: Int, val coffeeBeans: Int, val price: Int) {
    ESPRESSO(250, 0, 16, 4),
    LATTE(350, 75, 20, 7),
    CAPPUCCINO(200, 100, 12, 6)
}

enum class Action() {
    BUY, FILL, TAKE, REMAINING, EXIT
}

class CoffeeMachine(val scan: Scanner) {
    //Coffee machine
    val water = 400
    val milk = 540
    val coffeeBeans = 120
    val cupsOfCoffee = 9
    val money: Int = 550
    var coffeeMachineInfo: ArrayList<Int> = arrayListOf(water, milk, coffeeBeans, cupsOfCoffee, money)

    fun startCoffeeMachine(type: String): Boolean {
        println()
        when (type.toUpperCase()) {
            Action.BUY.name -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                buyOperation(scan.next(), coffeeMachineInfo)
            }
            Action.FILL.name -> {
                fill(scan, coffeeMachineInfo)
            }
            Action.TAKE.name -> {
                take(coffeeMachineInfo)
            }
            Action.REMAINING.name -> {
                printCoffeeMachineInfo(coffeeMachineInfo[0],
                        coffeeMachineInfo[1], coffeeMachineInfo[2],
                        coffeeMachineInfo[3], coffeeMachineInfo[4])
            }
        }
        println()
        return (type.toUpperCase() != Action.EXIT.name)
    }

    fun printCoffeeMachineInfo(water: Int, milk: Int, coffeeBeans: Int, cupsOfCoffee: Int, money: Int) {
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$coffeeBeans of coffee beans")
        println("$cupsOfCoffee of disposable cups")
        println("$$money of money")
    }

    fun setCoffeeMachineInfo(water: Int, milk: Int, coffeeBeans: Int, cupsOfCoffee: Int, money: Int) {
        coffeeMachineInfo[0] = water
        coffeeMachineInfo[1] = milk
        coffeeMachineInfo[2] = coffeeBeans
        coffeeMachineInfo[3] = cupsOfCoffee
        coffeeMachineInfo[4] = money
    }

    fun checkEnoughIngredient(water: Int, milk: Int, coffeeBeans: Int, cupsOfCoffee: Int): Boolean {
        var isCheck = true
        when {
            water < 0 -> {
                println("Sorry, not enough water!")
                isCheck = false
            }
            milk < 0 -> {
                println("Sorry, not enough milk!")
                isCheck = false
            }
            coffeeBeans < 0 -> {
                println("Sorry, not enough coffee beans!")
                isCheck = false
            }
            cupsOfCoffee < 0 -> {
                println("Sorry, not enough disposable cups!")
                isCheck = false
            }
        }
        return isCheck
    }


    fun buyOperation(wantBuy: String, coffeeMachineInfo: List<Int>) {
        if (wantBuy != "back") {
            //Info for buying

            var waterTemp = coffeeMachineInfo[0]
            var milkTemp = coffeeMachineInfo[1]
            var coffeeBeansTemp = coffeeMachineInfo[2]
            var cupsOfCoffeeTemp = coffeeMachineInfo[3]

            when (wantBuy.toInt()) {
                1 -> {
                    waterTemp -= CoffeesInfo.ESPRESSO.water
                    milkTemp -= CoffeesInfo.ESPRESSO.milk
                    coffeeBeansTemp -= CoffeesInfo.ESPRESSO.coffeeBeans
                    cupsOfCoffeeTemp -= 1
                    if (checkEnoughIngredient(waterTemp, milkTemp, coffeeBeansTemp, cupsOfCoffeeTemp)) {
                        setCoffeeMachineInfo(waterTemp, milkTemp, coffeeBeansTemp, cupsOfCoffeeTemp, coffeeMachineInfo[4] + CoffeesInfo.ESPRESSO.price)
                        println("I have enough resources, making you a coffee!")
                    }
                }
                2 -> {
                    waterTemp -= CoffeesInfo.LATTE.water
                    milkTemp -= CoffeesInfo.LATTE.milk
                    coffeeBeansTemp -= CoffeesInfo.LATTE.coffeeBeans
                    cupsOfCoffeeTemp -= 1
                    if (checkEnoughIngredient(waterTemp, milkTemp, coffeeBeansTemp, cupsOfCoffeeTemp)) {
                        setCoffeeMachineInfo(waterTemp, milkTemp, coffeeBeansTemp, cupsOfCoffeeTemp, coffeeMachineInfo[4] + CoffeesInfo.LATTE.price)
                        println("I have enough resources, making you a coffee!")
                    }
                }
                3 -> {
                    waterTemp -= CoffeesInfo.CAPPUCCINO.water
                    milkTemp -= CoffeesInfo.CAPPUCCINO.milk
                    coffeeBeansTemp -= CoffeesInfo.CAPPUCCINO.coffeeBeans
                    cupsOfCoffeeTemp -= 1
                    if (checkEnoughIngredient(waterTemp, milkTemp, coffeeBeansTemp, cupsOfCoffeeTemp)) {
                        setCoffeeMachineInfo(waterTemp, milkTemp, coffeeBeansTemp, cupsOfCoffeeTemp, coffeeMachineInfo[4] + CoffeesInfo.CAPPUCCINO.price)
                        println("I have enough resources, making you a coffee!")
                    }
                }
            }
        }
    }

    fun fill(scan: Scanner, coffeeMachineInfo: List<Int>) {
        print("Write how many ml of water do you want to add: > ")
        val addWater: Int = scan.nextInt()

        print("Write how many ml of milk do you want to add: > ")
        val addMilk: Int = scan.nextInt()

        print("Write how many grams of coffee beans do you want to add: > ")
        val addCoffeeBeans: Int = scan.nextInt()

        print("Write how many disposable cups of coffee do you want to add: > ")
        val addCups: Int = scan.nextInt()

        setCoffeeMachineInfo(addWater + coffeeMachineInfo[0],
                addMilk + coffeeMachineInfo[1],
                addCoffeeBeans + coffeeMachineInfo[2],
                addCups + coffeeMachineInfo[3],
                coffeeMachineInfo[4])
    }

    fun take(coffeeMachineInfo: List<Int>) {
        println("I gave you ${coffeeMachineInfo[4]}")

        setCoffeeMachineInfo(coffeeMachineInfo[0],
                coffeeMachineInfo[1], coffeeMachineInfo[2],
                coffeeMachineInfo[3], 0)
    }

}





