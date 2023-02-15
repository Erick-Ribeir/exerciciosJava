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
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media=0;
        String nome;
        
        System.out.println("Nome do aluno: ");
        nome =  entrada.nextLine();
        System.out.print("Digite o valor da nota entre 0 e 10\n");
        System.out.println("Digite a nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a nota 3: ");
        nota3 = entrada.nextDouble();
        System.out.println("Digite a nota 4: ");
        nota4 = entrada.nextDouble();           
        media = (nota1 + nota2 + nota3 + nota4)/4; 
        System.out.println("A média desse aluno é: "+media);
        if(media <= 3.49){
            System.out.println("Reprovado!!!");
        }
        else if (media >= 3.50 && media <= 6.49 ) {
            System.out.println("Recuperação!!!");
        }  
        else if (media> 6.49){
            System.out.println("Aprovado!!!");
        }
    
    }
}
