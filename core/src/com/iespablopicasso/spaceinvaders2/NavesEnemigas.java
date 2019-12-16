package com.iespablopicasso.spaceinvaders2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.swing.JWindow;

/**
 * Clase NavesEnemigas. Representa a una nave enemiga. Estas naves pueden disparar
 * y también explotan si colisionan, y son manejadas por nuestra simple y azarosa IA
 * Esta clase hereda de la clase NaveEspacial
 */
public class NavesEnemigas extends NaveEspacial {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //Definimos una constante para el nombre del fichero que contiene el sprite principal
    //y otra para el sprite secundario
    static private final String NOMBRE_SPRITE = "enemigo.png";
    static private final String NOMBRE_SPRITE_2 = "enemigo2.png";

    //Definimos una constante para el nombre del fichero que contiene el sprite explosión
    static private final String NOMBRE_SPRITE_EXP = "explosion.png";
    static private final float VELOCIDAD_INICIAL_Y = -3f;
    static private final float VELOCIDAD_INICIAL_X = 1.0f;
    static private final short MAX_PASOS = 200;
    static private final short TASA_CAMBIO_SPRITE = 40;

    //Imagen que contiene la segunda textura
    protected Texture img2;
    protected short iPasos;



    @Override
    public String toString() {
        return super.toString();
    }


    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////


    //CONSTRUCTORES
    public NavesEnemigas() {
        img2=null;
        iPasos=0;

    }

    public NavesEnemigas(float nuevaPosX,float nuevaPosY) {
        //definimos un contador para el bucle
        byte i ;
        img2=NOMBRE_SPRITE;
    }


    //Resto de comportamiento

    //vamos a movernos automático
    public void moverseauto() {
        super.moverse();

    }

    //Con estos dos movimientos, las naves no son independientes, se dejan "ordenar" por su escuadrón
    //orden de movimiento horizontal
    public void desplazarnos(boolean bDerecha) {
        posX+=VELOCIDAD_INICIAL_X;
    }

    //orden de movimiento vertical
    public void avanzar() {
        posY+=VELOCIDAD_INICIAL_Y;
    }


    //Sobreescribimos pintarse para que maneje dos sprites en vez de uno
    @Override
    public void pintarse(SpriteBatch miSB) {
        boolean AoB;

    //si el contador ha llegado a 30 cambiamos de sprite y reiniciamos contador
        if (iPasos=MAX_PASOS)  {
            AoB=!AoB;
            iPasos=0;
        }

    // cargamos un sprite u otro dependiendo de la variable AoB
        if (AoB) {
            miSB=img;
        }    else {
            miSB=img2;
        }
    // pintamos el sprite e incrementamos contador.
        super.pintarse(miSB);
        iPasos+=iPasos;
    }

    //Sobreescribimos dispose para eliminar nuestro segundo sprite/texture
    @Override
    public void dispose() {
        super.dispose(img);
        super.dispose(img2);
    }

}