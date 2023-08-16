
package aula6.lista1_exerc3;

import java.util.Scanner;

public class Aula6Lista1_Exerc3 {

    public static void main(String[] args) {
        //CATEGORIAS:
        //1 ATÉ 1O ANOS- INFANTIL
        //11 ATE 13 ANOS - INFANTO-JUVENIL
        //14 ATE 17 ANOS - PRE-ADOLESCENTE
        //ACIMA DE 18 - ADULTO
        
        Scanner grava = new Scanner(System.in);
        
        int idade = 0;
        
        System.out.println("Digite sua idade:");
        idade = grava.nextInt();
        
        if (idade <= 10){
            System.out.println("Infantil");
        }
        else if (idade <= 13){
            System.out.println("Infanto-Juvenil");
        }
        else if (idade <= 17){
            System.out.println("Adolescente");
        }
        else{
            System.out.println("Adulto");
        }
    }
}
