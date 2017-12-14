/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import Jogo.Logica;
        
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner Entrada = new Scanner(System.in);
        Logica jogo = new Logica();
        String posicao;
        int valida = 0;
        int jogadas = 0;
        
        while(true){                   
            System.out.println("JOGO DA VELHAAAAAAAA");
            System.out.println(jogo.tabuleiro());
                     
             do{//inicia jogador 1
                System.out.println("Jogador 1 onde vc vai jogar????");
                posicao = Entrada.next();
                while(!jogo.validarJogada(posicao)){
                    System.out.println("Jogada inválida, tente dnv");
                    System.out.println("Jogador 1 onde vc vai jogar????");
                    posicao = Entrada.next();
                    valida = 0;
                }
                jogo.realizarJogada(posicao, "x");
                valida = 1;
            }while(valida == 0);//fim jogadir 1
            
            jogadas++;
            valida = 0;
            System.out.println(jogo.tabuleiro());
            
            if(!(jogo.Ganhou(jogadas)==("null"))){
                break;
            }
             do{//inicia jogador 2
                System.out.println("Jogador 2 onde vc vai jogar????");
                posicao = Entrada.next();
                while(!jogo.validarJogada(posicao)){
                    System.out.println("Jogada inválida, tente dnv");
                    System.out.println("Jogador 2 onde vc vai jogar????");
                    posicao = Entrada.next();
                    valida = 0;
                }
                jogo.realizarJogada(posicao, "0");
                valida = 1;
            }while(valida ==0);//fim jogador 2   
             
            jogadas++;
            valida = 0;
            System.out.println(jogo.tabuleiro());
            
            if(!jogo.Ganhou(jogadas).equals("null")){
                break;
            }
        }///////////////////////////////////////////////////////////////////////
        System.out.println(" O " + jogo.Ganhou(jogadas) + " ganhou");
    }    
    //Tá uma bosta, lembrar de ajeitar essa classe teste tem muita porcaria que não era pra tá aí
}
