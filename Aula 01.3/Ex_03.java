/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_03;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double salario = 1000, salarioFinal;
        int qtdMoveis, bonusMovel = 50, totalBonus;
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a quantidade de móveis vendidos: ");
        qtdMoveis = leia.nextInt();
        
        totalBonus = qtdMoveis * bonusMovel;
        System.out.println("Você receberá "+totalBonus+ " reais pelos móveis vendidos.");
        
        salarioFinal = salario + totalBonus;
        System.out.println("Seu salário + bonus é de: "+salarioFinal+ " reais.");
        
        
    }
    
}
