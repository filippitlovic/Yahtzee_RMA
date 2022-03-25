class Poker {
    var PokerExists = false
    fun checkPoker(dices: Array<Die>) {
        var sum = 0
        for(item in dices) {
            var dieSum = 0
            var count = 0
            for (item2 in dices) {
                if (item.getRolledDiceValue() == item2.getRolledDiceValue()){
                    dieSum += item2.diceValue
                    count++
                }
                if(count >= 5) {
                    sum = 40 + dieSum
                   PokerExists = true

                }
            }
            if(PokerExists == true)
                println("Poker!! - $sum")
        }
    }
}