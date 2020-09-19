class Estoque(var nome:String, var qtdAtual: Int, var qtdMinima: Int) {
    init{
        qtdAtual = Math.max(0, qtdAtual)
        qtdMinima = Math.max(0, qtdMinima)
    }

    fun mudarNome(novoNome: String){
        nome = novoNome
    }

    fun mudarQtdMinima(novaQtdMinima: Int){
        qtdMinima = novaQtdMinima
    }

    fun repor(qtdReposta: Int){
        qtdAtual += qtdReposta
    }

    fun darBaixa(qtdRetirada: Int){
        if(qtdAtual >= qtdRetirada) qtdAtual -= qtdRetirada
        else println("operação negada, quantidade insuficiente!")
    }

    fun mostra():String{
        return "Nome: $nome | Qtd Atual: $qtdAtual | Qtd Minima $qtdMinima"
    }

    fun precisaRepor(): Boolean{
        return qtdAtual < qtdMinima
    }
}