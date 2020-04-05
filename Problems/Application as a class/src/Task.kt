class Application(val name: String) {

    // write the run method here
    fun run(arrayStr: Array<String>) {
        println(name)
        for (str in arrayStr)
            println(str)
    }
}