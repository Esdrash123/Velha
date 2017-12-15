/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import java.util.Scanner;

public class Logica {

    public Logica() {
    }

    Scanner sc = new Scanner(System.in);

    String[][] matriz = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    public String tabuleiro() {

        String casa = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casa = casa + "  " + (matriz[i][j]);
            }
            casa = casa + "\n";
        }
        return casa;
    }

    public String declararJogada(String posicao, String j) {
        String mensagem = "Jogada Realizada";

        if (posicao.equals("1")) {
            matriz[0][0] = j;
        } else if (posicao.equals("2")) {
            matriz[0][1] = j;
        } else if (posicao.equals("3")) {
            matriz[0][2] = j;
        } else if (posicao.equals("4")) {
            matriz[1][0] = j;
        } else if (posicao.equals("5")) {
            matriz[1][1] = j;
        } else if (posicao.equals("6")) {
            matriz[1][2] = j;
        } else if (posicao.equals("7")) {
            matriz[2][0] = j;
        } else if (posicao.equals("8")) {
            matriz[2][1] = j;
        } else if (posicao.equals("9")) {
            matriz[2][2] = j;
        } else if (!posicao.equals("9") && !posicao.equals("8") && !posicao.equals("7") && !posicao.equals("6")
                && !posicao.equals("5") && !posicao.equals("4") && !posicao.equals("3") && !posicao.equals("2")
                && !posicao.equals("1")) {
            mensagem = "número inválido";
        }
        return posicao;
    }

    public boolean validarJogada() {
        String posicao = this.declararJogada(sc.next(), sc.next());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j].equals(posicao)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String Ganhou(int jogadas) {

        String[] T = new String[8];
        String vencedor = "null";

        if (jogadas == 9) {
            vencedor = "OPS, deu velha ngm";
        }
        //linha
        T[0] = matriz[0][0] + matriz[0][1] + matriz[0][2];
        T[1] = matriz[1][0] + matriz[1][1] + matriz[1][2];
        T[2] = matriz[2][0] + matriz[2][1] + matriz[2][2];
        //coluna
        T[3] = matriz[0][0] + matriz[1][0] + matriz[2][0];
        T[4] = matriz[0][1] + matriz[1][1] + matriz[2][1];
        T[5] = matriz[0][2] + matriz[1][2] + matriz[2][2];
        //Diagonal
        T[6] = matriz[0][0] + matriz[1][1] + matriz[2][2];
        T[7] = matriz[0][2] + matriz[1][1] + matriz[2][0];

        for (int i = 0; i < T.length; i++) {
            if (T[i].equals("xxx")) {
                vencedor = " Jogador 1";
            } else if (T[i].equals("000")) {
                vencedor = " Jogador 2";
            }
        }
        return vencedor;
    }

}
