package my.tdt.gameStates;

import java.awt.Graphics2D;

import my.project.gop.main.SpriteSheet;
import my.project.gop.main.loadImageFrom;
import my.tdt.gameState.GameState;
import my.tdt.gameState.GameStateManager;
import my.tdt.generator.Map;
import my.tdt.main.Main;

public class DungeonLevelLoader extends GameState{

	Map map;
	
	public DungeonLevelLoader(GameStateManager gsm) {
		super(gsm);
	}
	
	@Override
	public void init() {
		map = new Map();
		
		map.init();
	}

	@Override
	public void tick(double deltaTime) {
		map.tick(deltaTime);
	}

	@Override
	public void render(Graphics2D g) {
		//g.drawString("Hello World", 200, 100);
		map.render(g);
	}

}
