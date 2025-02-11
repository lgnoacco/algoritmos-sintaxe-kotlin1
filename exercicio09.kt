fun main() {
    print("Digite a temperatura em Fahrenheit: ")
    val fahrenheit = readLine()!!.toDouble() // Lê a entrada e converte para Double
    val celsius = (fahrenheit - 32) * 5 / 9 // Fórmula da conversão para Celsius
    println("A temperatura em Celsius é: $celsius °C")
}
