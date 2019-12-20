package com.iespablopicasso.spaceinvaders2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

/**
 * Clase que implementa el controlador de nuestro videojuego. Realizará la gestión de la entrada del teclado,
 * la gestión de la inicialización, del control del estado del videojuego
 */
public class ControladorJuego {

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //CONSTANTES
    static private final int PANTALLA_INICIO = 0;
    static private final int PANTALLA_JUEGO = 1;

    static private final float INDICE_POSICION_XWING = 10f;
    static private final float TASA_DISPARO_ENEMIGOS = 0.01f;

    //RESTO DEL ESTADO

    //Variable para saber el estado en el que estamos:
    // 0 . Pantalla inicio
    // 1. Jugando
    int estadoJuego;

    //Fondo parallax
    ParallaxEscena escena;

    //Tendremos un SpriteBatch para dibujar en la pantalla
    SpriteBatch batch;

    //Nuestra nave principal...
    NavesAliadas xwing;

    //El estado del teclado
    EstadoTeclado et;

    //Ponemos un batallón
    Batallon empire;

    //Ahora un objeto RafagaAliada para almacenar los disparos aliados
    RafagaAliada disparosAliados;

    //Por último un objeto RafagaEnemiga para almacenar disparos enemigos
    RafagaEnemigos disparosEmpire;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //El constructor creará a su vez: personajes iniciales y fondo
    public ControladorJuego() {



    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //Resto de comportamientos


    //El controlador tendrá que saber que pasa cuando hay que pintarse
    public void render() {



    }

    //El controlador tendrá que saber como finalizar y cerrar recursos
    public void dispose() {
        //aquí tengo que liberar los objetos que integren texturas y también al batch de dibujo




    }

    //Método de control del estado. Es interno. Para ayudar al método render
    private void controlEstado() {

    }

    //Método de control del estado cuando jugamos.
    private void controlEstadoJugando() {









    }

    private void controlEstadoPantallaInicio() {


    }

    //Al principio, y cada vez que recomencemos la partida, se reinician los objetos
    private void inicializarObjetos() {



    }

    private void dibujarPantallaInicial() {

    }
}
