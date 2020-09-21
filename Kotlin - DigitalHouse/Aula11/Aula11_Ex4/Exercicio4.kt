fun main(){
    var funcionarios = arrayListOf<Funcionario>(
        Funcionario("Lucas", 1),
        Funcionario("Felipe",2),
        Funcionario("Mariana",3),
        Funcionario("Thiago", 4))

    var funcionario4 = Funcionario("Joao", 4)

    print(funcionarios.contains(funcionario4))

}