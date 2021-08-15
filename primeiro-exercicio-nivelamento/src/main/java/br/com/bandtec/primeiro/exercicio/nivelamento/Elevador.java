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
public class Elevador {
    public static void elevador(){
        Integer limitePeso;
        Integer limitePessoas;
        Integer peso1;
        Integer peso2;
        Integer peso3;
        Integer pesoTotal;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Limite de peso do elevador: ");
        limitePeso = leitor.nextInt();
        
        System.out.println("Limite de pessoas: ");
        limitePessoas = leitor.nextInt();
        
        System.out.println("Peso da primeira pessoa: ");
        peso1 = leitor.nextInt();
        
        System.out.println("Peso da segunda pessoa: ");
        peso2 = leitor.nextInt();
        
        System.out.println("Peso da terceira pessoa: ");
        peso3 = leitor.nextInt();
        
        pesoTotal = peso1 + peso2+ peso3;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual "
                + "cabem " + limitePessoas + " pessoas.");
        
        System.out.println("O peso total no elevador é de " + pesoTotal + "kg, sendo que "
                + "ele suporta " + limitePeso + "kg.");
    }
    
}
