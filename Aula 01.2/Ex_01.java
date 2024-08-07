/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_01;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double salario, novo_salario, percentual;
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        salario = leia.nextDouble();
        
        System.out.println("Digite o percentual de reajuste: ");
        percentual = leia.nextDouble();
        
        novo_salario = salario+(salario*percentual)/100;
        System.out.println("O novo salário pós reajuste é: " + novo_salario);
        
    }
    
}
