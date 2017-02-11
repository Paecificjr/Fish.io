package test;
	

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class KeyboardImage extends JFrame{

boolean playerOne = true;
boolean playerTwo = true;
boolean fired = false;

Image playerI;
Image playerII;
Image bullet;

int playerIX = 100;
int playerIY = 200;

int playerIIX = 500;
int playerIIY = 200;

int bulletX;
int bulletY;


public KeyboardImage(){
    //Load Images:
    ImageIcon playerfirst = new     ImageIcon("U:/Workspace2/Fish.io/Fish.io/twitter-photonstorm-right.png");
    playerI = playerfirst.getImage();
    
    ImageIcon playersecond = new ImageIcon("U:/Workspace2/Fish.io/Fish.io/image.png");
    playerII = playersecond.getImage();
    //Set up game

      addKeyListener(new AL());

       addMouseListener(new Mouse());

       init();

}

private Image dbImage;
private Graphics dbg;


public static void main(String[] args) {
  new KeyboardImage();
}


//When the program playerOnes, thins are initialised here

public void init(){
    windowManager();
}
public void paintComponent(Graphics g){

    if(playerOne == true){
        g.drawImage(playerI, playerIX, playerIY, this);
    }
    
    if(playerTwo == true){
        g.drawImage(playerII, playerIIX, playerIIY, this);
    }
    if(fired == true){
        g.drawImage(bullet, bulletX, bulletY, this);
    }

    repaint();

}

public void paint(Graphics g){
    dbImage = createImage(getWidth(), getHeight());
    dbg = dbImage.getGraphics();
    paintComponent(dbg);
    g.drawImage(dbImage,0,0,this);
}


public void bullet(){
    bulletX = playerIX;
    bulletY = playerIY;
    while(fired == true){
        bulletX = bulletX + 10;
        if(bulletX == 800){
            bullet = null;
            fired = false;
        }
    }

}


public void windowManager(){

      JFrame f = new JFrame();

      setTitle("Engine");
      setVisible(true);
      setResizable(false);
      setSize(800,400);
      setBackground(Color.GREEN);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public class AL extends KeyAdapter{
    public void keyPressed(KeyEvent e){

        int keyCode = e.getKeyCode();
        if((keyCode == KeyEvent.VK_UP) && (playerOne == true) && (playerIY - 10 > 0)){
               playerIY = playerIY - 10;
        }
        
        else if((keyCode == KeyEvent.VK_DOWN) && (playerOne == true) && (playerIY + 10 < 400)){
            playerIY = playerIY + 10;
        }
        
        else if((keyCode == KeyEvent.VK_RIGHT) && (playerOne == true) && (playerIX + 10 < 800 )){
        	playerIX = playerIX + 10;
        	
        	ImageIcon playerfirst = new ImageIcon("U:/Workspace2/Fish.io/Fish.io/twitter-photonstorm-right.png");
            playerI = playerfirst.getImage();
        }
        
        else if((keyCode == KeyEvent.VK_LEFT) && (playerOne == true) && (playerIX - 10 > 0 )){
        	playerIX = playerIX - 10;
        	
        	ImageIcon playerfirst = new     ImageIcon("U:/Workspace2/Fish.io/Fish.io/twitter-photonstorm-left.png");
            playerI = playerfirst.getImage();
        }
//        if((keyCode == KeyEvent.VK_SPACE) && (fired == false)){
//            fired = true;
//            if(fired == true){
//                bullet();
//            }
//        } 
	     if((keyCode == KeyEvent.VK_W) && (playerTwo == true) && (playerIIY - 10 > 0)){
	            playerIIY = playerIIY - 10;
	     }
	     
	     else if((keyCode == KeyEvent.VK_S) && (playerTwo == true) && (playerIIY + 10 < 400)){
	         playerIIY = playerIIY + 10;
	     }
	     
	     else if((keyCode == KeyEvent.VK_D) && (playerTwo == true) && (playerIIX + 10 < 800 )){
	     	playerIIX = playerIIX + 10;
	     	
	     	ImageIcon playerfirst = new ImageIcon("U:/Workspace2/Fish.io/Fish.io/image.png");
	         playerII = playerfirst.getImage();
	     }
	     
	     else if((keyCode == KeyEvent.VK_A) && (playerTwo == true) && (playerIIX - 10 > 0 )){
	     	playerIIX = playerIIX - 10;
	     	
	     	ImageIcon playerfirst = new     ImageIcon("U:/Workspace2/Fish.io/Fish.io/image.png");
	         playerII = playerfirst.getImage();
	     }
        
    }

    public void keyReleased(KeyEvent e){
    }
}

public class Mouse extends MouseAdapter {
public void mousePressed(MouseEvent e) {

    double x = e.getX();
    double y = e.getY();

}
}
}