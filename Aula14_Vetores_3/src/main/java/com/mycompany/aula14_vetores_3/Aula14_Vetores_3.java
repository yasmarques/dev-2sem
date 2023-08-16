
package com.mycompany.aula14_vetores_3;

import java.util.Random;
import javax.swing.JOptionPane;

public class Aula14_Vetores_3 {

    public static void main(String[] args) {
         //Faça um programa que carregue um vetor com 7 números inteiros, calcule e mostre:
        //a) os números múltiplos de 2
        //b) os números múltiplos de 3
        //c) os números múltiplos de 2 e de 3
        
        double [] valor = new double[7];
        String total1 = "";
        String total2 = "";
        String total3 = "";
        Random gera = new Random();
        
        for (int i=0; i<7; i++){
            valor[i] = gera.nextInt(20);
            
            if(valor[i] % 2 == 0){
                
                total1 = total1 + valor[i] + " | ";
                
            } if (valor[i] % 3 == 0){
                
                total2 = total2 + valor[i] + " | ";
                
            } if (valor[i] % 2 == 0 && valor[i] % 3 == 0){
                
                total3 = total3 + valor[i] + " | ";
            }
        }
        JOptionPane.showMessageDialog(null, total1 + "\n Multiplos de 2");
        JOptionPane.showMessageDialog(null, total2 + "\n Multiplos de 3");
        JOptionPane.showMessageDialog(null, total3 + "\n Multiplos de 2 e de 3");
    }
}
