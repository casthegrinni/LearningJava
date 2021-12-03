package com.mycompany.classe.abstrata;

public class Vendedor extends Funcionario {

    private Double vendas;
    private Double taxa;

    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcSalario() {
        return vendas * taxa;
    }

    @Override
    public String toString() {
        return String.format("Vendedor: {"
                + "\n  CPF: %s"
                + "\n   Nome: %s"
                + "\n   Vendas: %.2f"
                + "\n   Taxas: %.2f"
                + "\n   Salário: %.2f"
                + "\n}",
                super.getCpf(), super.getNome(), vendas, taxa, calcSalario());
    }

}
