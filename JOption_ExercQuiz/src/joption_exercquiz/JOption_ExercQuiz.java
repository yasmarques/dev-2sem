package joption_exercquiz;

import javax.swing.JOptionPane;

public class JOption_ExercQuiz {

    public static void main(String[] args) {
        int menu = 0;
        int ponto = 0;

        do {
            String x = JOptionPane.showInputDialog(null, "1 - Iniciar Quiz \n 2 - Sair");
            menu = Integer.parseInt(x);

            ponto = 0;

            if (menu == 1) {
                
                int res = 0;
                               //    0        1         2         3 
                Object[] opcoes1 = {"Haku", "Yubaba", "Kamaji", "Lin"};

                res = JOptionPane.showOptionDialog(null, "Qual é o nome do dragão de A Viagem de Chihiro?", "Quiz", 0, 3, null, opcoes1, "");

                if (res == 0) {
                    JOptionPane.showMessageDialog(null, "Resposta Certa! =) ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Errada! =( ");
                }
                // -------------------------------------------------------------------------------------------------------------------

                Object[] opcoes2 = {"Vietnã", "Ucrânia", "Iraque", "Segunda Guerra"};

                res = JOptionPane.showOptionDialog(null, "O Castelo Animado foi baseado na guerra do:", "Quiz", 0, 3, null, opcoes2, "");

                if (res == 2) {
                    JOptionPane.showMessageDialog(null, "Resposta Certa! =) ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Errada! =( ");
                }
                // -----------------------------------------------------------------------------------------------------------------------

                Object[] opcoes3 = {"Princesa Kaguya", "A Bruxa", "Memórias de Marnie", "Vidas ao Vento"};

                res = JOptionPane.showOptionDialog(null, "Qual foi o ultimo filme lançado pelo Studio Ghibli?", "Quiz", 0, 3, null, opcoes3, "");

                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Resposta Certa! =) ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Errada! =( ");
                }
                
                //-------------------------------------------------------------------------------------------------------------------------------

                Object[] opcoes4 = {"Princesa Mononoke", "Meu Amigo Totoro", "Castelo no Céu", "Túmulo dos Vagalumes"};

                res = JOptionPane.showOptionDialog(null, "Qual desses filmes NÃO foi feito por Hayao Miyazaki?", "Quiz", 0, 3, null, opcoes4, "");

                if (res == 3) {
                    JOptionPane.showMessageDialog(null, "Resposta Certa! =) ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Errada! =( ");
                }
                
                //-------------------------------------------------------------------------------------------------------------------------------

                Object[] opcoes5 = {"Kiki", "Mononoke", "Howl", "Yubaba"};

                res = JOptionPane.showOptionDialog(null, "Qual desses personagens NÃO é um bruxo(a)/feiticeiro(a)?", "Quiz", 0, 3, null, opcoes5, "");

                if (res == 1) {
                    JOptionPane.showMessageDialog(null, "Resposta Certa! =) ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Errada! =( ");
                }
                
                //----------------------------------------------------------------------------------------------------------
                Object[] opcoes6 = {"Stop Motion", "2D", "3D", "Live Action"};

                res = JOptionPane.showOptionDialog(null, "O filme A Bruxa é feito em que estilo de arte?", "Quiz", 0, 3, null, opcoes6, "");

                if (res == 2) {
                    JOptionPane.showMessageDialog(null, "Resposta Certa! =) ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Errada! =( ");
                }
                // -------------------------------------------------------------------------------------------------------------------

                Object[] opcoes7 = {"Sapatos", "Vestidos", "Feitiços", "Chapéus"};

                res = JOptionPane.showOptionDialog(null, "A loja de Sophie em O Castelo Animado era de:", "Quiz", 0, 3, null, opcoes7, "");

                if (res == 3) {
                    JOptionPane.showMessageDialog(null, "Resposta Certa! =) ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Errada! =( ");
                }
                // -----------------------------------------------------------------------------------------------------------------------

                Object[] opcoes8 = {"Verde", "Vermelho", "Azul", "Ammarelo"};

                res = JOptionPane.showOptionDialog(null, "Qual era a cor do balde em que Ponyo estava?", "Quiz", 0, 3, null, opcoes8, "");

                if (res == 0) {
                    JOptionPane.showMessageDialog(null, "Resposta Certa! =) ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Errada! =( ");
                }
                
                //-------------------------------------------------------------------------------------------------------------------------------

                Object[] opcoes9 = {"Calcifer", "Haku", "Ponyo", "Totoro"};

                res = JOptionPane.showOptionDialog(null, "Qual personagem é a logo do Studio Ghibli?", "Quiz", 0, 3, null, opcoes9, "");

                if (res == 3) {
                    JOptionPane.showMessageDialog(null, "Resposta Certa! =) ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Errada! =( ");
                }
                
                //-------------------------------------------------------------------------------------------------------------------------------

                Object[] opcoes10 = {"Goro Miyazaki", "Isao Takahata", "Hayao Miyazaki", "Keiko Niwa"};

                res = JOptionPane.showOptionDialog(null, "Quem é o fundador do Studio Ghibli?", "Quiz", 0, 3, null, opcoes10, "");

                if (res == 2) {
                    JOptionPane.showMessageDialog(null, "Resposta Certa! =) ");
                    ponto++;
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Errada! =( ");
                }
                
                //----------------------------------------------------------------------------------------------------------
                
                if (ponto <= 4){
                    JOptionPane.showMessageDialog(null,ponto + " Você ganhou um I");
                } else if (ponto <= 6){
                    JOptionPane.showMessageDialog(null,ponto + " Você ganhou um R");
                } else if (ponto <= 9){
                    JOptionPane.showMessageDialog(null,ponto + " Você ganhou um B");
                } else{
                    JOptionPane.showMessageDialog(null,ponto + " Você ganhou um MB");
                }
            }

        } while (menu != 2);
        JOptionPane.showMessageDialog(null, "Saindo");
        //-------------------------------------------------------------------------------------------------------------------------
    }

}
