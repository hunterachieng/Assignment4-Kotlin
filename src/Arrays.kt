import java.util.*

fun main (){
    names("Curt", "Richard","Mike","Andrew")
    citiesArray()
    numbers()
    println(Arrays.toString(namesArray("Synthia","Hunter","Achieng")))

}
fun names (first:String,second:String,third:String,fourth:String){
 var namesArray = arrayOf("$first, $second, $third, $fourth")
    println(Arrays.toString(namesArray))
}
fun citiesArray (){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { cities->
        println(cities.capitalize())

    }

}
fun numbers (){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1] + numbers[4]
    println(sum)
    println(numbers.indexOf(158))
  var number = numbers.sortedArray()
    println(Arrays.toString(number))

}
fun namesArray (name1:String,name2:String,name3:String):Array<String>{
     return arrayOf (name1,name2,name3)
}