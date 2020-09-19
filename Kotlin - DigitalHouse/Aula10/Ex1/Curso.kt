class Curso(val nome: String) {
    var listaAulas = ArrayList<Aula>()
    var listaAlunos = ArrayList<Aluno>()
    var professorResponsavel: Professor? = null
}