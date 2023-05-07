/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.ImageIcon;

public class Lives extends GameObject
{
	 int x;
	 int y;
	 int w;
	 int h;
	 Image img;
	 
	 Lives(int x,int y, String path) //creates life image to display numbner of lifes
	    {
	              super(x,y,path);
	    }
	 
	
	 
	 public Rectangle getBounds()
         {
	    return new Rectangle(x-w/2, y-18, w, h);
	} 
	 
	
}

