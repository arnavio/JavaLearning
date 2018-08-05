package engineTester;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;

public class MainGameLoop {

	public static void main(String[] args) {
		
		DisplayManager.makeDisplay();
		
		while(!Display.isCloseRequested()){
						
			DisplayManager.updateDisplay();
			
		}
		
		DisplayManager.closeDisplay();
		
	}

}
