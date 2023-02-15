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
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double rendaMensal, rendAnual, irpf=0;
        
        System.out.print("------ CALCULADORA DE IRPF SIMPLES -----\n");
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite o valor de sua renda mensal (R$):");
        rendaMensal = entrada.nextDouble();
        rendAnual = rendaMensal * 12;
        System.out.println("Sua renda anual é R$"+ rendAnual);
       
        if (rendAnual ==  10800.00){
            System.out.println("Isento de IRPF Simples !!");
        
        }else if (rendAnual >10800.00 && rendAnual <= 21600.00 ){
            irpf = ((rendAnual * 0.15) - 1620);           
            System.out.println("O valor do IRPF é R$"+ irpf);
            
        }else if (rendAnual > 21600.01){
            irpf= ((rendAnual * 0.275)- 4320.00);
            System.out.println("O valor do IRPF é R$"+ irpf);
        }      
            
            
                
                
        
        
    }
}
