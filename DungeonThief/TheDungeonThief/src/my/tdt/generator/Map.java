package my.tdt.generator;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import my.project.gop.main.Vector2F;
import my.project.gop.main.loadImageFrom;
import my.tdt.main.Main;

public class Map {

	TileManager tiles = new TileManager();
	
	public Map() {
	
	}

	public void init(){
		BufferedImage map = null;	
		
		try{
			map = loadImageFrom.LoadImageFrom(Main.class, "map.png");
		}catch(Exception e){
			
		}		
				for(int x = 0;x < 100;x++){
					for(int y = 0;y < 100;y++){
						
						int col = map.getRGB(x, y);
						
						switch(col & 0xFFFFFF){
						case 0x808080:
							//System.out.println("Contains grey!!"  + " x:" + x + ", y:" + y);
							tiles.blocks.add(new Block(new Vector2F(x * 32, y* 32)));
						break;
						/*default:
							System.out.println("no color" + " x:" + x + ", y:" + y);
						break;*/
				}
			}
		}

	}
	public void tick(double deltaTime) {
		tiles.tick(deltaTime);
	}
	
	public void render(Graphics2D g) {
		tiles.render(g);
	}

}
