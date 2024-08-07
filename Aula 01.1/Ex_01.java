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
        
        int num1, num2, soma, sub;
        double div, mult;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();
        
        soma = num1 + num2;
        System.out.println("O resultado da soma é: " + soma);
        
        sub = num1 - num2;
        System.out.println("O resultado da subtração é: " + sub);
        
        mult = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + mult);
        
        div = num1 / num2;
        System.out.println("O resultado da divisão é: " + div);
        
        
        
        
    }
    
}
