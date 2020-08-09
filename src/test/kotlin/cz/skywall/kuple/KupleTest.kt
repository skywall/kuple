package cz.skywall.kuple

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KupleTest {

    @Test
    fun `create tuples`() {
        Kuple()
        Kuple(1)
        Kuple("A")
        Kuple(1, Throwable())
        Kuple(1, Throwable(), "a")
        Kuple(1, Throwable(), "a", Any())
    }

    @Test
    fun `tuple destruction to parameters`() {
        val (t1, t2) = Kuple("a", 1)
        assertEquals(t1, "a")
        assertEquals(t2, 1)
    }

    @Test
    fun `print tuple results in readable string`() {
        val t = Kuple("a", 1)
        assertEquals(t.toString(), "(a, 1)")
    }

    @Test
    fun `iteration over tuple prints all of the items`() {
        val k = Kuple("a", 1, Throwable())
        Pair("A", 1)
    }

    @Test
    fun `sum of two tuples returns concatenated tuple`() {
        val t1 = Kuple("a", 2)
        val t2 = Kuple(1, "A")

        val sum = t1 + t2
        assertEquals(sum.toString(), "(a, 2, 1, A)")
    }
}