package de.igorakkerman.xyz

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class XyzTest {

    val xyz = Xyz()

    @Test
    internal fun empty() {
        xyz.process(IntArray(0)) shouldBe 0
    }

    @Test
    internal fun `single char`() {
        xyz.process(intArrayOf(1)) shouldBe 0
    }

    @Test
    internal fun `sequence of numbers`() {
        xyz.process(intArrayOf(1, 2, 3, 4, 5)) shouldBe 0
    }
}
