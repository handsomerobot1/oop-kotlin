package nested_inner.innerClass

class Outer{
    var name:String="Mufiq"
    inner class Inner {
        fun display(){
            println(name)
        }
    }
}

fun main (){
    val out =Outer()
    val inner = out.Inner()
    inner.display()
}