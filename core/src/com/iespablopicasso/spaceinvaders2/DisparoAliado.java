package com.iespablopicasso.spaceinvaders2;


import javax.swing.JWindow;

/**
 * Clase DisparoAliado. Representa a uno de nuestros disparos
 */

public class DisparoAliado extends ObjetoVolador {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //Definimos una constante para el nombre del fichero que contiene el sprite principal
    static private final String NOMBRE_SPRITE = "disparo_aliado.png";

    //Las constantes para definir la velocidad de estos disparos
    static private final float VELOCIDAD_INICIAL_Y = 4.0f;
    static private final float VELOCIDAD_INICIAL_X = 0.0f;



    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES
    public DisparoAliado(float nuevaPosX,float nuevaPosY) {
        super(nuevaPosX,nuevaPosY,VELOCIDAD_INICIAL_X,VELOCIDAD_INICIAL_Y,NOMBRE_SPRITE);

    }

    //Resto de comportamiento
    @Override
    public boolean colisiona(ObjetoVolador otro) {
        boolean resultado;

        //Columnas ¿he colisionado? y Filas ¿he chocado?

        resultado= (otro.getAnchoDiv2() + anchoDiv2 >= Math.abs(otro.getPosX() - posX)) &&
                (otro.getAltoDiv2() + altoDiv2 >= Math.abs(otro.getPosY() - posY));

        if (resultado || posY<= JWindow.HEIGHT){
            dispose();
        }

        return resultado;
    }
}