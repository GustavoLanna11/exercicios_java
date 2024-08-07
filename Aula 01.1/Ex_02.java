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
        
        
        /*Exercício 2 - Fazer um algorítmo que mostre a média aritmética das 
        notas. Leia as nota1, nota2, nota3. Calcule a média 1. Leia as nota4, 
        nota5, nota6. Calcule a média2. Depois faça a soma das duas médias.*/
        
        int nota1, nota2, nota3, nota4, nota5, nota6;
        double media1, media2, soma;
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = leia.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = leia.nextInt();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = leia.nextInt();
        
        media1 = (nota1 + nota2 + nota3)/3;
        System.out.println("A primeira média é: " + media1);
        
        System.out.println("Digite a quarta nota: ");
        nota4 = leia.nextInt();
        
        System.out.println("Digite a quinta nota: ");
        nota5 = leia.nextInt();
        
        System.out.println("Digite a sexta nota: ");
        nota6 = leia.nextInt();
        
        media2 = (nota4 + nota5 + nota6)/3;
        System.out.println("A segunda média é: " + media2);
        
        soma = media1 + media2;
        System.out.println("A soma das médias é: " + soma);
    }
    
}
