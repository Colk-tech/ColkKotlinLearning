fun main (args: Array<String>) {
    val userInput : String = readLine()!!
    val sameArray = arrayListOf(2,4)
    var isSameFlag:Boolean = true
    for (i:Int in sameArray) {
        if(!(userInput[i] == userInput[i+1])) {
            isSameFlag = false
        }
    }
    if (isSameFlag) {
        println("Yes")
    } else {
        println("No")
    }
}