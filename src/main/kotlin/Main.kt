var firstDice = Die()
var secondDice = Die()
var thirdDice = Die()
var fourthDice = Die()
var fifthDice = Die()
var sixthDice = Die()

var handler = RollingHandler()
val dices = arrayOf<Die>(firstDice,secondDice,thirdDice,fourthDice,fifthDice,sixthDice)
var listOfLockedDices = mutableListOf<String>()
var diceThrows:Int = 1


fun playYamb(){
    while(diceThrows <= 3){
    if(diceThrows < 3) {
        println("______________")
        println("$diceThrows. throw")
        println("______________")
        diceThrows++
        handler.rollTheDice(dices)
        handler.checkResults()
        handler.scalaChecker.resetScalaValues()
        handler.chooseDices(listOfLockedDices)
        handler.lockTheDices(listOfLockedDices)
    }else if(diceThrows == 3) {
        println("______________")
        println("$diceThrows. throw")
        println("______________")
        diceThrows++
        handler.rollTheDice(dices)
        handler.checkResults()
    }
}
    println("Your turn is over")
}

fun main() {
    playYamb()
}