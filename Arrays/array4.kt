fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 3000.0

    salarios.forEach { 
        println(it) 
    }
    println("----------------------------------------------------\n")

    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.1
        println("Salario do funcionario ${index + 1} eh $salario")
    }

    salarios.forEach { 
        println("Novo Salario: "+it) 
    }
    println("----------------------------------------------------\n")
    println("----------------------------------------------------\n")

    val salarios2 = doubleArrayOf(1000.0, 2000.0, 3000.0)
    salarios2.sort()
    salarios2.forEach{
        println("Salarios Ordenados: "+it)
    }

}