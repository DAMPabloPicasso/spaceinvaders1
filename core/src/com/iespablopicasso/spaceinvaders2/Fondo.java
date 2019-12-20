package com.iespablopicasso.spaceinvaders2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import javax.swing.JWindow;

/**
 * Clase Fondo. Se encarga de dibujar y avanzar una simulación de "camara" por una imagen dada
 * En una escena tendremos varios fondos.
 */

public class Fondo {
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////
    private Texture imgFondo; //Nuestra imagen a pintar.

    private int velocidadX;
    private int velocidadY;

    private int posX;
    private int posY;
    private int anchoVentana;
    private int altoVentana;
    private int ancho;
    private int alto;

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTOS
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //CONSTRUCTOR/ES
    public Fondo(String fichero, int velImagenX, int velImagenY, int posIniX, int posIniY, int anV, int alV) {

        imgFondo=new Texture(fichero);
        velocidadX=velImagenX;
        velocidadY=velImagenY;
        posX=posIniX;
        posY=posIniY;
        anchoVentana=anV;
        altoVentana=alV;

        // tengo que definir ancho y alto de la ventana visible

        ancho= JWindow.HEIGHT;
        alto=JWindow.WIDTH;
    }

    //RESTO DE COMPORTAMIENTOS


    //método para avanzar la cámara
    public void avanzar() {
        posY-=posY;
    }

    //Comportamiento para pintar la ventana del fondo a utilizar
    public void pintate(SpriteBatch miSB) {
        TextureRegion ventana;

        ventana = new TextureRegion(imgFondo,posX,posY,ancho,alto);
        miSB.begin();
        miSB.draw(ventana,posX,posY);
        miSB.end();

    }


    //Método para liberar recursos
    public void dispose() {
        this.dispose();
    }


    public int getAltoFondo() {
        return alto;
    }

    public int getAnchoFondo() {
        return ancho;
    }
}






