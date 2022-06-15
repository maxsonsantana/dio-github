fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Joao"
    nomes[1] = "Maria"
    nomes[2] = "Jose"
    //nomes[3] = "Pedro"

    for(nome in nomes){
        println(nome)
    }
    println("-----------------------------------------------------\n")

    nomes.sort()
    nomes.forEach{
        println(it)
    }
    println("-----------------------------------------------------\n")

    val nomes2 = arrayOf("Joao", "Maria", "Jose", "Pedro","Sebatiao","Chaves")

    nomes2.sort()
    nomes2.forEach{
        println(it)
    }
    println("-----------------------------------------------------\n")

}