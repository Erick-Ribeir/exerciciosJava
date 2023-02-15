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
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, i;
        String letra;
        
        System.out.println("Digite uma letra: ");
        letra  = entrada.nextLine();   
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        
        for ( i = 0; i < numero; i++) {
            System.out.print(letra);
        }
    }
}
