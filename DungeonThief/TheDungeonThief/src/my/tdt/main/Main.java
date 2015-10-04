package my.tdt.main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import my.project.gop.main.GameWindow;
import my.project.gop.main.SpriteSheet;
import my.tdt.gameLoop.GameLoop;

public class Main {
	public static GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	public static int width =gd.getDisplayMode().getWidth();
	public static int height =gd.getDisplayMode().getHeight();
	//static SpriteSheet blocks = new SpriteSheet();

	public static void main(String[] args) {
		GameWindow frame = new GameWindow("The Dungeon Thief",  width, height);
		frame.setFullScreen(0);
		frame.add(new GameLoop(width,height));
		frame.setVisible(true);
		//blocks.getTile(0, 0, 8, 8);
	}
}
