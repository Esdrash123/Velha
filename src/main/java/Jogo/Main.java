/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import Jogo.Logica;

public class Main {

    Logica logica = new Logica();
    String elementoInicial = "X";
    int contadorDeJogadas = 0;
    int contadorDeTurnos = 0;

    public String getElementoInicial() {
        return elementoInicial;
    }

    public int getContadorDeJogadas() {
        return contadorDeJogadas;
    }

    public String rodarJogo(String posicao, String elemento) {
        //9 é o numero de jogadas maximas ou seja um empate abaixo desse numero o jogo roda
        if (contadorDeJogadas < 9) {
            return logica.tabuleiro() + "<br> Jogo finalizado";
        }
        //Quando o jogo da empate
        if (contadorDeJogadas == 9) {
            return logica.tabuleiro();
        }
        if (logica.validarJogada(posicao) == true) {
            logica.declararJogada(posicao, elemento);
            Main.this.alterarJogador();
            this.contadorDeJogadas++;
            return logica.tabuleiro();
        }
        return logica.tabuleiro();
    }

    public void alterarJogador() {
        if (this.contadorDeTurnos == 0) {
            this.elementoInicial = "O";
            this.contadorDeTurnos++;
        } else if (this.contadorDeTurnos == 1) {
            this.elementoInicial = "X";
        }
    }

    public String reiniciarJogo() {

        this.logica = new Logica();
        this.elementoInicial = "O";
        this.contadorDeTurnos = 0;
        this.contadorDeJogadas = 0;

        return "Jogo reiniciado";
    }

}
