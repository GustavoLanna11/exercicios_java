/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_3;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leia = new Scanner(System.in);
    
    String nome;
    int qtd;
    double preco, total;
    
    System.out.println("Digite o nome do produto: ");
    nome = leia.next();
    
    System.out.println("Digite a quantidade do produto: ");
    qtd = leia.nextInt();
    
    System.out.println("Digite o preço do produto: ");
    preco = leia.nextDouble();
    
    total = qtd * preco;
    System.out.println("Produto comprado: "+nome);
    System.out.println("Quantidade comprada: "+qtd);
    System.out.println("Total a pagar: " +total);
    
        
        
    }
    
}
