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
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int dias;
        double km, aluguel;
        
        System.out.print(" ----- LOCAÇÃO DE VEÍCULOS ------\n");
        System.out.println("Digite a quantidade de dias: ");
        dias = entrada.nextInt();
        System.out.println("Digite a quantidade total de Km percorridos: ");
        km = entrada.nextDouble();
        aluguel = (dias * 45 )+ (0.50 * (km-(60*dias) ));
        System.out.println("O total do aluguel é R$"+aluguel);
    }
}
