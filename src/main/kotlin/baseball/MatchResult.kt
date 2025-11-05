package baseball

class MatchResult(private val strike: Int, private val ball: Int) {
    fun result(): String {
        return when {
            ball == 0 && strike == 0 -> NOTHING
            ball == 0 -> "${strike}${STRIKE}"
            strike == 0 -> "${ball}${BALL}"
            else -> "${ball}${BALL} ${strike}${STRIKE}"
        }
    }

    fun getStrike(): Int {
        return strike
    }

    companion object {
        private const val NOTHING = "낫싱"
        private const val BALL = "볼"
        private const val STRIKE = "스트라이크"
    }
}