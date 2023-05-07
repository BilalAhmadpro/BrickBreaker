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


public abstract class GameObject { //parent class for polymorphism of objects

    protected int x;
    protected int y;
    protected Image img;
    protected int w;
    protected int h;
    protected int dx;
    protected int dy;
    protected String path;
    public int count1 = 0;
    public int count2 = 0;
    public int imageNumber = 0;
    protected int leftDx;
    protected int rightDx;
    protected String pathstr;



    public GameObject(int x, int y, String path)
    {
        pathstr = path;
        this.x = x;
        this.y = y;
        ImageIcon imageIcon = new ImageIcon(path);
        img = imageIcon.getImage();
        w = img.getWidth(null);
        h = img.getHeight(null);

    }

    public void duplicate()
    {
        ImageIcon imageIcon = new ImageIcon(path);
        img = imageIcon.getImage();
        w = img.getWidth(null);
        h = img.getHeight(null);

    }
    public void move()
    {

        this.x += dx;
        this.y += dy;

    }

    public Rectangle getBounds()
    {
        return new Rectangle(x - w / 2, y - 17, w, h);
    }

    public void moveTo(int x, int y) //moves the object
    {
        this.x = x;
        this.y = y;
    }

    public void paintComponent(Graphics2D g) //paints the object
    {
        g.drawImage(img, x - img.getWidth(null) / 2, y - img.getHeight(null) / 2, null);
        g.setColor(new Color(255, 0, 0));

    }

    public int getDx() 
    {
        return dx;
    }

    public void setDx(int dx)
    {
        this.dx = dx;
    }

    public int getDy() 
    {
        return dy;
    }

    public void setDy(int dy)
    {
        this.dy = dy;
    }
    public int getLeftDx()
    {
        return leftDx;
    }

    public void setLeftDx(int dx) 
    {
        this.leftDx = dx;
    }
    public int getRightDx() 
    {
        return rightDx;
    }

    public void setRightDx(int dx) 
    {
        this.rightDx = dx;
    }
    
    public int getX()
    {
        return this.x;
    }

}