import java.util.Scanner


fun main(args: Array<String>) {
    var string: String = "Hello, World!"
    string = "Hello, Kotlin!"
    println(string)

    println()
    val result = println("text") //call println which show: text: but return specific value
    print(result) //Show: kotlin.Unit

    println()
    val line = readLine()!! //Calling a scanner to read a line
    println(line)


    val number = readLine()!!.toInt() //Calling a scanner to read a line and convert to int
    //It can get NumberFormatException if a user put string text
    println(number)


    println()
    val scanner = Scanner(System.`in`)
    val lineTwo = scanner.nextLine() // read a whole line, i.e. "Hello, Kotlin"
    val num = scanner.nextInt()   // read a number, i.e. 123
    val stringTwo = scanner.next()   // read a string, i.e. "Hello"

    println("LineTwo : $lineTwo    Number is : $num    String two is : $stringTwo")



    /* var str = scanner.next()
     println(str.split(" ")[0])
     println(str.split(" ")[1])
     println(str.split(" ")[2])
     println(str.split(" ")[3])
     println(str.split(" ")[4])


      println(textOne.split(" ")[0])
     println(textOne.split(" ")[1])
     println(textTwo.split(" ")[0])
     println(textTwo.split(" ")[1])
     println(textTwo.split(" ")[2])

     println(textThree.split(" ")[0])
     println(textThree.split(" ")[1])
     println(textThree.split(" ")[2])
     println(textThree.split(" ")[3])
     println(textThree.split(" ")[4])
     */
}