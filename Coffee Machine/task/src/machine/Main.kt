package machine

import java.util.*
import kotlin.collections.ArrayList

//Coffee machine
const val water = 400
const val milk = 540
const val coffeeBeans = 120
const val cupsOfCoffee = 9
const val money: Int = 550
var coffeeMachineInfo:ArrayList<Int> = arrayListOf(water, milk, coffeeBeans, cupsOfCoffee, money)


fun main() {
    val scanner = Scanner(System.`in`)

    do {
        print("Write action (buy, fill, take, remaining, exit): ")
        val strCommand= scanner.next()
        println()
        when(strCommand) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                buyOperation(scanner.next(), coffeeMachineInfo)
            }
            "fill" -> fill(scanner, coffeeMachineInfo)
            "take" -> take(scanner, coffeeMachineInfo)
            "remaining" -> printCoffeeMachineInfo(coffeeMachineInfo[0],
                    coffeeMachineInfo[1], coffeeMachineInfo[2],
                    coffeeMachineInfo[3], coffeeMachineInfo[4])
        }
        println()
    }while( strCommand != "exit" )
}

fun printCoffeeMachineInfo(water: Int, milk: Int, coffeeBeans: Int, cupsOfCoffee: Int, money: Int) {
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$coffeeBeans of coffee beans")
    println("$cupsOfCoffee of disposable cups")
    println("$$money of money")
}

fun setCoffeeMachineInfo(water: Int, milk: Int, coffeeBeans: Int, cupsOfCoffee: Int, money: Int){
    coffeeMachineInfo[0] = water
    coffeeMachineInfo[1] = milk
    coffeeMachineInfo[2] = coffeeBeans
    coffeeMachineInfo[3] = cupsOfCoffee
    coffeeMachineInfo[4] = money
}

fun checkEnoughIngredient(water: Int, milk: Int, coffeeBeans: Int, cupsOfCoffee: Int): Boolean{
    var isCheck = true
    when {
        water < 0 -> {
            println("Sorry, not enough water!")
            isCheck = false
        }
        milk < 0 ->{ println("Sorry, not enough milk!")
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
    if(wantBuy != "back") {
        //Info for buying
        val espresso = arrayListOf(250, 0, 16, 4)
        val latte = arrayListOf(350, 75, 20, 7)
        val cappuccino = arrayListOf(200, 100, 12, 6)

        var waterTemp = coffeeMachineInfo[0]
        var milkTemp = coffeeMachineInfo[1]
        var coffeeBeansTemp = coffeeMachineInfo[2]
        var cupsOfCoffeeTemp = coffeeMachineInfo[3]

        when (wantBuy.toInt()) {
            1 -> {
                waterTemp -= espresso[0]
                milkTemp -= espresso[1]
                coffeeBeansTemp -= espresso[2]
                cupsOfCoffeeTemp -= 1
                if(checkEnoughIngredient(waterTemp, milkTemp,coffeeBeansTemp, cupsOfCoffeeTemp)) {
                    setCoffeeMachineInfo(waterTemp, milkTemp, coffeeBeansTemp, cupsOfCoffeeTemp, coffeeMachineInfo[4] + espresso[3])
                    println("I have enough resources, making you a coffee!")
                }
            }
            2 -> {
                waterTemp -= latte[0]
                milkTemp -= latte[1]
                coffeeBeansTemp -= latte[2]
                cupsOfCoffeeTemp -= 1
                if(checkEnoughIngredient(waterTemp, milkTemp,coffeeBeansTemp, cupsOfCoffeeTemp)) {
                    setCoffeeMachineInfo(waterTemp, milkTemp, coffeeBeansTemp, cupsOfCoffeeTemp, coffeeMachineInfo[4] + latte[3])
                    println("I have enough resources, making you a coffee!")
                }
            }
            3 -> {
                waterTemp -= cappuccino[0]
                milkTemp -= cappuccino[1]
                coffeeBeansTemp -= cappuccino[2]
                cupsOfCoffeeTemp -= 1
                if(checkEnoughIngredient(waterTemp, milkTemp,coffeeBeansTemp, cupsOfCoffeeTemp)) {
                    setCoffeeMachineInfo(waterTemp, milkTemp, coffeeBeansTemp, cupsOfCoffeeTemp, coffeeMachineInfo[4] + cappuccino[3])
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

fun take(scan: Scanner, coffeeMachineInfo: List<Int>) {
    println("I gave you ${coffeeMachineInfo[4]}")

    setCoffeeMachineInfo(coffeeMachineInfo[0],
            coffeeMachineInfo[1], coffeeMachineInfo[2],
            coffeeMachineInfo[3], 0)
}
