/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_04;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double valorPrestacao, taxa, valorAtraso;
        int meses;
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o valor da prestação: ");
        valorPrestacao = leia.nextDouble();
        
        System.out.println("Digite a taxa de juros da prestação: ");
        taxa = leia.nextDouble();
        
        System.out.println("Digite quantos meses você atrasou: ");
        meses = leia.nextInt();
        
        valorAtraso = valorPrestacao + (valorPrestacao*(taxa/100)*meses);
        System.out.println("O valor final da parcela em atraso é  de: " +valorAtraso+ "reais.");
       
        
    }
    
}
