/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.primeiro.programa.java;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) {
       String sNum1 = "10";
       Integer num1 = Integer.valueOf(sNum1);
       Integer num2 = 20;
 
       System.out.println("String: " + sNum1+"\nNumber: " + num1);
       
       String firstString = "Caio";
       String secondString = "Denis";
       
        if (firstString.equals(secondString)) {
            System.out.println("é o Caio............");
        }
        
        if (!num1.equals(num2)){
            System.out.println("Checkpoint");
        }
    }
    
    public static void PrimeiraParte (){
        System.out.println("Boa \tNoite");
        System.out.print("Tudo bem?");
        //System.out.println("Tudo bem, " + args[0] +"?");
        
        String nome;
        Integer num1;
        Integer num2;
        num1 = 9;
        num2 = 2;
        Integer resultado;
        Double resultado2;
        
        //Fazendo a conversão para double, possibilitando a divisão
        resultado2 = Double.valueOf(num1)/num2;
        
        System.out.println("Resultado: " + resultado2);
        
        Scanner reader = new Scanner(System.in);
       /* System.out.println("Digite o seu nome: ");
        nome = reader.nextLine();
        System.out.println("Olá, " + nome + " Hideki!"); */
       
       /*  Integer idade;
        System.out.println("Digite a sua idade: ");
        idade = reader.nextInt();
        Integer anoNascimento = 2021 - idade;
        System.out.println("Você nasceu em: " + anoNascimento + "."); */
       
       Double nota1;
       Double nota2;
       Double media;
       
       System.out.println("Digite a nota 1: ");
       nota1 = reader.nextDouble();
       System.out.println("Diite a nota2: ");
       nota2 = reader.nextDouble();
       media = (nota1 + nota2)/2;
       //System.out.println("Nota1: " + nota1 + "\nNota2: " + nota2);
       //System.out.println("Sua média: " + String.format("%.2f", media));
     
       System.out.println(String.format("A nota1 é %.2f, a nota 2 é %.2f e a média é %.2f", nota1, nota2, media));
       System.out.println("\\n");
    }
}
