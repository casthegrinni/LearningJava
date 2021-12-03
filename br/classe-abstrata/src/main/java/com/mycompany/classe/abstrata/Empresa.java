package com.mycompany.classe.abstrata;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFunc(Funcionario f) {
        funcionarios.add(f);
    }

    public void exibeTodos() {
        System.out.println("--------------------------TODOS FUNCIONÁRIOS----------------------------");
        System.out.println(funcionarios);
        System.out.println("------------------------------------------------------------------------");
    }

    public void exibeTotalSalario() {
        Double totalSalarios = 0.0;
        for (Funcionario f : funcionarios) {
            totalSalarios += f.calcSalario();
        }

        System.out.println(String.format("\nTOTAL DE SALÁRIO: R$%.2f\n", totalSalarios));
    }

    public Funcionario buscaNome(String n) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(n)) {
                return f;
            }
        }

        System.out.println(n + " Não foi encontrado na lista de funcionários");
        return null;
    }

    public void atualizaNome(String nomeAtual, String nomeNovo) {
        if (buscaNome(nomeAtual) != null) {
            System.out.println("Nome atualizado de " + nomeAtual + " para " + nomeNovo);
            buscaNome(nomeAtual).setNome(nomeNovo);
        }
    }
    
}
