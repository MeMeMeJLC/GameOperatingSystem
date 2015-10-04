package my.tdt.generator;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import my.project.gop.main.Vector2F;

public class Block extends Rectangle{
	
	Vector2F pos = new Vector2F();
	private int BlockSize = 32;
	
	public Block(Vector2F pos) {
		this.pos = pos;	
	}
	
	public void tick(double deltaTime) {
		
	}
	
	public void render(Graphics2D g) {
		g.drawRect((int)pos.getWorldLocation().xPos, (int)pos.getWorldLocation().yPos, BlockSize, BlockSize);
	}

}
