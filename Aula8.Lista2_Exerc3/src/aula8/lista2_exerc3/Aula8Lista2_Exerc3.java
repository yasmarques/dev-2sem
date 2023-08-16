
package aula8.lista2_exerc3;

public class Aula8Lista2_Exerc3 {

    public static void main(String[] args) {
        //Imprima todos os múltiplos de 3, entre 1 e 100;
        
        int num = 3 , cont =1 , res;
        
        do{
            res = num * cont;
            cont++;
            System.out.println(res);
            
        }while (res<100);
    }
}
