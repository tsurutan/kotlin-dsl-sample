package sample

import org.junit.jupiter.api.Test

class HelloWorldTest {
    @Test
    fun shouldStartWithHelloAndEndWithWorld() {
        "Hello World" should start with "Hello" and end with "World"
    }
}