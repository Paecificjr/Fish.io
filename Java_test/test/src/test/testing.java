package test;
import java.applet.Applet;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.net.URL;
import javax.imageio.*;

public class testing extends Applet {
	private BufferedImage img;
	private int move;
	
	public void init(){
		try{
			URL url = new URL(getCodeBase(),"http://docs.oracle.com/javase/tutorial/2d/images/examples/strawberry.jpg");
			img = ImageIO.read(url);
		} catch (IOException e){
		}
		}
	public int move(int MoveWhere){
		return move = MoveWhere;
		
	}
	public void paint(Graphics g){
		g.drawImage(img, move, 0, null);
	}
	

}
