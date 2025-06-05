package curso_Udemy.practice_Time_4_10.Spice



class Curry(spiceName: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(spiceName, spiciness, color), Grinder {

    override fun grind() {
        println("Grinding the curry spice...")
    }

    override fun prepareSpice() {
        grind()
        println("Curry prepared with spiciness [$spiciness] and heat [$heat]")
    }

}