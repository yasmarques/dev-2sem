
package com.mycompany.aula14_vetores;

import java.util.Random;
import javax.swing.JOptionPane;

public class Aula14_Vetores {

    public static void main(String[] args) {
        //Faça um programa que carregue um vetor com 10 números reais.
        //Calcule e mostre a quantidade de números negativos e a soma dos números positivos deste vetor.
        
      double [] valor = new double [10];
        String total = "";
        Random gera = new Random();
        int cont = 0;
        double soma = 0;
        
        for(int i=0; i<10; i++){
            valor[i] = gera.nextInt(30)-20;
            total = total + valor[i] + " | ";
            
            if (valor[i]<0){
                cont++;
            } else {
                soma = soma + valor [i];
            }
            
        }
        JOptionPane.showMessageDialog(null, total + "\nA quantidade de numeros negativos é de " + cont + " e a soma de numeros positivos é de " + soma);
    }
}
