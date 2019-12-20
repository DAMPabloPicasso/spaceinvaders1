package com.iespablopicasso.spaceinvaders2;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

/**
 * Clase Escuadron. Representa a una lista de naves enemigas. Estas naves pueden disparar
 * y también explotan si colisionan, y son manejadas por nuestra simple y azarosa IA
 * Esta clase hereda de la clase NaveEspacial
 */
public class Escuadron {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //El número de naves para un escuadrón será determinado por una constante, y las naves
    //las ubicaremos calculando el espacio entre ellas para rellenar el total del ancho
    //de la pantalla
    static private final byte NUM_NAVES = 8;

    //Almacenaremos las naves enemigas en un array list
    protected ArrayList<NavesEnemigas> listaEnem;
    protected ArrayList<NavesEnemigas> listaExpl;

    //Almacenamos la posición Vertical donde nos situamos. Mejora la eficiencia del
    //cálculo de las colisiones
    protected float posVertical;  //Es un equivalente a la posY de las naves.

    //También nos quedaremos con el ancho de la pantalla. Nos servirá para calcular movimientos...
    protected int anchoPant;

    //Tendremos que saber si vamos en armonía hacía la izq o der
    private boolean derecha;
    private byte pasos;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES
    public Escuadron(short anchoPantalla, float posicionVert) {


    }  //Fin de constructor



    //Resto de comportamiento

    //Vamos a pintarnos
    public void pintarse(SpriteBatch miSB) {
        //Tenemos simplemente que pintar cada uno de los elementos del escuadrón


    }

    //El comportamiento moverseEnArmonia mirará si nos movemos a derecha o izquierda
    //Si vamos a la derecha comprobará que no hemos llegado al final del ancho de pantalla
    //con la última nave
    //Si vamos a la izquierda, le tocará comprobar que la primera nave no se ha salido por el 0
    public boolean moverseEnArmonia() {



        return false;

    }

    //Avanzar. Nos movemos todos hacia abajo.
    public void avanzar() {

    }

    //Liberación de los recursos
    public void dispose() {

    }

    //NumNaves. Devuelve el número de naves que quedan vivas en el escuadrón
    public byte numNaves() {
        return 0;
    }


    //Colisiona. Miramos si una nave aliada ha chocado con una enemiga
    public boolean colisiona(ObjetoVolador nave) {



        return false;
    }


    //Disparar
    public DisparoEnemigo disparar() {
        DisparoEnemigo nuevoDisparo = null;

        return nuevoDisparo;
    }
}
