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
        
        double area, raio;
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o raio da circunferência: ");
        raio = leia.nextDouble();
        
        area = (3.14 * (raio*raio));
        
        System.out.println("A área da circunferência é: " + area);
        
         
    }
    
}
