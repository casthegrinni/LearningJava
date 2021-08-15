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
public class CalculadoraSalario {
    public static void calculadoraSalario(){
        Double salario;
        Double porcentagem;
        Double salarioLiquido;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o seu salário?");
        salario = leitor.nextDouble();
        
        System.out.println("Qual a porcentagem de imposto sobre o salário que irá pagar?");
        porcentagem = leitor.nextDouble();
        
        salarioLiquido = (salario - (porcentagem/100) * salario);
        
        System.out.println(String.format("O salário líquido de R$%.2f com imposto de "
                + "%.0f porcento será de R$%.2f", salario, porcentagem, salarioLiquido));
    }
    
}
