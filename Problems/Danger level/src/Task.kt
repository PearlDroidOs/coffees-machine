enum class DangerLevel {
    HIGH {
        override fun getLevel() = 3
    },
    MEDIUM {
        override fun getLevel() = 2
    },
    LOW {
        override fun getLevel() = 1
    };

    abstract fun getLevel(): Int
}

fun main() {
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM

    println(high.getLevel() > medium.getLevel()) // true
}