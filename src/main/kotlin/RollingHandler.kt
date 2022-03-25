class RollingHandler {
    var yahtzeeChecker = Yahtzee()
    var pokerChecker = Poker()
    var scalaChecker = Scala()
    fun rollTheDice(dices: Array<Die>) {
        for (item in dices) {
            if(!item.getLockedDiceValue())
                item.rollTheDice()
            if(item.getRolledDiceValue() != 0) {
                println("${dices.indexOf(item) + 1}. die is  ${item.getRolledDiceValue()} ${item.getRolledDiceDescription()}")
            }
        }
    }

    fun lockTheDices(listOfLockedDices : List<String>){
        for(item in listOfLockedDices) {
            when (item.toInt()) {
                1 -> {
                    println("1. die with value ${firstDice.getRolledDiceValue()} is locked")
                    firstDice.lockTheDice()
                }
                2 -> {
                    println("2. die with value ${secondDice.getRolledDiceValue()} is locked")
                    secondDice.lockTheDice()
                }
                3 -> {
                    println("3. die with value ${thirdDice.getRolledDiceValue()} is locked")
                    thirdDice.lockTheDice()
                }
                4 -> {
                    println("4. die with value ${fourthDice.getRolledDiceValue()} is locked")
                    fourthDice.lockTheDice()
                }
                5 -> {
                    println("5. die with value ${fifthDice.getRolledDiceValue()} is locked")
                    fifthDice.lockTheDice()
                }
                6 -> {
                    println("6. die with value ${sixthDice.getRolledDiceValue()} is locked")
                    sixthDice.lockTheDice()
                }
            }
        }
    }

    fun checkResults(){
        yahtzeeChecker.checkYahtzee(dices)
        pokerChecker.checkPoker(dices)
        scalaChecker.checkScala(dices)

    }

    fun chooseDices(listOfLockedDice: MutableList<String>){
        println("How many dice you want to lock?")
        var numberOfLockDice = readLine()?.toInt()
        if(numberOfLockDice == 6){
            diceThrows = 4
        }else{
        println("Enter which die you want to lock")
        var lockedDie: String? = null
        var i: Int = 0
        if (numberOfLockDice != null) {
            while(i < numberOfLockDice.toInt()){
                i++
                println("Enter $i. die")
                lockedDie= readLine()

                if (lockedDie != null) {
                    listOfLockedDice.add(lockedDie)
                }
            }
        }
    }
    }

}