fun main() {
    var std=Students()
    std.doubleClick()
    std.rightClick()
}

interface Click {
    fun rightClick()
}
interface ClickListener:Click{
    fun doubleClick()
}
class Students:ClickListener{
    override fun doubleClick() {
        println("doubleClick function is run")
    }

    override fun rightClick() {
        //Body
        println("rightClick function is run")
    }

}