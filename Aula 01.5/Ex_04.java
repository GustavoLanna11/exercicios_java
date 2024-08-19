/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_04;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nomeProd;
        int qtdMaxima, qtdEstoque, qtdComprar;
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite o nome do produto: ");
        nomeProd = leia.next();
        System.out.println("Digite a quantidade máxima para este produto: ");
        qtdMaxima = leia.nextInt();
        System.out.println("Digite a quantidade em estoque do produto: ");
        qtdEstoque = leia.nextInt();
        
        qtdComprar = qtdMaxima - qtdEstoque;
        System.out.println("A quantidade a ser comprada do produto "+nomeProd+" é de "+qtdComprar+ " produtos.");
        
        
    }
    
}
