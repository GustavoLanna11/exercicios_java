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
        
        int num, quadrado;
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o número que deseja elevar ao quadrado: ");
        num = leia.nextInt();
        
        quadrado = num * num;
        
        System.out.println("O quadrado do número selecionado é: "+quadrado);
        
        
    }
    
}
