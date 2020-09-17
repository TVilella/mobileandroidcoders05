class ContaPoupanca(numeroCP: Int): ContaBancaria(numeroDeConta = numeroCP) {
    var limite:Double = 100.0

    override fun sacar(valorSaque: Double) {
        if(valorSaque <= (saldo + limite) ) {
            saldo -= valorSaque
            return println("Saque de ${"%.2f".format(valorSaque)} realizado, novo saldo: ${"%.2f".format(saldo)}")
        }else println("Saldo insuficiente.")
    }

    override fun depositar(valorDeposito: Double) {
        saldo += valorDeposito
        return println("Deposito de ${"%.2f".format(valorDeposito)} realizado, novo saldo: ${"%.2f".format(saldo)}")
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite: ${"%.2f".format(limite)}")
        println("--------------------------------------")
    }

}