package class_work

abstract class Library {
    abstract fun addbook(book:book)
    abstract fun addbooks()
    abstract fun  findbookbyaurthor(aurthor:String)
}
abstract class publiclibrary:Library(){

}