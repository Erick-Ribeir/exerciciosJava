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
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dias, pessoas;
        double valorPacote=0, total=0;
        
        System.out.println(" ----- PACOTE TÚRISTICO -----\n");
        System.out.println("Digite a quantidade de pessoas: ");
        pessoas = entrada.nextInt();
        System.out.println("Digite a quantidade de dias: ");
        dias = entrada.nextInt();
        
        if (dias > 0 && dias <= 4 ){
            valorPacote = (dias * 160)/pessoas;
            total = valorPacote * pessoas;
            System.out.println("O valor total do pacote é R$"+ total);
        }
        else if(dias > 4 && dias < 9){
            valorPacote = (dias * 120)/pessoas;
             total = valorPacote * pessoas;
            System.out.println("O valor total do pacote é R$"+ total);
        }
        else if(dias > 8){
            valorPacote = (dias * 80)/pessoas;
             total = valorPacote * pessoas;
            System.out.println("O valor total do pacote é R$"+ total);
        }                  
    }
}
