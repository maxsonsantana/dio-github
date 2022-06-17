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

    println("----------------------------------------------------\n")
    println("----------------------------------------------------\n")
    for(salario in salarios2){
        println("Salarios Ordenados: "+salario)
    }
    println("Maximo: ${salarios2.maxOrNull()}") //maximo
    println("Minimo: ${salarios2.minOrNull()}") //minimo 
    println("Soma: ${salarios2.sum()}") //soma
    println("Media: ${salarios2.average()}") //media


    println("----------------------------------------------------\n")

    val salariosMaioresQue2000 = salarios2.filter { it > 2000 }
    salariosMaioresQue2000.forEach{
        println("Salarios Maiores que 2000: "+it)
    }

    println("----------------------------------------------------\n")

    println("Salarios entre 2 e 5: "+salarios2.count{it in 2000.0..5000.0}) //conta quantos salarios estao entre 2000 e 5000
    println("Salario encontrado: "+salarios2.find{it == 2000.0}) //procura o primeiro salario que eh 2000 e retorna o valor
    println("Encontrar Qualquer Salario: "+salarios2.any{it == 2000.0}) //verifica se existe algum salario que eh 2000 e retorna true ou false



}