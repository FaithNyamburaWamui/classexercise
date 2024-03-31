fun main() {
   var person = Person("wamui",20,"Kenya")
    println(person.age)
    println(person.country)
    println(person.name)

    var rectangle = Rectangle(20,30)
    rectangle.calculateArea()

var student = Student("Faith",20,70)
    student.isEligible()

}
class Person(var name:String, var age:Int,var country:String){

}
class Rectangle(var width:Int,var height:Int){
    fun calculateArea(){
        var area= height*width
        println(area)
    }

    }
class Student(var name:String,var age:Int,var grade:Int){
fun isEligible(){
    if(grade==70){
        println("eligible for promotion")
    }else{
        println("not eligible")
    }
}
}
