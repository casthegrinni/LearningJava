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
public class CalculadoraTroco {
    public static void calculadoraTroco(){
        Double valorUnidade;
        Integer qtdVendida;
        Double valorPago;
        Double troco;
        String repetirProduto;
        
        Scanner leitor = new Scanner(System.in);
        Scanner repetir = new Scanner(System.in);
        
        System.out.println("Valor do produto: ");
        valorUnidade = leitor.nextDouble();
        
        System.out.println("Quantidade vendida: ");
        qtdVendida = leitor.nextInt();
        
        System.out.println("Valor pago pelo cliente: ");
        valorPago = leitor.nextDouble();
        
        troco = valorPago - valorUnidade * qtdVendida;
        
        if (troco > 0) {
            System.out.println(String.format("Seu troco será de R%.2f", troco));
        } else if (troco == 0) {
            System.out.println("Não há troco a devolver.");
            
        } else {
            System.out.println(String.format("O cliente deve R$%.2f", troco * -1));
        }
        
        System.out.println("Deseja verificar outro produto? \\(S/N)");
        repetirProduto = repetir.next();
        
        
        if(repetirProduto.equals("S")){
            calculadoraTroco();
        } else {
            System.out.println("Compra finalizada.");
            
        }
    }
    
}
