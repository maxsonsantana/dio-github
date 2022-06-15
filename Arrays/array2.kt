fun main(){
    val values = intArrayOf(1, 2, 3, 7, 8, 9, 10, 4, 5, 6)
    
    values.forEach {
        println("Array com forEach: "+it)
    }
    println("---------------------------\n")

    values.sort()
        for(value in values){
            println("Array com sort: "+value)
        }
    println("---------------------------\n")
}