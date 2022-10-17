package sample

internal infix fun String.should(_key: start): StartWith {
    return StartWith(this)
}

internal infix fun String.should(_key: end): EndWith {
    return EndWith(this)
}

class AndString(private val value: String) {
    infix fun and(key: end): EndWith {
        return value.should(key)
    }
    infix fun and(key: start): StartWith {
        return value.should(key)
    }
}