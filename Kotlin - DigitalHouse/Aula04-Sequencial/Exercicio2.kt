fun main() {
    print("Quanto vale sua hora? ")
    var valorHora: Double = readLine()!!.toDouble()
    print("Quantas horas você trabalhou? ")
    var horasTrabalhadas: Double = readLine()!!.toDouble()

    var salarioBruto: Double = valorHora * horasTrabalhadas

    println("Você receberá R$$salarioBruto")
}