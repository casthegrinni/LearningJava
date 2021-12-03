package com.mycompany.classe.abstrata;

public class Horista extends Funcionario {

    private Integer qtdHora;
    private Double valorHora;

    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario() {
        return qtdHora * valorHora;
    }

    @Override
    public String toString() {
        return String.format("Horista {:"
                + "\n  CPF: %s"
                + "\n   Nome: %s"
                + "\n   Quantidade de horas: %d"
                + "\n   Valor hora: %.2f"
                + "\n   Salário: %.2f"
                + "\n}",
                super.getCpf(), super.getNome(), qtdHora, valorHora, calcSalario());
    }
}
