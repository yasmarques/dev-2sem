
package aula6.lista1_exerc1;

import java.util.Scanner;

public class Aula6Lista1_Exerc1 {

    public static void main(String[] args) {
        //CRIE UMA CLASSE QUE SIMULE O FUNCIONAMENTO DE UM CADASTRO DE CLIENTE:
        //MENU: 1 - inclusão. 2 - alteracao. 3 - exclusao. 4 - sair. 
        //Dados a serem cadastrados: CPF, RG, Código.
        
        Scanner grava = new Scanner(System.in);
        
        int cpf = 0, rg = 0, cod = 0, res = 0;
        
        System.out.println("MENU: \n1 - Inclusão \n2 - Alteração \n3 - Exlusão \n4 - Sair");
        res = grava.nextInt();
        
        if (res == 1){
            System.out.println("Digite seu CPF, RG e Código");
            cpf = grava.nextInt();
            rg = grava.nextInt();
            cod = grava.nextInt();
            
            System.out.println("INCLUIDO no banco de dados com SUCESSO!");
        } 
        else if (res == 2){
            System.out.println("Digite seu CPF, RG e Código");
            cpf = grava.nextInt();
            rg = grava.nextInt();
            cod = grava.nextInt();
            
            System.out.println("ALTERADO no banco de dados com SUCESSO!");
        }
        else if (res == 3){
            cpf = 0;
            rg = 0;
            cod = 0;            
            System.out.println("EXCLUIDO no banco de dados com SUCESSO!");
        }
        else if (res == 4){
            System.out.println("SAINDO do sistema");
        }
        else{
            System.out.println("Opção INVÁLIDA");
        }
    }
}
