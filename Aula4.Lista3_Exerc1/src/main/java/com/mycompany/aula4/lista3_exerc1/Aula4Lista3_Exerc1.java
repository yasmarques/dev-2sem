
package com.mycompany.aula4.lista3_exerc1;

import java.util.Scanner;

public class Aula4Lista3_Exerc1 {

    public static void main(String[] args) {
        //Crie uma classe com o nome Calc1 e faça a seguinte operação:
        //Solicite ao usuário as seguintes informações : nome / peso / altura 
        //use a fórmula do IMC :  peso/altura * altura 
        //Forneça o resultado ao usuário.
        
        Scanner grava = new Scanner(System.in);
        
        String nome = "";
        double peso = 0, altura = 0, imc1 = 0, imc2 = 0;
        
        System.out.println("Digite seu nome, peso e altura:");
        nome = grava.next();
        peso = grava.nextDouble();
        altura = grava.nextDouble();
        
        imc1 = altura * altura;
        imc2 = peso / imc1;
        
        System.out.println("Seu IMC é de: " + imc2);
    }
}
