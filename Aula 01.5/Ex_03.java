/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_03;

import java.text.DecimalFormat;
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
        double altura, raio, volume;
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite a altura: ");
        altura = leia.nextDouble();
        
        System.out.println("Digite o raio: ");
        raio = leia.nextDouble();
        
        volume = 3.14159 * raio * raio * altura;
        DecimalFormat conv = new DecimalFormat("0.00");
        System.out.println("O volume do cilindro é: "+conv.format(volume));
        
    }
    
}
