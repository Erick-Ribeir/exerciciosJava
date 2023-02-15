
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package erickribeirlpsi.Exercicios;

/**
 *
 * @author Ras-E
 */
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double valorDolar, valorReal;
        System.out.print("Digite o valor em U$$: ");
        valorDolar = scanner.nextDouble();
        valorReal = valorDolar * 5.10;
        System.out.print("Valor final em R$: "+valorReal);
        
    }
}
