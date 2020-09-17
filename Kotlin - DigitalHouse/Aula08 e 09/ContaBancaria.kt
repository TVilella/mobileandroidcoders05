abstract class ContaBancaria(val numeroDeConta:Int):Imprimivel{
    var saldo: Double = 0.0

    protected fun transferir(valorTransferencia:Double, contaDestino: ContaBancaria){
        if(valorTransferencia < saldo ){
            sacar(valorTransferencia)
            contaDestino.depositar(valorTransferencia)
        }
    }

    abstract fun sacar(valorSaque: Double)
    abstract fun depositar(valorDeposito: Double)

    override fun mostrarDados() {
        println("--------------------------------------")
        println("Numero da Conta: $numeroDeConta")
        println("Saldo: ${"%.2f".format(saldo)}")
    }
}