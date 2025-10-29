package baseball

class MatchResult(val strike: Int, val ball: Int) {
    fun print() {
        println(
            when {
                ball == 0 && strike == 0 -> "낫싱"
                ball == 0 -> "${strike}스트라이크"
                strike == 0 -> "${ball}볼"
                else -> "${ball}볼 ${strike}스트라이크"
            }
        )
    }
}