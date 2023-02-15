/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erickribeirlpsi.Exercicios;

import java.util.Scanner;

/**
 *
 * @author Ras-E
 */
public class Exercicio16 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
            String palavra;
            int i=0, cont=0;
                       
            System.out.println("Digite uma palavra: ");
            palavra = entrada.nextLine();
            
            while (i < palavra.length()){
                if (palavra.substring(i, i+1 ).equals ("a")){
                    cont++;
            }i++;
            }    
         System.out.println("A palavra " + palavra + " possui " + cont + " letras \"a\".");        
    }
   
}
