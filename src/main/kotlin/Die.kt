import kotlin.random.Random
//
class Die {
    var diceValue  = 0
    var diceIsLocked = false
    fun rollTheDice(){
        diceValue = Random.nextInt(1,7)
    }
    fun getRolledDiceValue():Int{
        return diceValue
    }
    fun getLockedDiceValue(): Boolean {
        return diceIsLocked
    }
    fun lockTheDice(){
        diceIsLocked = true
    }
    fun getRolledDiceDescription(): String{
        if(diceIsLocked) {
            return "[Locked]"
        } else
            return ""
    }
}