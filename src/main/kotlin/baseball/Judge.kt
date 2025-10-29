package baseball

class Judge {
    fun compare(player: String, computer: String): String {
        var strike = 0
        var ball = 0

        for ((index, number) in player.withIndex()) {
            if (number == computer[index]) {
                strike++
            } else if (number in computer) {
                ball++
            }
        }

        return when {
            ball == 0 && strike == 0 -> "낫싱"
            ball == 0 -> "${strike}스트라이크"
            strike == 0 -> "${ball}볼"
            else -> "${ball}볼 ${strike}스트라이크"
        }
    }
}