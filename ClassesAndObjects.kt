fun main() {
    val mustang=Car("mustang","petrol",100)
    val beetle=Car("Beetle","Diesel",200)

    println(mustang.name)
    println(mustang.type)
    println(mustang.keRun)
    println("========================");


    println(beetle.name)
    println(beetle.type)
    println(beetle.keRun)
    println("========================");


    mustang.driveCar();
    mustang.applyBreak();
    println("========================");



    beetle.driveCar();
    beetle.applyBreak();
    println("========================");

}
class Car(val name:String, val type:String, var keRun:Int){

    fun driveCar(){
        println("Car is driving.")
    }

    fun applyBreak(){
        println("Applied Brakes")
    }

}