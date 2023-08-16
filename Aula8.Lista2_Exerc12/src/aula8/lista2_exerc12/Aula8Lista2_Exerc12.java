
package aula8.lista2_exerc12;

import java.util.Scanner;

public class Aula8Lista2_Exerc12 {

    public static void main(String[] args) {
        //Ler três valores do teclado e dizer se eles formam um triângulo.
        //Caso afirmativo, dizer seu tipo (equilátero, isósceles ou escaleno).
        
        Scanner grava = new Scanner(System.in);
        
        int l1, l2, l3;
        System.out.println("Digite o primeiro lado:");
        l1 = grava.nextInt();
        System.out.println("Digite o segundo lado:");
        l2 = grava.nextInt();
        System.out.println("Digite o terceiro lado:");
        l3 = grava.nextInt();
        
        if (l1==l2 && l2==l3){
            System.out.println("Triangulo equilatero");
        } else if (l1 != l2 && l2 != l3){
            System.out.println("Triangulo escaleno");
        } else {
            System.out.println("Triangulo isosceles");
        }
    }
}
