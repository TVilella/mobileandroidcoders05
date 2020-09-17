class ContaCorrente(numeroCC: Int):ContaBancaria(numeroDeConta = numeroCC ) {
    var taxaDeOperacao: Double = 1.30

    override fun sacar(valorSaque: Double) {
        if(valorSaque <= (saldo + taxaDeOperacao) ) {
            saldo -= (valorSaque + taxaDeOperacao)
            return println("Saque de ${"%.2f".format(valorSaque)} realizado, novo saldo: ${"%.2f".format(saldo)}")
        }else println("Saldo insuficiente.")
    }

    override fun depositar(valorDeposito: Double) {
        saldo += (valorDeposito - taxaDeOperacao)
        return println("Deposito de ${"%.2f".format(valorDeposito)} realizado, novo saldo: ${"%.2f".format(saldo)}")
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa de operação: ${"%.2f".format(taxaDeOperacao)}")
        println("--------------------------------------")
    }

}