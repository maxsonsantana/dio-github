fun main(){
    val values = IntArray(5)
    values[0] = 1
    values[1] = 3
    values[2] = 5
    values[3] = 2
    values[4] = 4

    for(value in values){
        println("Utilizando o for: "+value)
    }
    println("-----------------------------------------------------\n")

    values.forEach{
        println("Utilizando o forEach: "+it)
    }
    println("-----------------------------------------------------\n")

    for(index in values.indices){
        println("Utilizando o for com indices: "+values[index])
    }
    println("-----------------------------------------------------\n")

    values.sort()
    for(value in values){
        println("Utilizando o sort: "+value)
    }

    

}