package baseball

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ComputerTest {
    @Test
    fun `컴퓨터 입력값이 3자리 여야 한다`() {
        // given
        val computer = Computer()

        // when
        val result = computer.getNumbers()

        // then
        assertThat(result.size).isEqualTo(3)
    }

    @Test
    fun `컴퓨터 3개의 값이 전부 달라야 한다`() {
        // given
        val computer = Computer()
        val toSetNumber = computer.getNumbers().toSet()

        // when

        // then
        assertThat(toSetNumber.size).isEqualTo(3)
    }
}