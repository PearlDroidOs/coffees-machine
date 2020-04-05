fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    timer.checkTime = timerValue
    println(timer.checkTime)
}

data class ByteTimer(var time: Int) {
    var checkTime: Int = this.time
        set(value) {
            field = if (value > 127) 127 else if (value < -128) -128 else value
        }
}