
package aula11.lista2_exerc1;

import java.util.Scanner;

public class Aula11Lista2_Exerc1 {

    public static void main(String[] args) {
    //Crie um menu ( Executar e sair ) geral e crie um botão para cada exercicio
        
        //1- Criar um algoritmo que imprima uma tabela de conversão de polegadas para centímetros.
        //Deseja-se que na tabela conste desde 1 polegada até 20 polegadas inteiras.
        //Sabendo-se que a fórmula para conversão em centímetros é (polegadas*2,54)
        
        //2- A conversão de graus Fahrenheit para centígrados é obtida por C = 5*(F-32)/9.
        //Fazer um algoritmo que calcule e escreva uma tabela de graus centígrados em função de graus 
        //Fahrenheit, variando um a um de 50 a 150 graus Fahrenheit.    
    
        //3- Entrar com um nome, idade e sexo de 20 pessoas.
        //Imprimir o nome se a pessoa for do sexo masculino e tiver mais de 21 anos
        
        // 4- Faça um algoritmo que receba 100 valores inteiros e positivos, e resolva as seguintes questões:  
        //(a)  Calcule a raiz quadrada dos valores menores ou iguais a 100.
        //(b) Para todo valor maior que 100, verifique se o mesmo é par, caso seja, imprimir o valor e a mensagem “valor par”.
        //(c) Ao final, imprimir a quantidade de números pares maiores que 100.  
    
        //5- Entrar com sexo de várias pessoas e imprimir quantas pessoas são do sexo masculino.
        //Estabeleça uma condição para saída do algoritmo.  
     
        //6- Dado um país A, com 5.000.000 de habitantes e uma taxa de natalidade de 3% ao ano, e um país  
        //B com 7.000.000 de habitantes e uma taxa de natalidade de 2% ao ano, calcular e imprimir o 
        //tempo necessário para que a população do país A ultrapasse a população do país B.  
    
        //7- João tem 1,50 m de altura e cresce 2 cm por ano, enquanto Maria tem 1,10 m e cresce 3 cm por ano.
        //Construir um algoritmo que calcule e imprima quantos anos serão necessários para que Maria seja maior que João.
        
        Scanner grava = new Scanner(System.in);
    int op = 0;
        
    do {
        System.out.println("Lista de exercícios\n 1- Exercicio1 \n 2- Exercicio2  \n 3- Exercicio3 \n 4- Exercicio4 \n 5- Exercicio5 \n 6- Exercicio6 \n 7- Sair");

        op = grava.nextInt();
            
        if (op == 1){
            double p =50;
            double c =0;
            
            for(p = 1; p <= 20; p++){
             c = p*2.54;
            System.out.println(p +" polegadas é igual " + c + " centimetros.");
            }
        }else if (op == 2){
            double f =50;
            double c =0;
            
            for(f = 50; f <= 150; f++){
             c = 5*(f-32)/9;
            System.out.println(f +"°F Fahrenheit é igual " + c + "°C Celsius");
            }
                
        }else if (op == 3){
            String nome= "";
            int idade = 0, sexo=0, cont=0;
            for(cont = 0; cont <=2; cont++){
                System.out.println("Digite um nome :");
                nome = grava.next();
                System.out.println("Digite a idade :");
                idade = grava.nextInt();
                System.out.println("Selecione o Sexo: \n 1-Mulher / 2-Homem");
                sexo = grava.nextInt();
                if (idade >= 21 && sexo == 2){
                    System.out.println(nome);
                }
            }
        }else if (op == 4){
            int sexo = 0;
            int contm = 0;
     
            do{
                    
                System.out.println("Pesquisa informativa");
                System.out.println("1- Masculino \n 2- Feminino \n3-Não informado \n 0- Para Sair");
                sexo = grava.nextInt();
                if (sexo == 1){
                        contm++;
                }
            } while (sexo != 0);
                    
            System.out.println("A quantidade de pessoas do sexo masculino é" + contm);
                
        }else if (op == 5){
            double a = 5000, b=7000, porca=0, porcb=0;
            int anos = 0;
            while(a < b){
                a = a + (a*0.03);
                b = b + (b*0.02);
                anos ++;
            }
            System.out.println("Levou " + anos + " anos para A passar a B");
                
        }else if (op == 6){
            double maria = 1.10, joao=1.50;
            int anos = 0;
            while(maria < joao){
                maria = maria + (maria+0.03);
                joao = joao + (joao+0.02);
                anos ++;
            }
            System.out.println("Levou " + anos + " anos para Maria passar João");
    
        }else if (op == 7){
                
        }else {
            System.out.println("Opção inválida");
        }
    }while (op != 7);
    } 
}
