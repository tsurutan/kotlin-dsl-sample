package sample

import org.junit.jupiter.api.Test

class HelloWorldTest {
    @Test
    fun shouldStartWithHello() {
        "Hello World" should start with "Hello"
    }

    @Test
    fun shouldEndWithWorld() {
        "Hello World" should end with "World"
    }
}