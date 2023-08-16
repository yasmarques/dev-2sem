
package Model;

import static View.Tela_GUI.resultado;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Modelo_DAO {
    public static int [] quina = new int [5];
    public static String total = "";
    public static Random gera = new Random();
    
    public static void gera(){
    for(int i=0; i<5; i++){
    quina[i] = gera.nextInt(50)+10;
    }
    Arrays.sort(quina);
    
    for(int i=0; i<5; i++){
    quina[i] = gera.nextInt(50)+10;
    total = total + quina[i] + " | ";
    
    }
    resultado.setText(total);
    }
    
    
}

