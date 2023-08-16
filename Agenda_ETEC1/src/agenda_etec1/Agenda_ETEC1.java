
package agenda_etec1;

import View.Inicio_GUI;
import View.Splash_GUI;


public class Agenda_ETEC1 {

    public static void main(String[] args) {
        Controller.Testa_DB.Conecta();
        new Splash_GUI().setVisible(true);
    }
    
}
