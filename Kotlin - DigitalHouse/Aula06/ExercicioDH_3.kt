fun main() {

    print("Digite um numero inteiro: ")
    var numero = readLine()!!.toIntOrNull()

    if(numero == null) return print("Numero Inválido")

    return print((numero % 2) == 0)
}