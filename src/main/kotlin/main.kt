const val COMMISSION_RATE = 75
const val COMMISSION_MINIMAL = 3500  //35 руб в копейках

fun main() {

    print("Введите сумму перевода (в копейках): ")
    val amount = readLine()!!.toInt()
    val commission = amount / 10000 * COMMISSION_RATE
    val finishCommission : Int = if (commission >= COMMISSION_MINIMAL) commission else COMMISSION_MINIMAL

    println("Cумма коммисии за перевод $amount копеек будет $finishCommission копеек.")

}