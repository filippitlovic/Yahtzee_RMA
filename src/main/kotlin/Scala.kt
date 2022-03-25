class Scala {
    var numberOne = false
    var numberTwo = false
    var numberThree = false
    var numberFour = false
    var numberFive = false
    var numberSix = false

    var sum = 0
    fun checkScala(dices: Array<Die>) {
        for(item in dices){
            when(item.diceValue) {
                1 -> numberOne = true
                2 -> numberTwo = true
                3 -> numberThree = true
                4 -> numberFour = true
                5 -> numberFive = true
                6 -> numberSix = true
            }
        }
        if(numberOne && numberTwo && numberThree && numberFour && numberFive) {
            sum = 30
            println("Scala!! - $sum")
        }else if(numberTwo && numberThree && numberFour && numberFive && numberSix){
            sum = 40
            println("Scala!! - $sum")
        }
    }
    fun resetScalaValues(){
         numberOne = false
         numberTwo = false
         numberThree = false
         numberFour = false
         numberFive = false
         numberSix = false
    }
}