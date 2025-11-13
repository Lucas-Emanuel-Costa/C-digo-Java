package model;

import enuns.CARGO;
import model.interfaces.Remuneravel;

public class Professor extends Pessoa implements Remuneravel {

    private String especialidade;
    private CARGO cargo;
    private int idade;

    public Professor(String nome, String especialidade, CARGO cargo) {
        super(nome);
        this.especialidade = especialidade;
        this.cargo = cargo;
    }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public CARGO getCargo() { return cargo; }
    public void setCargo(CARGO cargo) { this.cargo = cargo; }

    @Override
    public String toString() {
        return super.toString()
                + ", Idade: " + idade
                + ", Especialidade: " + especialidade
                + ", Cargo: " + cargo;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou um professor chamado " + getNome());
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Minha atividade é ensinar " + especialidade + ".");
    }

    @Override
    public void calcularSalario() {
        System.out.println("Calculando salário...");
    }

    @Override
    public void aplicarBonus() {
        System.out.println("Aplicando bônus...");
    }
}