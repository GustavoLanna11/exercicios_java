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
        
        int idade, dias;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();
        
        dias = idade * 365;
        
        System.out.println("Sua idade em dias é: " + dias);
    }
}
