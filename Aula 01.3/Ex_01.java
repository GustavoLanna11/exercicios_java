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
        
        int num1, num2, dobro, triplo;
        Scanner leia =  new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();
        
        dobro = num1 * 2;
        triplo = num2 * 3;
        
        System.out.println("O dobro do primeiro número é: " +dobro);
        System.out.println("O triplo do segundo número é: "+triplo);
        
        
        
    }
    
}
