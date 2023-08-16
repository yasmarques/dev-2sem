
package aula8.lista0_exerc4;

import java.util.Scanner;

public class Aula8Lista0_Exerc4 {

    public static void main(String[] args) {
        //Receba via teclado quantas vezes a mensagem "Isso é um teste deve aparecer na tela "
        
        Scanner grava = new Scanner(System.in);
        
        String mensagem = "Está é a mensagem para você";
        int msg = 0;
        
        System.out.println("Quantas vezes você quer ler a mensagem?");
        msg = grava.nextInt();
        
        do{
            msg--;
            System.out.println(mensagem);
            
        }while (msg > 0);
    }
}
