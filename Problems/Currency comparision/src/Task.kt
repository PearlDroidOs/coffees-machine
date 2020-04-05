import java.util.Scanner

enum class Country(val country: String, val currency: String) {
    GERMANY("Germany", "Euro"),
    MALI("Mali", "CFA franc"),
    DOMINICA("Dominica", "Eastern Caribbean dollar"),
    CANADA("Canada", "Canadian dollar"),
    SPAIN("Spain", "Euro"),
    AUSTRALIA("Australia", "Australian dollar"),
    BRAZIL("Brazil", "Brazilian real"),
    SENEGAL("Senegal", "CFA franc"),
    FRANCE("France", "Euro"),
    GRENADA("Grenada", "Eastern Caribbean dollar"),
    KIRIBATI("Kiribati", "Australian dollar"),
    NULL("", "");

    companion object {
        fun getCountry(country: String): Country {
            for (enum in values()) {
                if (country.toUpperCase() == enum.name.toUpperCase()) {
                    return enum
                }
            }
            return NULL
        }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val str = input.nextLine().split(" ")
    val country = Country
    val str1 = country.getCountry(str[0])
    val str2 = country.getCountry(str[1])

    println(str1.currency == str2.currency)
}