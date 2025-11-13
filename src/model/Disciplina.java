package model;

public class Disciplina {

    private String nome;
    private String cargaHoraria;
    private Professor professor;
    private Aluno aluno;

    public Disciplina(String nome, String cargaHoraria, Professor professor, Aluno aluno) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    @Override
    public String toString() {
        return "model.Disciplina: " + nome +
                "\nCarga Horária: " + cargaHoraria +
                "\nmodel.Professor: " + professor.getNome() +
                "\nmodel.Aluno: " + aluno.getNome();
    }
}
