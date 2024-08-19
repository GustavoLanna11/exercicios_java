/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_02;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome1, nome2, nome3;
        double valor1, valor2, valor3, valortotal1, valortotal2, valortotal3, valorGeral;
        int qtd1, qtd2, qtd3;
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite o nome do primeiro produto: ");
        nome1 = leia.next();
        System.out.println("Digite a quantidade do primeiro produto: ");
        qtd1 = leia.nextInt();
        System.out.println("Digite o valor do primeiro produto: ");
        valor1 =  leia.nextDouble();
        valortotal1 = qtd1 * valor1;
        System.out.println("O valor total do produto " +nome1+ " é: " +valortotal1 +" Reais \n");
        
        
        System.out.println("Digite o nome do segundo produto: ");
        nome2 = leia.next();
        System.out.println("Digite a quantidade do segundo produto: ");
        qtd2 = leia.nextInt();
        System.out.println("Digite o valor do segundo produto: ");
        valor2 =  leia.nextDouble();
        valortotal2 = qtd2 * valor2;
        System.out.println("O valor total do produto " +nome2+ " é: " +valortotal2 +" Reais \n");
        
        
        System.out.println("Digite o nome do terceiro produto: ");
        nome3 = leia.next();
        System.out.println("Digite a quantidade do terceiro produto: ");
        qtd3 = leia.nextInt();
        System.out.println("Digite o valor do terceiro produto: ");
        valor3 =  leia.nextDouble();
        valortotal3 = qtd3 * valor3;
        System.out.println("O valor total do produto " +nome3+ " é: " +valortotal3 +" Reais \n");
        
        valorGeral = valortotal1 + valortotal2 + valortotal3;
        System.out.println("O valor total da compra dos 3 produtos é: " +valorGeral+ " Reais. ");
        
        
    }
    
}
