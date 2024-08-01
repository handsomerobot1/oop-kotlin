package nested_inner

class Outer{
    var name:String="musfiq"
    class Nested{
        var outer=Outer()
        fun display(){
            println(outer.name)
        }
    }
}

fun main(){
    val out=Outer()
    val nested=Outer.Nested()
    nested.display()
}