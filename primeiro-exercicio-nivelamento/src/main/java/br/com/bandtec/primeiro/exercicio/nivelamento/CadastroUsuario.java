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
public class CadastroUsuario {
    public static void cadastroUsuario(){
     String login;
        String senha;
        Integer chances;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira seu login: ");
        login = leitor.next();
        System.out.println("Insira a sua senha: ");
        senha = leitor.next();
        System.out.println("Quantidade de tentativas até bloquear: ");
        chances = leitor.nextInt();
        System.out.println("Seu login é " + login + " e a sua senha é " + senha + "."
                + " Você tem " + chances + " tentativas até ser bloqueado.");}
}
