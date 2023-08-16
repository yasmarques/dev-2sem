
package aula8.lista2_exerc4;

import java.util.Scanner;

public class Aula8Lista2_Exerc4 {

    public static void main(String[] args) {
        //Solicite ao usuário 3 números e ordene do menor para o maior;
        
        Scanner gravar = new Scanner(System.in);
		
	int v1 , v2 , v3, temp ;
		
	System.out.println("Digite valor 1");
	v1 =gravar.nextInt();
	System.out.println("Digite valor 2");
	v2 =gravar.nextInt();
	System.out.println("Digite valor 3");
	v3 =gravar.nextInt();
	
	for(int x =0 ; x<=1000 ; x++){
	if(v1>v2){
			
            temp =v1;
            v1= v2;
            v2 =temp;
					
	} else if(v2>v3){
			
            temp =v2;
            v2= v3;
            v3 =temp;
					
	}else if(v3 <v1){
			
            temp =v3;
            v3= v1;
            v1 =temp;
					
	}
	} 
	
	System.out.println(v1 + " " + v2 + " " + v3);
    }
}
