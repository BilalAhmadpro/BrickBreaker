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

import javax.swing.ImageIcon;


public class Brick extends GameObject
{



    Brick(int x, int y, String path) 
    {
        super(x, y, path);
        setDx(2);
    }

    public Rectangle getBounds() //get rectangle bounds
    {
        return new Rectangle(x - w / 2, y - 18, w, h);
    }

    public void duplicate() //draws brick
    {
        ImageIcon imageIcon = new ImageIcon(path);
        img = imageIcon.getImage();
        w = img.getWidth(null);
        h = img.getHeight(null);

    }

    public int getX() 
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}