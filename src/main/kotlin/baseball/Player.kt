package baseball

class Player(val input: String) {
    val numbers = mutableListOf<Int>()

    init {
        if (input.length > 3) {
            throw IllegalArgumentException("3자리 수를 입력하세요.")
        }

        for (number in input) {
            val num = number.digitToIntOrNull() ?: throw IllegalArgumentException("숫자를 입력하세요.")
            if (num !in 1..9) {
                throw IllegalArgumentException("1부터 9까지의 숫자를 입력하세요.")
            }

            if (num in numbers) {
                throw IllegalArgumentException("중복된 숫자는 허용하지 않습니다.")
            }

            numbers.add(num)
        }
    }
}