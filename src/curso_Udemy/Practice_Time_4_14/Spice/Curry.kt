package curso_Udemy.Practice_Time_4_14.Spice


class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {

    override fun grind() {
        println("Grinding the curry spice...")
    }

    override fun prepareSpice() {
        grind()
        println("Curry prepared with spiciness [$spiciness] and heat [$heat]")
    }

}