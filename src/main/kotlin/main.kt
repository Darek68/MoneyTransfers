const val COMMISSION_RATE = 75
const val COMMISSION_MINIMAL = 3500  //35 руб в копейках

fun main() {

    print("Введите сумму перевода (в копейках): ")
    val amount = readLine()!!.toInt()
    val commission : Int = if (amount / 10000 * COMMISSION_RATE >= COMMISSION_MINIMAL) amount / 10000 * COMMISSION_RATE else COMMISSION_MINIMAL

    println("Cумма коммисии за перевод $amount копеек будет $commission копеек.")

}