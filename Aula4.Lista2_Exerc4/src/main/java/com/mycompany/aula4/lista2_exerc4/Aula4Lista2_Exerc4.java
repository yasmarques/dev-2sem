

package com.mycompany.aula4.lista2_exerc4;

import java.util.Scanner;

public class Aula4Lista2_Exerc4 {

    public static void main(String[] args) {
        //Crie uma classe para efetuar a cálculo da quantidade de litros de combustível gasto em uma viagen.
        //Outras informações:
        //Considerar que um automóvel faz 12 km por litro.
        //Distância = tempo * velocidade.
        //Qdt litros = distância / 12.
        Scanner grava = new Scanner(System.in);
        
        double tempo = 0, veloc = 0, dist = 0, qdt = 0;
        
        System.out.println("Digite o tempo percorrido: ");
        tempo = grava.nextDouble();
        
        System.out.println("Digite a velocidade percorrida: ");
        veloc = grava.nextDouble();
        
        dist = tempo * veloc;
        qdt = dist / 12;
        
        System.out.println("Você gastou " + qdt + "litros em sua viagem");
    }
}
