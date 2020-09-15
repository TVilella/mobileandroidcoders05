fun main(){
    val cliente1 = Cliente("Lucas", "Gabriel")
    val cliente2 = Cliente("Felipe", "Medeiros")

    var conta1 = Conta(1, cliente1)
    var conta2 = Conta(2, cliente2)

    conta1.deposito(1000.0)
    conta2.deposito(2500.0)

    conta1.saque(500.0)
    conta2.saque(100.0)
}