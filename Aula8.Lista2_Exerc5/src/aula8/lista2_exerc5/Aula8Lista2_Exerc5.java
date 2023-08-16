
package aula8.lista2_exerc5;

public class Aula8Lista2_Exerc5 {

    public static void main(String[] args) {
        //Imprimir os múltiplos de 7 menores que 200.
        
        int num = 7 , cont =1 , res;
        
        do{
            res = num * cont;
            cont++;
            System.out.println(res);
            
        }while (res< 190);
    }
}
