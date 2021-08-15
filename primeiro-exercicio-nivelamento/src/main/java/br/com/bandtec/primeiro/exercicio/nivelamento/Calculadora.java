/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.primeiro.exercicio.nivelamento;

import java.util.Scanner;

/**
 *
 * @author Brunno
 */
public class Calculadora {
    public static void calculadora() {
        Scanner leitor = new Scanner(System.in);
        Double primeiroNumero;
        Double segundoNumero;
        
        System.out.println("Calculadora \nDigite um número real:" );
        primeiroNumero = leitor.nextDouble();
        
        System.out.println("Digite um segundo número");
        segundoNumero = leitor.nextDouble();
        System.out.println("Primeiro número: " + primeiroNumero + ", Segundo número: " + segundoNumero);
        System.out.println("Soma: " + (primeiroNumero + segundoNumero));
        System.out.println("Subtração: " + (primeiroNumero - segundoNumero));
        System.out.println("Multiplicação: " + (primeiroNumero * segundoNumero));
        System.out.println("Divisão: " + (primeiroNumero / segundoNumero));
    }
}
