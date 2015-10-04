package my.project.gop.main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	boolean fse = false;
	int fullScreenMode = 0;
	GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];

	public GameWindow(String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	private void setFullScreen(){
		switch(fullScreenMode){
		case 0: //if setFullScreen(0)
			System.out.println("no fullscreen");
			setUndecorated(false);
			break;
		case 1: //if setFullScreen(1)
			setUndecorated(true);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case 2: //if setFullScreen(2)
			setUndecorated(true);
			device.setFullScreenWindow(this);
			break;
		}
	}
	public void setFullScreen(int fullScreenNewMode){
		fse = true;
		if(fullScreenMode <= 2){
			this.fullScreenMode = fullScreenNewMode;
			setFullScreen();
		}
		else{
			System.err.println("error " + fullScreenNewMode + " is not supported!");
		}
	}
}
