package com.iespablopicasso.spaceinvaders2.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.iespablopicasso.spaceinvaders2.MyGdxSpaceInvaders2;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MyGdxSpaceInvaders2(), config);
	}
}
