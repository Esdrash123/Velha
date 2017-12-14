/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

/**
 *
 * @author ogi
 */
public class Logica {

    public Logica() {
    }

    String[][] m = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    public String tabuleiro() {

        String Posicao = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Posicao = Posicao + "  " + (m[i][j]);
            }
            Posicao = Posicao + "\n";
        }
        return Posicao;
    }

}
