/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_4;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double perimetro, area;
        int ladoA, ladoB;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o lado A em cm: ");
        ladoA = leia.nextInt();
        
        System.out.println("Digite o lado B em cm: ");
        ladoB = leia.nextInt();
        
        area =  ladoA * ladoB;
        perimetro = 2*ladoA + 2*ladoB;
        
        System.out.println("A área é: "+area);
        System.out.println("O perímetro é: "+perimetro);
        
    }
    
}
