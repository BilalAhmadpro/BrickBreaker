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

import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Paddle extends GameObject  
{

    /**
     * @return the img
     */
    public Image[] getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(Image[] img) {
        this.img = img;
    }

    /**
     * @return the count
     */
    public long getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(long count) {
        this.count = count;
    }

    /**
     * @return the changeX
     */
    public int getChangeX() {
        return changeX;
    }

    /**
     * @param changeX the changeX to set
     */
    public void setChangeX(int changeX) {
        this.changeX = changeX;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the midpt
     */
    public int getMidpt() {
        return midpt;
    }

    /**
     * @param midpt the midpt to set
     */
    public void setMidpt(int midpt) {
        this.midpt = midpt;
    }

    /**
     * @return the list
     */
    public ArrayList < GameObject > getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList < GameObject > list) {
        this.list = list;
    }

    /**
     * @return the flag
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    /**
     * @return the path1
     */
    public String getPath1() {
        return path1;
    }

    /**
     * @param path1 the path1 to set
     */
    public void setPath1(String path1) {
        this.path1 = path1;
    }

    /**
     * @return the sizeChange
     */
    public boolean isSizeChange() {
        return sizeChange;
    }

    /**
     * @param sizeChange the sizeChange to set
     */
    public void setSizeChange(boolean sizeChange) {
        this.sizeChange = sizeChange;
    }

    /**
     * @return the powerupCounter
     */
    public long getPowerupCounter() {
        return powerupCounter;
    }

    /**
     * @param powerupCounter the powerupCounter to set
     */
    public void setPowerupCounter(long powerupCounter) {
        this.powerupCounter = powerupCounter;
    }
    private Image[] img;
    private long count;
    private int changeX = 10;
    private int type = 0;
    private int midpt;
    private ArrayList < GameObject > list = new ArrayList < > ();
    private boolean flag = false;
    private String path1 = "-Breakout-Tiles.png";
    private boolean sizeChange;
    private long powerupCounter;


    public int getChangex() 
    {
        return getChangeX();
    }

    public void setChangex(int changex)
    {
        this.setChangeX(changex);
    }



    Paddle(int x, int y, String path) // creates the paddle 
    {
        super(x, y, path);
        img = new Image[3];
        count = 0;


        for (int i = 50; i < 53; i++)
        {

            ImageIcon imageIcon = new ImageIcon(path + i + getPath1());
            img[i - 50] = imageIcon.getImage();
        }

        this.w = img[0].getWidth(null);
        this.h = img[0].getHeight(null);
    }
    Paddle(int x, int y, String path, int type)
    {
        super(x, y, path);
        this.type = type;
        if (this.type == 1)
        {

            img = new Image[3];
            count = 0;


            for (int i = 62; i < 65; i++)
            {

                ImageIcon imageIcon = new ImageIcon(path + i + "-Breakout-Tiles.png");
                img[i - 62] = imageIcon.getImage();
            }

            this.w = img[0].getWidth(null);
            this.h = img[0].getHeight(null);
        } else if (this.type == 2)
        {
            img = new Image[3];
            count = 0;


            for (int i = 65; i < 68; i++)
            {

                ImageIcon imageIcon = new ImageIcon(path + i + "-Breakout-Tiles.png");
                img[i - 65] = imageIcon.getImage();
            }

            this.w = img[0].getWidth(null);
            this.h = img[0].getHeight(null);
        }


    }
    public void duplicate() // changes the paddle according to powerups
    {
        for (int i = 50; i < 53; i++) 
        {

            ImageIcon imageIcon = new ImageIcon("src/sprites/" + i + "-Breakout-Tiles.png");
            getImg()[i - 50] = imageIcon.getImage();
        }

        this.w = getImg()[0].getWidth(null);
        this.h = getImg()[0].getHeight(null);
    }

    @Override
    public void move()
    {


        this.x += dx;
        this.h += dy;

    }
    public void givelist(ArrayList arr) 
    {
        setList((ArrayList<GameObject>) arr);
    }

    @Override
    public Rectangle getBounds() 
    {
        return new Rectangle(x - w / 2, y - 17, w, h);
    }
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();


        if (key == KeyEvent.VK_LEFT) 
        {
            
            dx = -getChangex();


        }

        if (key == KeyEvent.VK_RIGHT) 
        {
            
            dx = getChangex();
        }

        if (key == KeyEvent.VK_UP)
        {
            

        }

        if (key == KeyEvent.VK_DOWN) 
        {
            

        }

        if (key == KeyEvent.VK_SPACE)
        {
            
            Fire();
        }
    }
    
    public void Fire()
    {

        if (isFlag()) 
        {
            Bullet bullet = new Bullet(x, y, "src/sprites/61-Breakout-Tiles.png");
            getList().add(bullet);
        } 
        else
        {
            System.out.println("No powerup.");
        }


    }

    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT)
        {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) 
        {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) 
        {

        }

        if (key == KeyEvent.VK_DOWN)
        {

        }
    }

    @Override
    public void paintComponent(Graphics2D g) 
    {
        int i = (int)(getCount() % 3);

        g.drawImage(getImg()[i], x - getImg()[i].getWidth(null) / 2, y - getImg()[i].getHeight(null) / 2, null);
        g.setColor(new Color(255, 0, 0));
        setCount(getCount() + 1);

    }

    public void IncreaseSize() 
    {
        setSizeChange(true);
        setPowerupCounter(0);

        for (int i = 150; i < 153; i++) 
        {

    
            ImageIcon imageIcon = new ImageIcon("src/sprites/" + i + getPath1());
            getImg()[i - 150] = imageIcon.getImage();
        }

        this.w = getImg()[0].getWidth(null);
        this.h = getImg()[0].getHeight(null);

    }

    public void DecreaseSize() 
    {
        setSizeChange(true);
        setPowerupCounter(0);

        for (int i = 100; i < 103; i++) 
        {

            ImageIcon imageIcon = new ImageIcon("src/sprites/" + i + getPath1());
            getImg()[i - 100] = imageIcon.getImage();
        }

        this.w = getImg()[0].getWidth(null);
        this.h = getImg()[0].getHeight(null);
    }

    public void NormalSize()
    {
        setSizeChange(false);

        for (int i = 50; i < 53; i++)
        {

            ImageIcon imageIcon = new ImageIcon("src/sprites/" + i + getPath1());
            getImg()[i - 50] = imageIcon.getImage();
        }

        this.w = getImg()[0].getWidth(null);
        this.h = getImg()[0].getHeight(null);
    }

    public void PowerupTimer() 
    {

        if (getPowerupCounter() >= 1000 && isSizeChange()) 
        {
            NormalSize();
        } 
        else 
        {
            setPowerupCounter(getPowerupCounter() + 1);
        }
    }

}