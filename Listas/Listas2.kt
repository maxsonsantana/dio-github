fun main(){
    val joao = Funcionarios(nome = "Joao", idade = 30, salario = 1000.0, tipoContrato = "CLT")
    val pedro = Funcionarios(nome = "Pedro", idade = 20, salario = 2000.0, tipoContrato = "Autonomo")
    val maria = Funcionarios(nome = "Maria", idade = 40, salario = 3000.0, tipoContrato = "Estagio")
    val jose = Funcionarios(nome = "Jose", idade = 50, salario = 4000.0, tipoContrato = "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria, jose)
    val funcionarios3 = setOf(joao, maria)

    //Faz a uniao dos conjuntos	e imprime o resultado
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }
    println("\n---------------------------\n")

    //Faz a subtração dos conjuntos	e imprime o resultado
    val resultSubtraction = resultUnion.subtract(funcionarios3)
    resultSubtraction.forEach{ println(it) }
    println("\n---------------------------\n")

    //Faz a intersecção dos conjuntos	e imprime o resultado
    val resultIntersection = funcionarios1.intersect(funcionarios3)
    resultIntersection.forEach{ println(it) }
    println("\n---------------------------\n")

}

data class Funcionarios(
    val nome: String,
    val idade: Int,
    val salario: Double,
    val tipoContrato: String
){
    override fun toString(): String {
        return "Person(nome='$nome', idade=$idade, salario=$salario, tipoContrato='$tipoContrato')"
    }
}