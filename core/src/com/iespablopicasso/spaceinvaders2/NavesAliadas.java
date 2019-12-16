package com.iespablopicasso.spaceinvaders2;


/**
 * Clase NavesAliadas. Representa a una nave principal. Estas naves pueden disparar
 * y también explotan si colisionan, y son manejadas por jugadores a través del teclado
 * Esta clase hereda de la clase NaveEspacial
 */
public class NavesAliadas extends NaveEspacial {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //Definimos una constante para el nombre del fichero que contiene el sprite principal
    static private final String NOMBRE_SPRITE = "navealiada1.png";

    //Definimos una constante para el nombre del fichero que contiene el sprite explosión
    static private final String NOMBRE_SPRITE_EXP = "explosion.png";
    static private final float VELOCIDAD_INICIAL_Y = 0.0f;
    static private final float VELOCIDAD_INICIAL_X = 3.0f;

    //Ancho de la pantalla, para no movernos fuera...
    private short anchoPant;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES
    public NavesAliadas() {
        super();
    }

    public NavesAliadas(float nuevaPosX,float nuevaPosY, short anchoPantalla) {

    }


    //Resto de comportamiento
    public void moverse(EstadoTeclado et) {

    }
}