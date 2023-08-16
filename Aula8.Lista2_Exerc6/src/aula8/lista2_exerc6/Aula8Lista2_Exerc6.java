
package aula8.lista2_exerc6;

public class Aula8Lista2_Exerc6 {

    public static void main(String[] args) {
        //Calcular e imprimir os números divisíveis por 4 menores que 100.
        
        int num = 1;
        
        do{
            num++;
            if (num % 4 == 0){
            System.out.println(num);
            }
            
        }while (num<100);
    }
}
