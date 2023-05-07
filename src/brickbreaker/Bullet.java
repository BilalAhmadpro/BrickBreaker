/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import java.awt.Rectangle;


public class Bullet extends GameObject 
{

    public Bullet(int x, int y, String path) //creates bullet for fire powerup
    {
        super(x, y, path);

    }
    public Rectangle getBounds()
    {
        return new Rectangle(x - w / 2, y - 15, w, h);
    }
    public void move() //moves bullet
    {
        moveTo(x, y - 20);
    }
}