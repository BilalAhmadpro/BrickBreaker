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


public class Movingball extends GameObject 
{

    public boolean flag = false;
    public int yDir = -8;
    public int counter = 0;
    public int xDir = 0;
    public boolean fireBallCheck = false;

    Movingball(int x, int y, String path) // creates the ball
    {
        super(x, y, path);
    }

    @Override
    public Rectangle getBounds()
    {
        return new Rectangle(x - w / 2, y - 15, w, h);
    }

    void setXDir(int x) 
    {
        xDir = x;
    }

    int getYDir() 
    {
        return yDir;
    }

    void setYDir(int y) 
    {
        yDir = y;
    }

    public void keyPressed(KeyEvent e) // to move the ball initially
    {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) 
        {
            flag = true;
        }


    }

    public void move() //moves the ball in the board
    {
        if (flag)
        {
            this.y += yDir;
            this.x += xDir;
        }

    }



    public void keyReleased(KeyEvent e) 
    {
        int key = e.getKeyCode();


    }
}