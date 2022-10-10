package sample

object with

internal infix fun String.should(_key: start): StartWith {
    return StartWith(this)
}

internal infix fun String.should(_key: end): EndWith {
    return EndWith(this)
}

internal infix fun String.start(_key: with): StartWith {
    return StartWith(this)
}

internal infix fun String.should(callback: String.() -> Unit): Unit {
    this.callback()
}
