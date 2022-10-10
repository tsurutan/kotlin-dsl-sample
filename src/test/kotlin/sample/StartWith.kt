package sample

import org.junit.jupiter.api.Assertions.assertTrue

object start {
}

class StartWith(private val value: String) {
    infix fun with(prefix: String) {
        assertTrue(value.startsWith(prefix))
    }
}
