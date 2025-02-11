fun main() {
    print("Digite o lado do quadrado: ")
    val lado = readLine()!!.toDouble() 
    val area = lado * lado 
    val dobroArea = area * 2 
    println("A área do quadrado é: $area")
    println("O dobro da área é: $dobroArea")
}
