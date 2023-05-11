//Problem: https://www.hackerrank.com/challenges/the-time-in-words
fun main(args: Array<String>) {
    println(timeInWords(5, 47)) //thirteen minutes to six
    println(timeInWords(3, 0)) //three o' clock
    println(timeInWords(7, 15)) //quarter past seven
}

fun timeInWords(hour: Int, minute: Int) : String {
    if (hour !in 1..12 || minute !in 0..59) return "Incorrect time"
    if (minute == 0) {
        val hourAsWord = convertNumberToWord(hour)
        return "$hourAsWord o' clock"
    }
    if (minute in 1..30) {
        val minuteAsWord = convertNumberToWord(minute)
        val hourAsWord = convertNumberToWord(hour)
        val minuteAsPluralOrSingular = if (minute == 1) "minute" else "minutes"
        if (minute == 15 || minute == 30) {
            return "$minuteAsWord past $hourAsWord"
        }
        return "$minuteAsWord $minuteAsPluralOrSingular past $hourAsWord"
    } else {
        val remainingMinutes = 60 - minute
        val remainingMinutesAsWord = convertNumberToWord(remainingMinutes)
        val nextHourAsWord = convertNumberToWord(hour + 1)
        val minuteAsPluralOrSingular = if (remainingMinutes == 1) "minute" else "minutes"
        if (remainingMinutes == 15) {
            return "$remainingMinutesAsWord to $nextHourAsWord"
        }
        return "$remainingMinutesAsWord $minuteAsPluralOrSingular to $nextHourAsWord"
    }
}

fun convertNumberToWord(number: Int) : String {
    val units = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
    val unit: Int = if (number > 9) (number % 10) else number
    return when (number) {
        15 -> "quarter"
        in 0..19 -> units.get(number)
        20 -> "twenty"
        in 21..29 -> "twenty " + units.get(unit)
        30 -> "half"
        else -> ""
    }
}