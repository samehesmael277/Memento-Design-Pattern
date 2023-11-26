class Game(var playerName: String, var playerScore: Int) {

    fun save(): CheckPointMemento {
        return CheckPointMemento(this.playerName, this.playerScore)
    }

    fun revert(revGame: CheckPointMemento) {
        this.playerName = revGame.getPlayerName()
        this.playerScore = revGame.getPlayerScore()
    }
}