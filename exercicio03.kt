fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readLine()?.toIntOrNull() ?: 0

    print("Digite o segundo número: ")
    val numero2 = readLine()?.toIntOrNull() ?: 0

    val soma = numero1 + numero2
    println("A soma é: $soma")
}
