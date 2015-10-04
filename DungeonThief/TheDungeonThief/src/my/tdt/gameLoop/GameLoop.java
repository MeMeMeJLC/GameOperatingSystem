package my.tdt.gameLoop;

import java.awt.Component;

import my.project.gop.main.IDGameLoop;
import my.project.gop.main.Vector2F;
import my.tdt.gameState.GameStateManager;
import my.tdt.main.Assets;

public class GameLoop extends IDGameLoop {

	GameStateManager gsm;
	public static Assets assets = new Assets();
	public static float xOffset;
	public static float yOffset;	
	
	
	public GameLoop(int fwidth, int fheight) {
		super(fwidth, fheight);
	}
	

	@Override
	public void init() {
		assets.init();
		Vector2F.setWorldVariables(xOffset, yOffset);
		gsm = new GameStateManager();
		gsm.init();
		super.init();
	}
	
	@Override
	public void tick(double deltaTime) {
		Vector2F.setWorldVariables(xOffset, yOffset);
		gsm.tick(deltaTime);
	}
	
	@Override
	public void render() {
		// TODO Auto-generated method stub
		super.render();
		gsm.render(graphics2D);
		clear();
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
	}
	
}
