package baseball

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class JudgeTest {

    lateinit var judge: Judge

    @BeforeEach
    fun setUp() {
        judge = Judge()
    }

    @Test
    fun `3 스트라이크`() {
        // given
        val player = Player("425")

        // when
        val result = judge.compare(player, mutableListOf(4, 2, 5))

        // then
        assertThat(result).isEqualTo("3스트라이크")
    }

    @Test
    fun `2 스트라이크`() {
        // given
        val player = Player("421")

        // when
        val result = judge.compare(player, mutableListOf(4, 2, 5))

        // then
        assertThat(result).isEqualTo("2스트라이크")
    }

    @Test
    fun `1 스트라이크`() {
        // given
        val player = Player("461")

        // when
        val result = judge.compare(player, mutableListOf(4, 2, 5))

        // then
        assertThat(result).isEqualTo("1스트라이크")
    }

    @Test
    fun `3 볼`() {
        // given
        val player = Player("254")

        // when
        val result = judge.compare(player, mutableListOf(4, 2, 5))

        // then
        assertThat(result).isEqualTo("3볼")
    }

    @Test
    fun `2 볼`() {
        // given
        val player = Player("456")

        // when
        val result = judge.compare(player, mutableListOf(5, 4, 7))

        // then
        assertThat(result).isEqualTo("2볼")
    }

    @Test
    fun `1 볼`() {
        // given
        val player = Player("651")

        // when
        val result = judge.compare(player, mutableListOf(4, 2, 5))

        // then
        assertThat(result).isEqualTo("1볼")
    }

    @Test
    fun `1 볼 1 스트라이크`() {
        // given
        val player = Player("451")

        // when
        val result = judge.compare(player, mutableListOf(4, 2, 5))

        // then
        assertThat(result).isEqualTo("1볼 1스트라이크")
    }

    @Test
    fun `2 볼 1 스트라이크`() {
        // given
        val player = Player("452")

        // when
        val result = judge.compare(player, mutableListOf(4, 2, 5))

        // then
        assertThat(result).isEqualTo("2볼 1스트라이크")
    }

    @Test
    fun `낫싱`() {
        // given
        val player = Player("136")

        // when
        val result = judge.compare(player, mutableListOf(4, 2, 5))

        // then
        assertThat(result).isEqualTo("낫싱")
    }
}