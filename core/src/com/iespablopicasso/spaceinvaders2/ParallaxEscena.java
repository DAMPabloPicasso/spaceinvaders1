package com.iespablopicasso.spaceinvaders2;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Clase Fondo. Se encarga de dibujar y avanzar una simulación de "camara" por una imagen dada
 * En una escena tendremos varios fondos.
 */
public class ParallaxEscena {

    /////////////////////////////////////////////////////////////////////////////////////
    //
    //ESTADO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    private Fondo fondo1;
    private Fondo fondo2;

    private static final String FILE_FONDO1 = "fondo1.png";
    private static final String FILE_FONDO2 = "fondo2.png";
    /////////////////////////////////////////////////////////////////////////////////////
    //
    //COMPORTAMIENTO
    //
    /////////////////////////////////////////////////////////////////////////////////////

    //CONSTRUCTOR
    public  ParallaxEscena() {
        int tamVentanaX;
        int tamVentanaY;

        tamVentanaX = Gdx.graphics.getWidth();
        tamVentanaY = Gdx.graphics.getHeight();
        fondo1 = new Fondo(FILE_FONDO1, 0, -1, 0, 0, tamVentanaX, tamVentanaY);
        fondo2 = new Fondo(FILE_FONDO2, 0, -2, 0, 0, tamVentanaX, tamVentanaY);


    }

    //RESTO DE MÉTODOS

    //Vamos a avanzar la escena moviendo los dos fondos
    public void animar() {

        fondo1.avanzar();
        fondo2.avanzar();


    }

    //pintamos los fondos
    public void render(SpriteBatch miSB) {

        fondo1.pintate(miSB);
        fondo2.pintate(miSB);


    }

    //liberamos recursos
    public void dispose() {
        fondo1.dispose();
        fondo2.dispose();
    }
}

