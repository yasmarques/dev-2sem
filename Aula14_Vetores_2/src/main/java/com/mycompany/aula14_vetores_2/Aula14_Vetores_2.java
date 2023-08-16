

package com.mycompany.aula14_vetores_2;

import java.util.Random;
import javax.swing.JOptionPane;

public class Aula14_Vetores_2 {

    public static void main(String[] args) {
        //Faça um programa que leia um vetor de 5 posições de números inteiros e
        //mostre somente os positivos.
        
        double [] valor = new double [5];
        String total = "";
        Random gera = new Random();
        
        for (int i=0; i<5; i++){
            valor[i] = gera.nextInt(15)-10;
            
            if (valor[i] > 0){
                total = total + valor[i] + " | ";
            }
        }
        JOptionPane.showMessageDialog(null, total);
    }
}
