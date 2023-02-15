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
public class Exercicio5 {
     public static void main(String[]args){
         Scanner scanner = new Scanner(System.in);
         double peso,altura,imc;
         String genero;
         
         System.out.println("Digite M para Masculino e F para Feminino");       
         genero = scanner.nextLine();
         System.out.println("Digite o peso: ");
         peso = scanner.nextDouble();
         System.out.println("Digite a altura: ");
         altura = scanner.nextDouble();
         imc = peso/(altura*altura);
         System.out.println("Resultado IMC: "+imc);
         
         if(genero.equals("f") ){
             if(imc >= 19.1){
                 System.out.println("Abaixo do peso !");
             }
             else if(imc < 20.6 && imc <= 25.8){
                 System.out.println("Peso ideal !");
             }
             else if(imc > 25.8){
                 System.out.println("Acima do Peso !");
             }
             
         }//fim if genero
           if(genero.equals("m") ){
             if(imc < 20.7){
                 System.out.println("Abaixo do peso !");
             }
             else if(imc < 20.6 && imc < 26.5){
                 System.out.println("Peso ideal !");
             }
             else if(imc >=26.5){
                 System.out.println("Acima do Peso !");
             }
             
         }//fim if genero
           scanner.close();
        }//fim main   
}//fim classe
