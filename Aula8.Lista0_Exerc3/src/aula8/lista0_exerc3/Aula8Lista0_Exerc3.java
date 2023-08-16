
package aula8.lista0_exerc3;

import java.util.Scanner;

public class Aula8Lista0_Exerc3 {

    public static void main(String[] args) {
        //Receba a idade de N alunos e forneça a média
        
        Scanner grava = new Scanner(System.in);
        
        int idade, quant, num;
        double media = 0;
        
        System.out.println("Digite a quantidade de alunos:");
        num = grava.nextInt();
        quant = num;
        
        do{
            System.out.println("Digite a idade dos alunos:");
            idade = grava.nextInt();
            media = media + idade;
            quant = quant - 1;
            
        }while (quant > 0);
        
        media = media/num;
        System.out.println("A idade média dos alunos é de: " + media);
    }
}
