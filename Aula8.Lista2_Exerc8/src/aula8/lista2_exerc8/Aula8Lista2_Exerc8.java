
package aula8.lista2_exerc8;

import java.util.Scanner;

public class Aula8Lista2_Exerc8 {

    public static void main(String[] args) {
        //Calcular a média de idade de 10 alunos de uma turma qualquer.
        
        Scanner grava = new Scanner(System.in);
        double media = 0.0;
        int ida, quant=0;
        int num = 10;
        quant = num;

        do{
            System.out.println("Digite a idade dos alunos");
            ida = grava.nextInt();
            media = media + ida;
            quant = quant - 1;


        }while(quant > 0);
        
        media = media/num;
        System.out.println("A média de idade dos alunos é de: " + media);
    }
}
