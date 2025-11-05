package baseball

import camp.nextstep.edu.missionutils.Randoms

class Computer {
    private var numbers: List<Int> = emptyList()

    init {
        val numbers = mutableListOf<Int>()

        while (numbers.size < 3) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (randomNumber !in numbers) {
                numbers.add(randomNumber)
            }
        }
        this.numbers = numbers
    }

    fun getNumbers(): List<Int> {
        return numbers
    }

    override fun toString(): String {
        return "Computer(numbers=$numbers)"
    }

}