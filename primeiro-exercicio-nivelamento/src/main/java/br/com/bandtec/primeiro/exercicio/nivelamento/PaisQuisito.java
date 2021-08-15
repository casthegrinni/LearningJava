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
public class PaisQuisito {
    
    public static void paisQuisito(){
        Integer qtdFilhos0a3;
        Integer qtdFilhos4a16;
        Integer qtdFilhos17e18;
        Integer qtdFilhos;
        
        Double zeroA3;
        Double quatroA16;
        Double dezesseteE18;
        Double bolsa;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos filhos entre 0 e 3 anos você tem?");
        qtdFilhos0a3 = leitor.nextInt();
        zeroA3 = 25.12 * qtdFilhos0a3;
        
        System.out.println("Quantos filhos entre 4 e 16 anos você tem?");
        qtdFilhos4a16 = leitor.nextInt();
        quatroA16 = 15.88 * qtdFilhos4a16;
        
        System.out.println("E quantos filhos de 17 ou 18 anos você tem?");
        qtdFilhos17e18 = leitor.nextInt();
        dezesseteE18 = 12.44 * qtdFilhos17e18;
        
        
        qtdFilhos = qtdFilhos0a3 + qtdFilhos17e18 + qtdFilhos4a16;
        bolsa = zeroA3 + quatroA16 + dezesseteE18;
        
        System.out.println(String.format("Você tem uma quantidade de %s filhos, "
                + "e vai receber R$%.2f de bolsa.", qtdFilhos, bolsa));
    }
}
