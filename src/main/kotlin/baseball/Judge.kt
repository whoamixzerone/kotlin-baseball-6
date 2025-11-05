package baseball

class Judge {
    fun compare(player: Player, computer: List<Int>): MatchResult {
        var strike = 0
        var ball = 0

        val playerNumbers = player.getNumbers()

        for ((i, number) in playerNumbers.withIndex()) {
            if (number == computer[i]) {
                strike++
            } else if (number in computer) {
                ball++
            }
        }

        return MatchResult(strike, ball)
    }
}