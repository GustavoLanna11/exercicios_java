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
        
        /*CRIE UM ALGORITMO QUE LEIA O VALOR DO
        SALÁRIO MÍNIMO E COLOQUE UM VALOR DO SALÁRIO
        DE UM FUNCIONÁRIO=(DIGITE SALARIO), CALCULE A
        QUANTIDADE DE SALÁRIOS MÍNIMOS ESSE FUNCIONÁRIO
        GANHA.*/
        
        Scanner leia = new Scanner(System.in);
        
        double sal_minimo, sal_func, qtd_sal;
        System.out.println("Digite o salário mínimo: ");
        sal_minimo = leia.nextDouble();
        
        System.out.println("Digite o salário do funcionário: ");
        sal_func = leia.nextDouble();
        
        qtd_sal = sal_func / sal_minimo;
        
        System.out.println("O funcionário em questão ganha " + qtd_sal);
        
    }
    
}
