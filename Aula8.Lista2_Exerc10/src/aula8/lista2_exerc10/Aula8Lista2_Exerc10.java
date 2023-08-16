
package aula8.lista2_exerc10;

import java.util.Scanner;

public class Aula8Lista2_Exerc10 {

    public static void main(String[] args) {
        //Ler três valores e colocá-los em ordem crescente.
        
        Scanner gravar = new Scanner(System.in);
		
	int v1 = 1 , v2 = 2, v3 = 3, temp ;
	
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
