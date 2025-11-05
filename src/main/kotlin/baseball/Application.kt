package baseball

fun main() {
    gameStart()
    println("게임 종료")
}

fun gameStart() {
    println("숫자 야구 게임을 시작합니다.")

    do {
        val computer = Computer()

        while (true) {
            print("숫자를 입력해주세요 : ")
            val reader = readln()
            val player = Player(reader)

            val matchResult = Judge().compare(player, computer.getNumbers())
            val result = matchResult.result()
            println(result)

            if (matchResult.getStrike() == 3) {
                println("3개의 숫자를 모두 맞히셨습니다! 게임종료")
                break
            }
        }

        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        val continueOrExit = readln()
    } while (continueOrExit == "1")
}
