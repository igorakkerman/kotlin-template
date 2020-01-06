package de.igorakkerman.xyz

import ch.tutteli.atrium.api.fluent.en_GB.toBe
import ch.tutteli.atrium.api.verbs.expect
import org.junit.jupiter.api.Test

internal class XyzTest {

    val xyz = Xyz()

    @Test
    internal fun empty() {
        expect(xyz.process(IntArray(0)))
                .toBe(0)
    }

    @Test
    internal fun `single char`() {
        expect(xyz.process(intArrayOf(1)))
                .toBe(0)
    }

    @Test
    internal fun `sequence of numbers`() {
        expect(xyz.process(intArrayOf(1, 2, 3, 4, 5)))
                .toBe(0)
    }
}
