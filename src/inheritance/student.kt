package inheritance

import secondary_class.Student

class student(name:String,age:Int,gender:String,var studentid:Int):person(name,age,gender) {
    fun nm() {
        println("name:$name")
        println("age:$age")
        println("gender:$gender")
        println("studnetId:$studentid")
    }
}