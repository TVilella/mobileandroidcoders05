class Conta (val numeroConta: Int, val titular: Cliente){
    var saldo: Double = 0.0

    fun deposito(valDeposito: Double) {
        saldo += valDeposito
        return println("Depositado: $valDeposito | Novo saldo: $saldo ")
    }

    fun saque(valSaque: Double) {
        saldo += valSaque
        if(valSaque > saldo) return print("Saldo insuficiente")
        return println("Sacado: $valSaque | Novo saldo: $saldo ")
    }
}