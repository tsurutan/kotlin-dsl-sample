package sample

import org.junit.jupiter.api.Assertions.assertTrue


object end
class EndWith(private val value: String) {
    infix fun with(suffix: String) {
        assertTrue(value.endsWith(suffix))
    }
}