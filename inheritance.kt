fun main(){
    var car=Car("ToyotaSedan","Toyota","Blue",12)
    car.carry(4)
    car.identity("white","subaru","legacy")
   println(car.calculatePackingFee(1))
    var bus=Bus("Scania","red","highway",64)
   println(bus.maximumTripFare(3.000))
    println(bus.calculatePackingFee())



}
open class Car( var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if (people<=capacity) {
            println("carry $people passengers")
        }else{ println("over capacity by $x people")}

    }
    fun identity(color:String,make:String,model:String){
        println("i am white subaru legacy")

    }
    fun calculatePackingFee(hours:Int):Int{
        return hours*20

    }

}
class Bus( make:String, color:String, model:String, capacity:Int):Car(make,model,color,capacity) {


    fun maximumTripFare(fare: Double): Double {
        return fare

    }
    fun calculatePackingFee():Int{
       return capacity+64

    }

}