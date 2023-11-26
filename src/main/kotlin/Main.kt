fun main(args: Array<String>) {
    val game = Game("Sameh Esmael", 0)
    val caretaker = Caretaker()

    caretaker.save(game)

    game.playerScore = 50

    println("Before undo: ${game.playerScore}")

    caretaker.revert(game)
    println("After undo: ${game.playerScore}")

    game.playerScore = 60

    println("Before save: ${game.playerScore}")

    caretaker.save(game)

    println("After save: ${game.playerScore}")
}