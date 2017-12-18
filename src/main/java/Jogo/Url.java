/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

/**
 *
 * @author esdra
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("app")
public class Url {

    static Main main = new Main();

    @GET
    @Path("jogar")
    public String realizarJogada(@QueryParam("posicao") String posicao) {

        return main.rodarJogo(posicao, main.getElementoInicial());

    }

    @GET
    @Path("status")
    public String status() {

        return main.logica.definirVencedor(main.getContadorDeJogadas()) + "<br><br>" + main.logica.tabuleiro();

    }

    @GET
    @Path("reiniciar")
    public String reiniciar() {

        return main.reiniciarJogo();

    }
}
