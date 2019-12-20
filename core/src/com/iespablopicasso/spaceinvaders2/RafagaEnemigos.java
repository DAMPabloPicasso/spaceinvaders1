package com.iespablopicasso.spaceinvaders2;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;





/**
 * Clase RafagaEnemigos. Representa a una lista de disparos enemigos. Se encargará de almacenarlos y
 * también de ir eliminando los que se salgan de la pantalla.
 */

public class RafagaEnemigos {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //Almacenaremos las naves enemigas en un array list
    protected ArrayList<DisparoEnemigo> listaDisparos;

    //También nos quedaremos con el alto de la pantalla. Nos servirá para eliminar disparos
    protected int altoPant;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES
    public RafagaEnemigos(int alto) {

    }


    //Resto de comportamientos

    //Método para crear un nuevo disparo
    public void crearDisparo(DisparoEnemigo nuevoDisparo) {



    }

    //Método pintarse
    public void pintarse(SpriteBatch miSB) {


    }


    //Método Moverse. Tan sencillo como mover cada uno de los disparos, pero...
    //Si el primer disparo (es el único que puede traspasar la frontera superior de la pantalla)
    //se sale, hay que eliminarlo
    public void moverse() {
        DisparoEnemigo disparoPrimero;



    }

    //Método dispose. Para eliminar los recursos
    public void dispose() {

    }

    //Colisiona. Calcula si los disparos han dado en la nave aliada
    public boolean colisiona(NavesAliadas nave) {


        return false;
    }
}
