fun main() {
  print("Hello worldDigite a altura: ")
  val altura: Float = readLine()!!.toFloat()

  var pesoIdealH: Double = (72.7 * altura) - 58
  var pesoIdealM: Double = (62.1 * altura) - 44.7

  println("Para homens: ${"%.2f".format(pesoIdealH)}")
  print("Para mulheres: ${"%.2f".format(pesoIdealM)}")
}