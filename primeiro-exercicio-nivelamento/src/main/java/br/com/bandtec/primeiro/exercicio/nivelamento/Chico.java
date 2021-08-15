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
public class Chico {
    public static void chico(){
        Integer minutosAquecendo;
        Integer minutosAerobico;
        Integer minutosMusculacao;
        
        Integer caloriasAquecendo;
        Integer caloriasAerobico;
        Integer caloriasMusculacao;
        
        Integer totalMinutos;
        Integer totalCalorias;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos minutos você passou se aquecendo?");
        minutosAquecendo = leitor.nextInt();
        caloriasAquecendo = minutosAquecendo * 12;
        
        System.out.println("Quantos minutos você passou fazendo exercícios aeróbicos?");
        minutosAerobico = leitor.nextInt();
        caloriasAerobico = minutosAerobico * 20;
        
        System.out.println("Quantos minutos você fazendo musculação?");
        minutosMusculacao = leitor.nextInt();
        caloriasMusculacao = minutosMusculacao * 25;
        
        totalMinutos = minutosAerobico + minutosMusculacao + minutosAquecendo;
        totalCalorias = caloriasMusculacao + caloriasAerobico + caloriasAquecendo;
        
        System.out.println("Olá. Você fez um total de " + totalMinutos + " minutos de exercício"
        + " e perdeu cerca de " + totalCalorias + " calorias.");
    }
    
}
