
package aula6.lista1_exerc0;

import java.util.Scanner;

public class Aula6Lista1_Exerc0 {

    public static void main(String[] args) {
        //Calcule o IMC e determine se esta:
        //Abaixo do peso, Peso normal, Sobre peso, Obesidade leve, Obesidade moderada, Obesidade morbida
        Scanner grava = new Scanner(System.in);
        
        double peso = 0, altura = 0, imc = 0;
        
        System.out.println("Digite seu peso e altura:");
        peso = grava.nextDouble();
        altura = grava.nextDouble();
        
        imc = peso / (altura * altura);
        
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if (imc < 24.9){
            System.out.println("Peso normal");
        }
        else if (imc < 29.9){
            System.out.println("Sobre peso");
        }
        else if (imc < 34.9){
            System.out.println("Obesidade leve");
        }
        else if (imc < 39.9){
            System.out.println("Obesidade moderada");
        }
        else {
            System.out.println("Obesidade morbida");
        }
    }
}
