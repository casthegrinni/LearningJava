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
public class CalculoMedia {
    public static void calculoMedia(){
        String nome;
        Double nota1;
        Double nota2;
        Double media;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?: ");
        nome = leitor.next();
        
        System.out.println("Primeira nota: ");
        nota1 = leitor.nextDouble();
        
        System.out.println("Segunda nota: ");
        nota2 = leitor.nextDouble();
        
        media = (nota1+nota2)/2;
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.2f", nome, media));
    }
    
}
