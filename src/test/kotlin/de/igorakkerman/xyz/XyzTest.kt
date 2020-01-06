package de.igorakkerman.xyz

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class XyzTest {

    val kata = Xyz()

    @Test
    internal fun empty() {
        assertThat(kata.process(IntArray(0)))
                .isEqualTo(0)
    }

    @Test
    internal fun `single char`() {
        assertThat(kata.process(intArrayOf(1)))
                .isEqualTo(0)
    }

    @Test
    internal fun `sequence of numbers`() {
        assertThat(kata.process(intArrayOf(1, 2, 3, 4, 5)))
                .isEqualTo(0)
    }
}
