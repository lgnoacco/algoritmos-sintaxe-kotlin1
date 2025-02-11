fun main() {
    print("Digite quanto você ganha por hora: ")
    val valorHora = readLine()!!.toDouble() 

    print("Digite o número de horas trabalhadas no mês: ")
    val horasTrabalhadas = readLine()!!.toDouble() 

    val salario = valorHora * horasTrabalhadas 

    println("Seu salário no mês será: R$ $salario")
}
