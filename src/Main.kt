// João Vitor Gomes -- GRR: 20234594
// Desenvolvido em IntelliJ IDEA 2026 2.3

import java.util.Scanner

fun somar(n1: Double, n2: Double): Double {
    return n1 + n2
}

fun subtrair(n1: Double, n2: Double): Double {
    return n1 - n2
}

fun multiplicar(n1: Double, n2: Double): Double {
    return n1 * n2
}

fun dividir(n1: Double, n2: Double): Double {
    return n1 / n2
}

fun imprimirResultado(resultado: Double) {
    println("O resultado é: $resultado")
}

fun main() {
    val scanner = Scanner(System.`in`)
    var continuar = "sim"

    while (continuar == "sim") {

        println("Digite o primeiro número:")
        val num1 = scanner.nextDouble()

        println("Digite o segundo número:")
        val num2 = scanner.nextDouble()

        println("Escolha a operação: soma, subtracao, multiplicacao, divisao")

        val opcao = scanner.next()

        if (opcao == "soma") {
            imprimirResultado(somar(num1, num2))
        } else if (opcao == "subtracao") {
            imprimirResultado(subtrair(num1, num2))
        } else if (opcao == "multiplicacao") {
            imprimirResultado(multiplicar(num1, num2))
        } else if (opcao == "divisao") {
            imprimirResultado(dividir(num1, num2))
        } else {
            println("Opção inválida!")
        }

        println("Deseja fazer uma nova operação? (sim/nao)")
        continuar = scanner.next()
    }

}