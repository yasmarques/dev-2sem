
package aula6.lista1_exerc2;

import java.util.Scanner;

public class Aula6Lista1_Exerc2 {

    public static void main(String[] args) {
        //CRIE UMA CLASSE QUE TENHA 4 OPÇÕES DE MENU:
        //1 - VEJA A MENSAGEM. 2 - TIRE 10% DO VALOR DESEJADO. 3 - SELECIONE A CATEGORIA. 4 - SAIR
        
        Scanner grava = new Scanner(System.in);
        
        int res = 0, valor1 = 0;
        double valor2 = 0;
        
        System.out.println("MENU: \n1 - Veja a mensagem. \n2 - Tire 10% do valor \n3 - Selecione a categoria \n4 - Sair");
        res = grava.nextInt();
        
        if(res == 1){
            System.out.println("Olá! Esta é a mensagem para você =) ");
        }
        else if(res == 2){
            System.out.println("Digite o valor desejado");
            
            valor1 = grava.nextInt();
            valor2 = valor1 * 0.10;
            
            System.out.println("10% de " + valor1 + " é: " + valor2);
        }
        else if (res == 3){
            System.out.println("Você selecionou a opção 3");
        }
        else if (res == 4){
            System.out.println("SAINDO do sistema");
        }
        else {
            System.out.println("Opção inválida");
        }
    }
}
