
package aula8.lista2_exerc9;

import java.util.Scanner;

public class Aula8Lista2_Exerc9 {

    public static void main(String[] args) {
        //Imprimir a tabuada solicitada pelo usuario usando o FOR
        
        Scanner grava = new Scanner(System.in);
        int num = 0;
        System.out.print("Digite a tabuada desejada: ");
        num = grava.nextInt();
        
        for (int i = 1; i <=10; i++){
                System.out.println(num*i);
            
            }
    }
}
