package my.tdt.main;

import java.awt.image.BufferedImage;

import my.project.gop.main.SpriteSheet;
import my.project.gop.main.loadImageFrom;

public class Assets {
	
	SpriteSheet blocks = new SpriteSheet();
	
	private BufferedImage stone_1;
	
	public void init(){
		blocks.setSpriteSheet(loadImageFrom.LoadImageFrom(Main.class, "SpriteSheet.png"));
	
		stone_1 = blocks.getTile(0, 0, 16, 16);
	}
}
