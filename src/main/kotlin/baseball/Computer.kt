package baseball

import camp.nextstep.edu.missionutils.Randoms

class Computer {
    val numbers = mutableListOf<Int>()

    init {
        while (numbers.size < 3) {
            val randomNumber = Randoms.pickNumberInRange(1, 9)
            if (randomNumber !in numbers) {
                numbers.add(randomNumber)
            }
        }
    }
}