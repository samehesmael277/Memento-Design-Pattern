class CheckPointMemento(private val playerName:String, private val playerScore:Int) {

    fun getPlayerName():String {
        return this.playerName
    }

    fun getPlayerScore(): Int {
        return this.playerScore
    }
}