/* LUIZ FABIANO PEREIRA SANTANA!!! 👨🏽‍💻🦍 */

fun main() {
    print("Informe o seu nome: ")
    val nome = readLine()!!

    println("Bem-vindo à cafeteira do Seu Nilton, $nome!")

    // Seleção do tamanho
    var tamanho: String
    while (true) {
        println("\nQual café gostaria de pedir hoje? DIGITE A INICIAL DO TAMANHO DESEJADO")
        println("P - PEQUENO (R$ 5,50) | M - MÉDIO (R$ 8,00) | G - GRANDE (R$ 10,50)")
        tamanho = readLine()!!.uppercase()

        if (tamanho == "P" || tamanho == "M" || tamanho == "G") {
            break
        } else {
            println("Opção inválida. Digite P, M ou G.")
        }
    }

    // Seleção do sabor
    var sabor: String
    while (true) {
        println("\nAgora escolha o tipo do café! DIGITE A INICIAL DO SABOR DESEJADO")
        println("E - EXPRESSO (R$ 3,50) | C - CAPPUCCINO (R$ 4,50) | L - LATTE (R$ 5,00)")
        sabor = readLine()!!.uppercase()

        if (sabor == "E" || sabor == "C" || sabor == "L") {
            break
        } else {
            println("Opção inválida. Digite E, C ou L.")
        }
    }

    var valor = 0.0

    when (tamanho) {
        "P" -> {
            valor += 5.50
            println("Café Tamanho Pequeno Selecionado")
        }
        "M" -> {
            valor += 8.00
            println("Café Tamanho Médio Selecionado")
        }
        "G" -> {
            valor += 10.50
            println("Café Tamanho Grande Selecionado")
        }
    }

    when (sabor) {
        "E" -> {
            valor += 3.50
            println("Sabor Expresso Selecionado")
        }
        "C" -> {
            valor += 4.50
            println("Sabor Cappuccino Selecionado")
        }
        "L" -> {
            valor += 5.00
            println("Sabor Latte Selecionado")
        }
    }

    println("\nSeu pedido foi confirmado!")
    println("Total: R$ $valor")

    println("\nQual será a forma de pagamento?")
    println("PIX, CREDITO ou DEBITO?")
    val pagamento = readLine()!!.uppercase()

    when (pagamento) {
        "PIX" -> {
            println("Gerando QR CODE...")
        }
        "CREDITO" -> {
            println("OK, perfeito! Aproximação ou Inserir?")
            val formaCredito = readLine()!!.uppercase()
            if (formaCredito == "APROXIMACAO" || formaCredito == "INSERIR") {
                println("OK! Pagamento aprovado!")
            } else {
                println("Erro no pagamento, tente novamente!")
                return
            }
        }
        "DEBITO" -> {
            println("Pagamento aprovado!")
        }
        else -> {
            println("Essa forma de pagamento não existe.")
            return
        }
    }

    println("\nTudo certo! Tenha um ótimo dia, $nome!")
}
/* LUIZ FABIANO PEREIRA SANTANA!!! 👨🏽‍💻🦍 */