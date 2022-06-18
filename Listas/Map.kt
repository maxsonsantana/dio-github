fun main(){
    val pair: Pair<String, Double> = Pair("John", 23.5)
    val map1 = mapOf(pair)
    val map2 = mapOf(
        "John" to 77.5,
        "Jane" to 88.5,
        "Jack" to 99.5
    )

    map1.forEach {(k, v) ->
        println("Chave: $k -  Valor: $v")        
    }
    println("\n-----------------------------------------------------\n")

    map2.forEach {(k, v) ->
        println("Chave: $k -  Valor: $v")        
    }
    println("\n-----------------------------------------------------\n")


}