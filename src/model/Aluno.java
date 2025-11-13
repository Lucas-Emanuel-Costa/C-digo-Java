package model;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula;
    }

    @Override
    public void quemSouEu() {
        System.out.println("model.Aluno");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Estudar");
    }
}
