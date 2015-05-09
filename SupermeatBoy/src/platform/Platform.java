package platform;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Platform {
	private int xCoord;
	private int yCoord;
	private int width;
	private int height;
	private Rectangle platformHitbox;
	private int xscroll;
	private int yscroll;

	public Platform(int x, int y, int w, int h){
		xscroll=0;
		yscroll=0;
		xCoord = x;
		yCoord = y;
		width = w;
		height = h;
		platformHitbox = new Rectangle(xCoord,yCoord,width,height);

	}
	public Rectangle getHitbox(){
		return platformHitbox;
	}
	public int getTop(){
		return platformHitbox.y;
	}
	public int getLeft(){
		return platformHitbox.x;
	}
	public int getRight(){
		return platformHitbox.x+width;
	}
	public int getBottom(){
		return platformHitbox.y+height;
	}
	public void setScroll(int dx,int dy){
		xscroll=dx;
		yscroll=dy;
	}
}