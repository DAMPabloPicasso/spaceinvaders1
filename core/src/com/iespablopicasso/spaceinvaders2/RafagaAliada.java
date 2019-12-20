package com.iespablopicasso.spaceinvaders2;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

/**
 * Clase RafagaAliada. Representa a una lista de disparos aliados. Se encargará de almacenarlos y
 * también de ir eliminando los que se salgan de la pantalla.
 */

public class RafagaAliada {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //Almacenaremos las naves enemigas en un array list
    protected ArrayList<DisparoAliado> listaDisparos;

    //También nos quedaremos con el alto de la pantalla. Nos servirá para eliminar disparos
    protected int altoPant;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES
    public RafagaAliada(int alto) {

    }


    //Resto de comportamientos

    //Método para crear un nuevo disparo
    public void crearDisparo(float posX,float posY) {


    }

    //Método pintarse
    public void pintarse(SpriteBatch miSB) {


    }


    //Método Moverse. Tan sencillo como mover cada uno de los disparos, pero...
    //Si el primer disparo (es el único que puede traspasar la frontera superior de la pantalla)
    //se sale, hay que eliminarlo
    public void moverse() {


    }

    //Método dispose. Para eliminar los recursos
    public void dispose() {

    }



    //Cálculo de las colisiones de los disparos contra las naves enemigas.
    public void calculaColisionesDisparos(Batallon empire) {


    }
}