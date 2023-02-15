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
public class Exercicio6 {

    public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);
        double comprimento, largura, perimetro;
        double areaRet;
        System.out.println("Digite o comprimento: ");
        comprimento = entrada.nextDouble();
        System.out.println("Digite a largura: ");
        largura = entrada.nextDouble();
        
        areaRet= comprimento * largura;
        perimetro= (2*comprimento)+(2*largura);
        System.out.println("Área do Retângulo: "+areaRet);
        System.out.println("Perímetro: "+ perimetro);
    }
}
