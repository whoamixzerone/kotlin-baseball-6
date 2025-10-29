package baseball

import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class PlayerTest {
    @Test
    fun `플레이어 입력값이 4자리 이상이면 예외가 발생한다`() {
        assertThatThrownBy { Player("1234") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("3자리 수를 입력하세요.")
    }

    @Test
    fun `1부터 9까지의 범위에 벗어난 숫자면 예외가 발생한다`() {
        assertThatThrownBy { Player("012") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("1부터 9까지의 숫자를 입력하세요.")
    }

    @Test
    fun `입력값이 숫자가 아니면 예외가 발생한다`() {
        assertThatThrownBy { Player("a01") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("숫자를 입력하세요.")
    }
}