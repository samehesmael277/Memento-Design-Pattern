import java.util.*

class Caretaker() {
    private val saves = Stack<CheckPointMemento>()

    fun save(game: Game) {
        saves.push(game.save())
    }

    fun revert(game: Game) {
        game.revert(saves.pop())
    }
}