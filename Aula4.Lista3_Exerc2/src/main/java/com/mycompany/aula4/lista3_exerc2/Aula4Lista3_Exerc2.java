
package com.mycompany.aula4.lista3_exerc2;

import java.util.Scanner;

public class Aula4Lista3_Exerc2 {

    public static void main(String[] args) {
        //Crie uma classe chamada gasto e faça a seguinte operação :
        //Calcule quantos kilometros um carro faz por litro , utilizando a seguinte função :
        //Litros = Km Percorrido / Tempo
        
        Scanner grava = new Scanner(System.in);
        
        double litros = 0, km = 0, tempo = 0;
        
        System.out.println("Digite os kilometros percorridos e tempo:");
        km = grava.nextDouble();
        tempo = grava.nextDouble();
        
        litros = km / tempo;
        
        System.out.println("A quantidade de litros gasto por km é de: " + litros);
    }
}
