import enuns.CARGO;
import model.Aluno;
import model.Disciplina;
import model.Pessoa;
import model.Professor;

public class Main {
    public static void main(String[] args) {

        Pessoa a = new Aluno("João da Silva", "20251001");
        Pessoa p = new Professor("Maria Oliveira", "Matemática", CARGO.Professor);

        Disciplina disciplina = new Disciplina("Cálculo I", "60h", (Professor) p, (Aluno) a);

        System.out.println(disciplina);

        System.out.println("\nAtividades:");
        a.quemSouEu();
        a.minhaAtividade();

        p.quemSouEu();
        p.minhaAtividade();
    }
}