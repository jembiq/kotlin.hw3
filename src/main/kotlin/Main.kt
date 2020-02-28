fun main() {
    val publishedAgo : Int = 5_000;

    val message = "${makeMessage(publishedAgo)} назад"

    print(message)
}

fun makeMessage(
    timeInSeconds: Int
): String = when (timeInSeconds) {
    in    0  ..    60        -> "меньше минуты"
    in   61  ..    90        -> "около минуты"
    in   91  ..   299        -> "около двух минут"
    in  300  ..   419        -> "пять минут"
    in  420  ..   599        -> "семь минут"
    in  600  ..  1200        -> "десять минут"
    in 1_201 .. 1_800        -> "около двадцати минут"
    in 1_801 .. 2_400        -> "около тридцати минут"
    in 2_401 .. 3_000        -> "около сорока минут"
    in 3_001 .. 3_599        -> "около пятидесяти минут"
    in 3_600 .. 4_000        -> "около часа"
    in 4_001 ..Int.MAX_VALUE -> "более часа"
    else -> "?"
}
