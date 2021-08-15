/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.primeiro.exercicio.nivelamento;

import java.util.Scanner;

/**
 *
 * @author rosec
 */
public class ChicoSalario {
    public static void chicoSalario(){
        Double salarioBruto;
        Integer INSS = 10;
        Integer IR = 20;
        Double gastoIda; // *2 *22
        Double gastoTotal;
        Double salarioLiquido;
        Double descontos = 0.0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Salário bruto: ");
        salarioBruto = leitor.nextDouble();
        salarioLiquido = salarioBruto;
        
        System.out.println("Condição diária só de ida: ");
        gastoIda = leitor.nextDouble();
        gastoTotal = gastoIda * 2 * 22;
        
        descontos += calcularPorcentagem(salarioBruto, INSS) +
                gastoTotal + calcularPorcentagem(salarioBruto, IR);
        salarioLiquido = salarioBruto - descontos;
        
        System.out.println(String.format("Seu salário bruto é de R$%.2f, tem um total de "
                + "R$%.2f em descontos e recebéra um líquido de  R$%.2f", salarioBruto, descontos,
                salarioLiquido));
    }
    
    public static Double calcularPorcentagem (Double valorTotal, Integer porcentagem){
        Double retorno;
        retorno = (porcentagem/100) * valorTotal;
        
        return retorno;
    }
}
