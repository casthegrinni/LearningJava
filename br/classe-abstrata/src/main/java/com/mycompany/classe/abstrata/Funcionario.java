package com.mycompany.classe.abstrata;

public abstract class Funcionario {

    private String cpf;
    private String nome;

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract Double calcSalario();



    @Override
    public String toString() {
        return String.format("Funcionário {"
                + "\n   CPF: %s"
                + "\n   Nome: %s"
                + "\n   Salário: %.2f"
                + "\n}",
                cpf, nome, calcSalario());
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
        public void setNome(String nome) {
        this.nome = nome;
    }
}
