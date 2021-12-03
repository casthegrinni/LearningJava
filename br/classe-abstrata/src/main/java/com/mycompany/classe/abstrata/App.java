package com.mycompany.classe.abstrata;

public class App {

    public static void main(String[] args) {
        Vendedor claudio = new Vendedor("468.834.939-20", "Cláudio", 20.00, 15.00);
        Horista jose = new Horista("897.798.878-78", "José", 80, 20.00);

        Empresa empresa = new Empresa();
        empresa.adicionarFunc(jose);

        empresa.exibeTodos();
        empresa.exibeTotalSalario();

        empresa.adicionarFunc(claudio);

        empresa.exibeTodos();
        empresa.exibeTotalSalario();

        System.out.println(empresa.buscaNome("Pateta"));
        System.out.println(empresa.buscaNome("José").calcSalario());

        empresa.atualizaNome("José", "Pateta");
    }
    
}
