package baseball

class Judge {
    fun compare(player: Player, computer: MutableList<Int>): MatchResult {
        var strike = 0
        var ball = 0

        for ((i, number) in player.numbers.withIndex()) {
            if (number == computer[i]) {
                strike++
            } else if (number in computer) {
                ball++
            }
        }

        return MatchResult(strike, ball)
    }
}