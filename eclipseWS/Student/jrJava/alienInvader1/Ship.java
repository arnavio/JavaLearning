package jrJava.alienInvader1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ship implements KeyListener {

	private int x, y; // top center
	private Color color = Color.red;
	private int eachHeight = 20;
	private int topWidth = 4, middleWidth = 20, bottomWidth = 60;
	
	
	public Ship(int _x, int _y){
		x = _x;
		y = _y;
	}
	
	
	public boolean isHit(Missile missile){
						
		if(     missile.getX()>=x-topWidth/2-Missile.getWidth()/2 && 
				missile.getX()<=x+topWidth/2+Missile.getWidth()/2 && 
				missile.getY()>=y &&
				missile.getY()<=y+eachHeight+Missile.getHeight()  ||
				
			    missile.getX()>=x-middleWidth/2-Missile.getWidth()/2 &&
				missile.getX()<=x+middleWidth/2+Missile.getWidth()/2 && 
				missile.getY()>=y+eachHeight &&
				missile.getY()<=y+2*eachHeight+Missile.getHeight()  ||
				
			    missile.getX()>=x-bottomWidth/2-Missile.getWidth()/2 &&
				missile.getX()<=x+bottomWidth/2+Missile.getWidth()/2 && 
				missile.getY()>=y+2*eachHeight &&
				missile.getY()<=y+3*eachHeight+Missile.getHeight()  ){
			
			//Coordinator.gameOn = false;
			return true;
		}
		
		return false;
	}
	
	
	
	public boolean isHit(Alien alien){
		
		if(     alien.getX()>=x-topWidth/2-Alien.getWidth()/2 && 
				alien.getX()<=x+topWidth/2+Alien.getWidth()/2 && 
				alien.getY()>=y &&
				alien.getY()<=y+eachHeight+Alien.getHeight()  ||
				
			    alien.getX()>=x-middleWidth/2-Alien.getWidth()/2 &&
				alien.getX()<=x+middleWidth/2+Alien.getWidth()/2 && 
				alien.getY()>=y+eachHeight &&
				alien.getY()<=y+2*eachHeight+Alien.getHeight()  ||
				
			    alien.getX()>=x-bottomWidth/2-Alien.getWidth()/2 &&
				alien.getX()<=x+bottomWidth/2+Alien.getWidth()/2 && 
				alien.getY()>=y+2*eachHeight &&
				alien.getY()<=y+3*eachHeight+Alien.getHeight()  ){
			
			//Coordinator.gameOn = false;
			return true;
		}
		return false;
	}
	
	
	public void draw(Graphics canvas){
		canvas.setColor(color);
		canvas.drawRect(x-topWidth/2, y, topWidth, eachHeight); 
		canvas.drawRect(x-middleWidth/2, y+eachHeight, middleWidth, eachHeight);
		canvas.drawRect(x-bottomWidth/2, y+2*eachHeight, bottomWidth, eachHeight); 
	}


	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if(keyCode==KeyEvent.VK_LEFT) x -= 3;
		else if(keyCode==KeyEvent.VK_RIGHT) x += 3;
		else if(keyCode==KeyEvent.VK_SPACE){
			Coordinator.torpedo = new Torpedo(x, y-Torpedo.getHeight(), -2);
		}
	}

	
	public void keyTyped(KeyEvent e) { }
	public void keyReleased(KeyEvent e) { }
	
}


 







