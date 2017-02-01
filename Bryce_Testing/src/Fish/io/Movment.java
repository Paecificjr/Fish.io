package Fish.io;

import java.awt.event.KeyEvent;

public class Movment {
	/* This class will be used to control the movement of the fish.
	 * Players will control the fish using the arrow keys
	 * It will be using getKeyCode to read the input  
	 */
	
	public void keyPressed (KeyEvent e) {
		int c = e.getKeyCode();
		if (c==keyEvent.VK_UP){
			b.y--;
		}
		else if(c==KeyEvent.VK_DOWN){
			b.y++
		}
		else if(c==KeyEvent.VK_LEFT){
			b.x--;
		}
		else if(c==KeyEvent.VK_RIGHT){
			b.x++;
		}
		
		System.out.println(b.x);
		b.repaint;
	}
	
	
	
	
	public int MoveUp(int Y, int Up){
		if(Up == 1){
			Y--;
		}
		return Y;
	}
	
	public int MoveDown(int Y, int Down){
		if(Down == 1){
			Y++;
		}
		return Y;
	}
	
	public int MoveRight(int X, int Right){
		if(Right == 1){
			X++;
		}
		return X;
	}
	
	public int MoveLeft(int X, int Left){
		if(Left == 1){
			X--;
		}
		return X;
	}
}
