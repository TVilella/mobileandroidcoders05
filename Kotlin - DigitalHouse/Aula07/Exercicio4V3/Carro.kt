class Carro(var consumo: Double) {
    var quantidadeCombustivel: Double = 0.0

    fun andar(distancia: Int){
        quantidadeCombustivel -= (distancia/consumo)
    }

    fun obterGasolina(){
        return print("%.2f".format(quantidadeCombustivel))
    }

    fun adicionarGasolina(quantidadeAbastecida: Double){
        quantidadeCombustivel += quantidadeAbastecida
    }
}