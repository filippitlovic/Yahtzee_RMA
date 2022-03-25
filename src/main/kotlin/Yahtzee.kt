class Yahtzee {
    var YahtzeeExists = false
    fun checkYahtzee(dices: Array<Die>) {
        var sum = 0
        for(item in dices) {
            var count = 0
            for (item2 in dices) {
                if (item.getRolledDiceValue() == item2.getRolledDiceValue()){
                    count++
                }
                if(count == 6) {
                    sum = 50 + item.diceValue*6
                    YahtzeeExists = true
                }
        }

        if(YahtzeeExists == true)
            println("Yahtzee!! - $sum")
        }
    }
}

