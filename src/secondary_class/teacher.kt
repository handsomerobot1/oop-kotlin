package secondary_class

import java.net.Inet4Address

class teacher {
    var name:String=""
    var id:Int=0
    var address:String=""

    constructor()
    constructor(name:String) {
        this.name = name
    }
    constructor(name: String,id:Int){
        this.name=name
        this.id=id
    }
    constructor(name: String,id:Int,address:String){
        this.name=name
        this.id=id
        this.address=address
    }
    fun display(){
        println("teacher-name:$name,id:$id,address:$address")
    }
}

class Student {
    var name:String=""
    var id:Int=0
    var address:String=""

    constructor()
    constructor(name:String){
        this.name=name
    }
    constructor(name: String,id:Int){
        this.name=name
        this.id=id

    }
    constructor(name: String,id:Int,address:String){
        this.name=name
        this.id=id
        this.address=address
    }
    fun display(){
        println("Student-name:$name,id:$id,address:$address")
    }
}

fun main(){
    val teacher=teacher()
    teacher.name="alamin"
    teacher.id=2222
    teacher.address="keraniganj"

    val student=Student()
    student.name="alamin"
    student.id=2222
    student.address="keraniganj"

    teacher.display()
    student.display()

}