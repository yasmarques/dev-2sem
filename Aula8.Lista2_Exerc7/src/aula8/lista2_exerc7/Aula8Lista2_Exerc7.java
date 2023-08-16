
package aula8.lista2_exerc7;

import java.util.Scanner;

public class Aula8Lista2_Exerc7 {

    public static void main(String[] args) {
        //Calcular os divisores de um nº qualquer. 
        
        Scanner grava = new Scanner(System.in);
        
        int num = 0;
        System.out.println("Digite um número menor que 100:");
        num = grava.nextInt();
        
        do{
            num++;
            if (num % 4 == 0){
             System.out.println(num);   
            }
            
        }while (num <100);
    }
}
