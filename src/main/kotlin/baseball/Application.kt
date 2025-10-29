package baseball

fun main() {
    gameStart()
}

fun gameStart() {
    do {
        val computer = Computer().numbers

        while (true) {
            print("숫자를 입력해주세요 : ")
            val reader = readln()
            val player = Player(reader)

            val matchResult = Judge().compare(player, computer)
            matchResult.print()

            if (matchResult.strike == 3) {
                println("computer: $computer")
                println("3개의 숫자를 모두 맞히셨습니다! 게임종료")
                break
            }
        }

        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        val continueOrExit = readln()
    } while (continueOrExit == "1")
}
