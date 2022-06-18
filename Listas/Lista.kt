fun main(){
    val joao = Person(nome = "Joao", idade = 30, salario = 1000.0, tipoContrato = "CLT")
    val pedro = Person(nome = "Pedro", idade = 20, salario = 2000.0, tipoContrato = "Autonomo")
    val maria = Person(nome = "Maria", idade = 40, salario = 3000.0, tipoContrato = "Estagio")
    val jose = Person(nome = "Jose", idade = 50, salario = 4000.0, tipoContrato = "CLT")

    val people = listOf(joao, pedro, maria, jose)

    people.forEach {
        println("${it.nome} tem ${it.idade} anos")
    }

    println("\n------------------------------\n")
    people
        .sortedBy { it.idade }
        .forEach { println(it) }
    
    println("\n------------------------------\n")
    people
        .groupBy { it.tipoContrato }
        .forEach { println(it) }
}

data class Person(
    val nome: String,
    val idade: Int,
    val salario: Double,
    val tipoContrato: String
){
    override fun toString(): String {
        return "Person(nome='$nome', idade=$idade, salario=$salario, tipoContrato='$tipoContrato')"
    }
}