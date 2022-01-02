package kt

@JvmInline
value class SomeTime(val value: Double)

data class Holidays(val from: SomeTime, val to:SomeTime?, val destiation: String)

fun main() {
    val constructors = Holidays::class.constructors

    require(constructors.size==1)

    val bestConst = constructors.first()

    val args = listOf(SomeTime(1.0), SomeTime(2.0), "foo")

    val someHolidays = bestConst.call(*args.toTypedArray())
    // ...and boom: IllegalArgumentException: argument type mismatch
}
