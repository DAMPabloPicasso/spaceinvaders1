package com.iespablopicasso.spaceinvaders2;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

/**
 * Clase Batallon. Representa a una lista de escuadrones. Se encargará de coordinar el movimiento
 * y la renderización en pantalla de los escuadrones
 */
public class Batallon {
    //El número de escuadrones para un batallón será determinado por una constante, y los escuadrones
    //los ubicaremos calculando el espacio entre ellos para rellenar el total de la mitad del alto
    //de la pantalla
    static private final byte NUM_ESCUADRONES = 4;

    //Almacenaremos las naves enemigas en un array list
    protected ArrayList<Escuadron> listaEscuadras;


    //También nos quedaremos con el alto y ancho de la pantalla. Nos servirá para calcular movimientos...
    protected int altoPant;
    protected int anchoPant;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES
    public Batallon(int ancho, int alto) {


    }

    //Resto de comportamiento

    //Vamos a pintarnos
    public void pintarse(SpriteBatch miSB) {


    }

    //El comportamiento moverseEnArmonia le pide a los escuadrones que se muevan
    public void moverseEnArmonia() {


    }

    //Avanzar. Nos movemos todos hacia abajo.
    public void avanzar() {

    }


    //Liberación de los recursos
    public void dispose() {

    }


    //Comportamiento estaVacio. Devuelve true si el tamaño del batallón es 0 naves
    public boolean estaVacio() {

        return false;


    }

    //Devuelve el número de naves que sobreviven en el batallón
    public byte numNaves() {


        return 0;
    }



    //Colisiona. El batallón en sí mismo (una de sus naves) puede colisionar con la nave principal o con uno
    //de nuestros disparos
    public boolean colisiona(ObjetoVolador nave) {


        return false;

    }

    //El batallón recibe la orden de disparar, y le pedirá a alguno de los escuadrones
    //al azar que dispare.
    public DisparoEnemigo disparar() {


        return null;
    }
}