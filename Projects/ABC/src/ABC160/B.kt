fun main (args: Array<String>) {
    val userInput : String = readLine()!!
    val userMoney : Int    = userInput.toInt()
    val fiveHundredCoins:Int = Math.floor(userMoney.toDouble()/500.0).toInt()
    val fiveYenCoins : Int  = Math.floor((userMoney.toDouble() - (fiveHundredCoins*500).toDouble()) / 5.0).toInt()
    println(fiveHundredCoins*1000 + fiveYenCoins * 5)
}