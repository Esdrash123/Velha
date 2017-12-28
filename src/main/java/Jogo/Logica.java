/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

public class Logica {

    public Logica() {
    }

    String[][] matriz = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    //Cria tabuleiro com 9 casas
    public String tabuleiro() {

        String casa = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casa = casa + "  " + (matriz[i][j]);
            }
            casa = casa + "<br>";
        }
        return casa;
    }
    //Declara jogada a ser feita

    public String declararJogada(String posicao, String elemento) {
        String mensagem = " ";

        if (posicao.equals("1")) {
            matriz[0][0] = elemento;
        } else if (posicao.equals("2")) {
            matriz[0][1] = elemento;
        } else if (posicao.equals("3")) {
            matriz[0][2] = elemento;
        } else if (posicao.equals("4")) {
            matriz[1][0] = elemento;
        } else if (posicao.equals("5")) {
            matriz[1][1] = elemento;
        } else if (posicao.equals("6")) {
            matriz[1][2] = elemento;
        } else if (posicao.equals("7")) {
            matriz[2][0] = elemento;
        } else if (posicao.equals("8")) {
            matriz[2][1] = elemento;
        } else if (posicao.equals("9")) {
            matriz[2][2] = elemento;
        } else if (!posicao.equals("9") && !posicao.equals("8") && !posicao.equals("7") && !posicao.equals("6")
                && !posicao.equals("5") && !posicao.equals("4") && !posicao.equals("3") && !posicao.equals("2")
                && !posicao.equals("1")) {
            mensagem = "número inválido";
        }
        return mensagem;
    }

    //Verifica se a posicao desejada esta nas opcoes possiveis de jogadas
    public boolean validarJogada(String posicao) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j].equals(posicao)) {
                    return true;
                }
            }
        }
        return false;
    }
//Define o ganhador da partida ou se ha um empate tendo como base a quantidade de jogadas 

    public String definirVencedor(int jogadas) {

        String[] vetor = new String[8];
        String vencedor = "Ainda não acabou";

        vetor[0] = matriz[0][0] + matriz[0][1] + matriz[0][2];
        vetor[1] = matriz[1][0] + matriz[1][1] + matriz[1][2];
        vetor[2] = matriz[2][0] + matriz[2][1] + matriz[2][2];

        vetor[3] = matriz[0][0] + matriz[1][0] + matriz[2][0];
        vetor[4] = matriz[0][1] + matriz[1][1] + matriz[2][1];
        vetor[5] = matriz[0][2] + matriz[1][2] + matriz[2][2];

        vetor[6] = matriz[0][0] + matriz[1][1] + matriz[2][2];
        vetor[7] = matriz[0][2] + matriz[1][1] + matriz[2][0];

        if (jogadas == 9) {
            vencedor = "Empate!";

        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals("XXX")) {
                vencedor = "A";
            } else if (vetor[i].equals("OOO")) {
                vencedor = "B";
            }
        }

        return vencedor;
    }

}
