/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_2;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int litros;
        double valor_pago;
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a quantidade e litros abastecidos: ");
        litros = leia.nextInt();
        
        valor_pago = litros * 5.89;
        
        System.out.println("O valor a ser pago pela quantidade de litros é: " + valor_pago);
        

    }
    
}
