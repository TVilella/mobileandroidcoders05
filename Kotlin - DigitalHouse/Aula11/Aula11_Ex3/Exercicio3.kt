fun main(){
    var alunos = arrayListOf<Aluno>(
        Aluno("Lucas", 1),
        Aluno("Felipe",2),
        Aluno("Mariana",3),
        Aluno("Thiago", 4))

    var aluno4 = Aluno("Joao", 4)

    println(alunos.contains(aluno4))
}