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
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double areaTotal, areaConstruida;
        double imposto;
        
        System.out.println("Digite a área total do terreno (m²): ");
        areaTotal = entrada.nextDouble();
        System.out.println("Digite a área Contruída do terreno (m²): ");
        areaConstruida = entrada.nextDouble();
        
        imposto = ((areaTotal - areaConstruida) * 3.80) + (areaConstruida * 5.00);
        System.out.println("O valor total do imposto a ser pago é: R$"+imposto);
        
    }
}
