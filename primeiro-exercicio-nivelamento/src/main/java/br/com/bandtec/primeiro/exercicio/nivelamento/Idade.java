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
public class Idade {
    public static void idade(){
        String nome;
        Integer anoNascimento;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        nome = leitor.next();
        
        System.out.println("Olá, " + nome + "! Qual o ano do seu nascimento?");
        anoNascimento = leitor.nextInt();
        
        System.out.println("Em 2030 você terá " + (2030 - anoNascimento) + " anos.");
    }
    
}
