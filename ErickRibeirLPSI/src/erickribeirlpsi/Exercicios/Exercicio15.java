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
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numero;
       
        //lendo o numero;
        System.out.println("Digite um número ");
        numero = entrada.nextLine();
        
        // Transformação do número em String para facilitar a verificação
        String numeroStr = String.valueOf(numero);
        
        //teste capicua (capicua ex:12321)
        boolean capicua = true;
        for (int i = 0; i < numeroStr.length() / 2; i++) {
            if (numeroStr.substring(i, i + 1).equals(numeroStr.substring(numeroStr.length() - i - 1, numeroStr.length() - i)) == false) {
                capicua = false;
                break;
            }
        }
        // Exibição do resultado
        if (capicua) {
            System.out.println("O número digitado é uma capicua.");
        } else {
            System.out.println("O número digitado não é uma capicua.");
        }
    }
}
