fun main() {
  print("Digite o peso dos peixes: ")
  var pesoPeixes: Float = readLine()!!.toFloat()

  var pesoExcedido: Float = pesoPeixes - 50
  println("Excedeu $pesoExcedido")
  var valorMulta: Double = 4.0 * pesoExcedido
  print("O valor a ser pago é de R$ ${"%.2f".format(valorMulta)}")
}