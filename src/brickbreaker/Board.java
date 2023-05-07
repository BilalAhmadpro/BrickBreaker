/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import javafx.scene.media.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;



public class Board extends JPanel implements ActionListener, Serializable
{

    /**
     * @return the w
     */
    public int getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(int w) {
        this.w = w;
    }

    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     * @return the timer
     */
    public Timer getTimer() {
        return timer;
    }

    /**
     * @param timer the timer to set
     */
    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    /**
     * @return the DELAY
     */
    public int getDELAY() {
        return DELAY;
    }

    /**
     * @param DELAY the DELAY to set
     */
    public void setDELAY(int DELAY) {
        this.DELAY = DELAY;
    }

    /**
     * @return the l
     */
    public Lives getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(Lives l) {
        this.l = l;
    }

    /**
     * @return the score
     */
    public long getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(long score) {
        this.score = score;
    }

    /**
     * @return the lives
     */
    public int getLives() {
        return lives;
    }

    /**
     * @param lives the lives to set
     */
    public void setLives(int lives) {
        this.lives = lives;
    }

    /**
     * @return the levelNo
     */
    public int getLevelNo() {
        return levelNo;
    }

    /**
     * @param levelNo the levelNo to set
     */
    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    /**
     * @return the live
     */
    public GameObject getLive() {
        return live;
    }

    /**
     * @param live the live to set
     */
    public void setLive(GameObject live) {
        this.live = live;
    }

    /**
     * @return the gameEnds
     */
    public boolean isGameEnds() {
        return gameEnds;
    }

    /**
     * @param gameEnds the gameEnds to set
     */
    public void setGameEnds(boolean gameEnds) {
        this.gameEnds = gameEnds;
    }

    /**
     * @return the wins
     */
    public boolean isWins() {
        return wins;
    }

    /**
     * @param wins the wins to set
     */
    public void setWins(boolean wins) {
        this.wins = wins;
    }

    /**
     * @return the brick
     */
    public GameObject getBrick() {
        return brick;
    }

    /**
     * @param brick the brick to set
     */
    public void setBrick(GameObject brick) {
        this.brick = brick;
    }

    /**
     * @return the paddle
     */
    public Paddle getPaddle() {
        return paddle;
    }

    /**
     * @param paddle the paddle to set
     */
    public void setPaddle(Paddle paddle) {
        this.paddle = paddle;
    }

    /**
     * @return the ball
     */
    public Movingball getBall() {
        return ball;
    }

    /**
     * @param ball the ball to set
     */
    public void setBall(Movingball ball) {
        this.ball = ball;
    }

    /**
     * @return the ball1
     */
    public GameObject getBall1() {
        return ball1;
    }

    /**
     * @param ball1 the ball1 to set
     */
    public void setBall1(GameObject ball1) {
        this.ball1 = ball1;
    }

    /**
     * @return the ball2
     */
    public GameObject getBall2() {
        return ball2;
    }

    /**
     * @param ball2 the ball2 to set
     */
    public void setBall2(GameObject ball2) {
        this.ball2 = ball2;
    }

    /**
     * @return the movingBall
     */
    public Movingball getMovingBall() {
        return movingBall;
    }

    /**
     * @param movingBall the movingBall to set
     */
    public void setMovingBall(Movingball movingBall) {
        this.movingBall = movingBall;
    }

    /**
     * @return the movingBall1
     */
    public Movingball getMovingBall1() {
        return movingBall1;
    }

    /**
     * @param movingBall1 the movingBall1 to set
     */
    public void setMovingBall1(Movingball movingBall1) {
        this.movingBall1 = movingBall1;
    }

    /**
     * @return the movingBall2
     */
    public Movingball getMovingBall2() {
        return movingBall2;
    }

    /**
     * @param movingBall2 the movingBall2 to set
     */
    public void setMovingBall2(Movingball movingBall2) {
        this.movingBall2 = movingBall2;
    }

    /**
     * @return the gamebrick
     */
    public Brick getGamebrick() {
        return gamebrick;
    }

    /**
     * @param gamebrick the gamebrick to set
     */
    public void setGamebrick(Brick gamebrick) {
        this.gamebrick = gamebrick;
    }

    /**
     * @return the factoryCreater
     */
    public static FactoryCreater getFactoryCreater() {
        return factoryCreater;
    }

    /**
     * @param aFactoryCreater the factoryCreater to set
     */
    public static void setFactoryCreater(FactoryCreater aFactoryCreater) {
        factoryCreater = aFactoryCreater;
    }

    /**
     * @return the powerupFactory
     */
    public AbstractFactory getPowerupFactory() {
        return powerupFactory;
    }

    /**
     * @param powerupFactory the powerupFactory to set
     */
    public void setPowerupFactory(AbstractFactory powerupFactory) {
        this.powerupFactory = powerupFactory;
    }

    /**
     * @return the gameObjects
     */
    public ArrayList < GameObject > getGameObjects() {
        return gameObjects;
    }

    /**
     * @param gameObjects the gameObjects to set
     */
    public void setGameObjects(ArrayList < GameObject > gameObjects) {
        this.gameObjects = gameObjects;
    }

    /**
     * @return the fireBall
     */
    public boolean isFireBall() {
        return fireBall;
    }

    /**
     * @param fireBall the fireBall to set
     */
    public void setFireBall(boolean fireBall) {
        this.fireBall = fireBall;
    }

    /**
     * @return the bullet
     */
    public GameObject getBullet() {
        return bullet;
    }

    /**
     * @param bullet the bullet to set
     */
    public void setBullet(GameObject bullet) {
        this.bullet = bullet;
    }

    /**
     * @return the currentBall
     */
    public Movingball getCurrentBall() {
        return currentBall;
    }

    /**
     * @param currentBall the currentBall to set
     */
    public void setCurrentBall(Movingball currentBall) {
        this.currentBall = currentBall;
    }

    /**
     * @return the hitPowerUp
     */
    public boolean isHitPowerUp() {
        return hitPowerUp;
    }

    /**
     * @param hitPowerUp the hitPowerUp to set
     */
    public void setHitPowerUp(boolean hitPowerUp) {
        this.hitPowerUp = hitPowerUp;
    }

    /**
     * @return the mBall
     */
    public Movingball getmBall() {
        return mBall;
    }

    /**
     * @param mBall the mBall to set
     */
    public void setmBall(Movingball mBall) {
        this.mBall = mBall;
    }

    /**
     * @return the gameLost
     */
    public boolean isGameLost() {
        return gameLost;
    }

    /**
     * @param gameLost the gameLost to set
     */
    public void setGameLost(boolean gameLost) {
        this.gameLost = gameLost;
    }

    /**
     * @return the gamePlayer
     */
    public Player getGamePlayer() {
        return gamePlayer;
    }

    /**
     * @param gamePlayer the gamePlayer to set
     */
    public void setGamePlayer(Player gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    /**
     * @return the timer2
     */
    public Timer getTimer2() {
        return timer2;
    }

    /**
     * @param timer2 the timer2 to set
     */
    public void setTimer2(Timer timer2) {
        this.timer2 = timer2;
    }

    /**
     * @return the audioClip
     */
    public AudioClip getAudioClip() {
        return audioClip;
    }

    /**
     * @param audioClip the audioClip to set
     */
    public void setAudioClip(AudioClip audioClip) {
        this.audioClip = audioClip;
    }

    /**
     * @return the audioClip1
     */
    public AudioClip getAudioClip1() {
        return audioClip1;
    }

    /**
     * @param audioClip1 the audioClip1 to set
     */
    public void setAudioClip1(AudioClip audioClip1) {
        this.audioClip1 = audioClip1;
    }

    /**
     * @return the audioClip2
     */
    public AudioClip getAudioClip2() {
        return audioClip2;
    }

    /**
     * @param audioClip2 the audioClip2 to set
     */
    public void setAudioClip2(AudioClip audioClip2) {
        this.audioClip2 = audioClip2;
    }

    /**
     * @return the audioClip3
     */
    public AudioClip getAudioClip3() {
        return audioClip3;
    }

    /**
     * @param audioClip3 the audioClip3 to set
     */
    public void setAudioClip3(AudioClip audioClip3) {
        this.audioClip3 = audioClip3;
    }

    /**
     * @return the audioClip4
     */
    public AudioClip getAudioClip4() {
        return audioClip4;
    }

    /**
     * @param audioClip4 the audioClip4 to set
     */
    public void setAudioClip4(AudioClip audioClip4) {
        this.audioClip4 = audioClip4;
    }

    /**
     * @return the audioClip5
     */
    public AudioClip getAudioClip5() {
        return audioClip5;
    }

    /**
     * @param audioClip5 the audioClip5 to set
     */
    public void setAudioClip5(AudioClip audioClip5) {
        this.audioClip5 = audioClip5;
    }

    private int w = 1024;
    private int h = 700;
    private Timer timer;
    private int DELAY = 10;
    private Lives l;
    private long score = 0;
    private int lives = 3;
    private int levelNo = 1;
    private GameObject live;

    private boolean gameEnds;
    private boolean wins;
    private GameObject brick;
    private Paddle paddle;
    private Movingball ball;
    private GameObject ball1;
    private GameObject ball2;
    private Movingball movingBall;
    private Movingball movingBall1;
    private Movingball movingBall2;
    private Brick gamebrick;
    private static FactoryCreater factoryCreater;
    private AbstractFactory powerupFactory;

    private ArrayList < GameObject > gameObjects = new ArrayList < > ();

    private boolean fireBall = false;
    private GameObject bullet;
    private Movingball currentBall;
    private boolean hitPowerUp = false;
    private Movingball mBall;
    private boolean gameLost;
    private Player gamePlayer;

    private Timer timer2;

    private AudioClip audioClip;
    private AudioClip audioClip1;
    private AudioClip audioClip2;
    private AudioClip audioClip3;
    private AudioClip audioClip4;
    private AudioClip audioClip5;


    public Board()
    {

        final URL resource = getClass().getResource("saucer2.wav");  //all background music here
        audioClip = new AudioClip(resource.toExternalForm());
        final URL resource1 = getClass().getResource("saucer1.wav");
        audioClip1 = new AudioClip(resource1.toExternalForm());
        final URL resource2 = getClass().getResource("PowerUp.wav");
        audioClip2 = new AudioClip(resource2.toExternalForm());
        final URL resource3 = getClass().getResource("loselife.wav");
        audioClip3 = new AudioClip(resource3.toExternalForm());


        timer = new Timer(getDELAY(), this);
        timer2 = new Timer(5, this);
        initBoard();


    }
    public Board(int i)
    {
        this.levelNo = i;
        final URL resource = getClass().getResource("saucer2.wav");
        audioClip = new AudioClip(resource.toExternalForm());
        final URL resource1 = getClass().getResource("saucer1.wav");
        audioClip1 = new AudioClip(resource1.toExternalForm());
        final URL resource2 = getClass().getResource("PowerUp.wav");
        audioClip2 = new AudioClip(resource2.toExternalForm());
        final URL resource3 = getClass().getResource("loselife.wav");
        audioClip3 = new AudioClip(resource3.toExternalForm());


        timer = new Timer(getDELAY(), this);
        timer2 = new Timer(5, this);
        initBoard();
    }


    public boolean Checkfireball(boolean fireball)
    {
        if (fireball == true)
        {
            return true;
        }
        return false;
    }

    private void initBoard() //board initialized
    {

        int[][] grid = GenerateLevels.getLevel(getLevelNo());
        LevelLayout level = new LevelLayout();
        level.UpdateLevel(grid);
        ArrayList < GameObject > array = level.getBricks();

        getGameObjects().addAll(array);

        setGamePlayer(Player.getInstance());
        setPaddle(new Paddle(512, 650, "src/sprites/"));
        getGamePlayer().getPaddle(getPaddle());
        getPaddle().givelist(getGameObjects());
        setCurrentBall(new Movingball(512, 610, "src/sprites/52.png"));
        getGameObjects().add(getCurrentBall());
        setLive(new Lives(20, 15, "src/Sprites/lifee.png"));

        setFactoryCreater(new FactoryCreater());
        setPowerupFactory(getFactoryCreater().createFactory("PowerupFactory"));



        addKeyListener(new TAdapter());
        setFocusable(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setPreferredSize(new Dimension(getW(), getH()));
        getTimer().start();

    }




    @Override
    public void paintComponent(Graphics g)  
    {


        Graphics2D g2d = (Graphics2D) g;

        if (isGameLost()) //Lost screen is painted here
        {
            getTimer().stop();
            Lost lossscreen = new Lost();
            lossscreen.show();
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.dispose();
        }
        else //all text interface during the level's code is here  
        {


            g.clearRect(0, 0, getW(), getH());
            ImageIcon img2 = new ImageIcon("src/BACKGROUND2.jpg");
            g.drawImage(img2.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);

            Font small = new Font("Helvetica", Font.BOLD, 15);
            FontMetrics fm = getFontMetrics(small);

            g.setFont(small);
            getPaddle().paintComponent(g2d);
            getLive().paintComponent(g2d);

            String livesleft = "" + getLives();
            String curr_score = "" + getScore();
            g.setColor(Color.YELLOW);
            g.drawString("A Game You'll never  forget To Play ", 400, 20);
            g.drawString("LEVEL " + getLevelNo(), 500, 40);
            g.setColor(Color.ORANGE);
            g.drawString("Total Score : " + curr_score, 850, 20);
            g.drawString(livesleft, getLive().x + getLive().w, 20);
            Dimension size = getSize();
            setW((int) size.getWidth());
            setH((int) size.getHeight());



            for (int i = 0; i < getGameObjects().size(); i++) 
            {
                getGameObjects().get(i).paintComponent(g2d);
            }
        }
    }









    @Override
    public void actionPerformed(ActionEvent ae) //this function calls everyfunction after a every timer is called.
    {

        movethelist();
        action();
        powerupcreate();
        movetheball();
        gamewin();
        paddlemove();
        bulletbrick();
        paddleandball();
        ballandbrick();
        chekList();
        getPaddle().PowerupTimer();
        unbreakableCheck();
        moveBricks();


    }



    public void chekList() //Checks bricks count
    {
        int count = 0;
        for (int i = 0; i < getGameObjects().size(); i++)
        {
            if (getGameObjects().get(i) instanceof Brick)
            {
                count++;
            }
        }
        if (count == 0) 
        {
            getTimer().stop();
            NextLevel cs = new NextLevel(getLevelNo());
            cs.show();


            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.dispose();
        }
    }



    public void movethelist() //move the objects created.

    {
        for (int i = 0; i < getGameObjects().size(); i++) 
        {
            GameObject b = getGameObjects().get(i);
            if (b instanceof PowerUp || b instanceof Bullet) 
            {
                b.move();
            }
            else if(b instanceof Brick)
            {
                b.move();
            }
        }
    }
    public void paddleandball() //collision detection between paddle and ball
    {

        for (int i = 0; i < getGameObjects().size(); i++) 
        {

            if (getGameObjects().get(i) instanceof Movingball)
            {
                Movingball l = (Movingball) getGameObjects().get(i);

                if (l.getBounds().intersects(getPaddle().getBounds())) 
                {

                    

                    int paddleLPos = (int) getPaddle().getBounds().getMinX();
                    int ballLPos = (int) l.getBounds().getMinX();
                    int first = paddleLPos + 8;
                    int second = paddleLPos + 16;
                    int third = paddleLPos + 24;
                    int fourth = paddleLPos + 32;
                    if (ballLPos < first)
                    {
                        l.setXDir(-1);
                        l.setYDir(-8);
                    }
                    if (ballLPos >= first && ballLPos < second)
                    {
                        l.setXDir(-1);
                        l.setYDir(-1 * l.getYDir());
                    }
                    if (ballLPos >= second && ballLPos < third) 
                    {
                        l.setXDir(0);
                        l.setYDir(-8);
                    }
                    if (ballLPos >= third && ballLPos < fourth)
                    {
                        l.setXDir(1);
                        l.setYDir(-1 * l.getYDir());
                    }
                    if (ballLPos > fourth)
                    {
                        l.setXDir(1);
                        l.setYDir(-8);
                    }
                }


                if (l.y < 20) 
                {

                    l.yDir *= -1;
                }

                if (l.y > 650) 
                {
                    getAudioClip3().play();
                    getPaddle().setFlag(false);

                    setHitPowerUp(false);
                    int counter = 0;
                    for (int m = 0; m < getGameObjects().size(); m++)
                    {
                        if (getGameObjects().get(m) instanceof Movingball)
                        {
                            counter++;
                        }
                    }
                    System.out.println("Count : " + counter);
                    Reset(l);
                    if (counter == 1)
                    {
                        setLives(getLives() - 1);
                        if (getLives() == 0) 
                        {
                            setGameLost(true);
                        }

                    }
                    getPaddle().setChangex(10);

                }

                if ((l.x + l.w / 2 + 10 > 1023 || l.x - l.w / 2 < 0)) 
                {
                    if (l.x > 1024)
                    {
                        l.x = 900;
                    }
                    if (l.x < 0)
                    {
                        l.x = 100;
                    }
                    System.out.println("reverseit");
                    l.xDir *= -1;
                }
            }
        }
    }

    public void bulletbrick() //collision detection between bullet and brick
    {
        for (int i = 0; i < getGameObjects().size(); i++)
        {
            if (getGameObjects().get(i) instanceof Bullet) 
            {
                setBullet((Bullet) getGameObjects().get(i));

                for (int j = 0; j < getGameObjects().size(); j++)
                {

                    if (getGameObjects().get(j) instanceof Brick) 
                    {
                        setGamebrick((Brick) getGameObjects().get(j));
                        if (getBullet().getBounds().intersects(getGamebrick().getBounds())) 
                        {
                            getAudioClip1().play();
                            getGameObjects().remove(getBullet());
                            getGameObjects().remove(getGamebrick());
                        }
                    }
                }
            }
        }
    }
    
    public void paddlemove() // to move the paddle
    {
        if (!(paddle.x + paddle.dx + 50 > 1000) && !(paddle.x + paddle.dx - 50 < 20)) {
            getPaddle().move();
        }
    }
    public void gamewin() //check if game is won
    {

        if (getGameObjects().isEmpty()) 
        {
            setGameEnds(true);
            setWins(true);
        }

    }
    
    public void movetheball()  //to move the ball
    {
        for (int i = 0; i < getGameObjects().size(); i++)
        {
            if (getGameObjects().get(i) instanceof Movingball) 
            {
                setMovingBall((Movingball) getGameObjects().get(i));
                if (!movingBall.flag) {
                    if (!(movingBall.x + movingBall.dx + movingBall.w + 35 > 1024) || !(movingBall.x + movingBall.dx - 60 < 10))
                    {
                        getMovingBall().move();
                    }
                }
                else
                {
                    getMovingBall().move();
                }
            }

        }
    }


    public void powerupcreate() //powerup creation
    {

        for (int i = 0; i < getGameObjects().size(); i++)
        {
            GameObject temp = getGameObjects().get(i);

            if (temp.getBounds().intersects(getPaddle().getBounds()) && temp instanceof DecreaseSpeedPowerup) 
            {
                getPaddle().setChangex(3);
                getGameObjects().remove(temp);

            }
            else if (temp.getBounds().intersects(getPaddle().getBounds()) && temp instanceof IncreaseSpeedPowerup)
            {
                getPaddle().setChangex(20);
                getGameObjects().remove(temp);

            }
            else if (temp.getBounds().intersects(getPaddle().getBounds()) && temp instanceof DecreaseSizePowerup)
            {
                getPaddle().DecreaseSize();
                getGameObjects().remove(temp);

            } 
            else if (temp.getBounds().intersects(getPaddle().getBounds()) && temp instanceof IncreaseSizePowerup) 
            {
                getPaddle().IncreaseSize();
                getGameObjects().remove(temp);

            } 
            else if (temp.getBounds().intersects(getPaddle().getBounds()) && temp instanceof FireballPowerup) 
            {

                for (int k = 0; k < getGameObjects().size(); k++)
                {
                    if (getGameObjects().get(k) instanceof Movingball) 
                    {

                        Movingball b = (Movingball) getGameObjects().get(k);
                        b.path = "src/sprites/100.png";
                        b.duplicate();
                        b.fireBallCheck = true;

                    }
                }

                getGameObjects().remove(temp);

            } else if (temp.getBounds().intersects(getPaddle().getBounds()) && temp instanceof MultiballPowerup)
            {

                getGameObjects().remove(temp);
                setBall1(new Movingball(getBall().x - 5, getBall().y, "src/sprites/52.png"));
                setMovingBall1((Movingball) getBall1());
                movingBall1.flag = true;

                getGameObjects().add(getMovingBall1());


                setBall2(new Movingball(getBall().x, getBall().y + 30, "src/sprites/52.png"));
                setMovingBall2((Movingball) getBall2());
                movingBall2.flag = true;
                getGameObjects().add(getMovingBall2());



            }
            else if (temp.getBounds().intersects(getPaddle().getBounds()) && temp instanceof ExtraLifePowerup)
            {
                if (getLives() < 3) 
                {
                    setLives(getLives() + 1);
                }
                getGameObjects().remove(temp);

            } 
            else if (temp.getBounds().intersects(getPaddle().getBounds()) && temp instanceof PaddlefirePowerup)
            {

                getPaddle().setFlag(true);
                setHitPowerUp(true);
                getGameObjects().remove(temp);

            }



        }
    }


    public void ballandbrick() //collision detection ball and brick
    {


        for (int i = 0; i < getGameObjects().size(); i++)
        {
            if (getGameObjects().get(i) instanceof Movingball) 
            {
                setBall((Movingball) getGameObjects().get(i));
                for (int j = 0; j < getGameObjects().size(); j++)
                {
                    if (getGameObjects().get(j) instanceof Brick) 
                    {
                        if (getBall().getBounds().intersects(getGameObjects().get(j).getBounds()))
                        {

                            getAudioClip1().play();
                            setGamebrick((Brick) getGameObjects().get(j));
                            gamebrick.path = "src/sprites/b" + getGameObjects().get(j).imageNumber + ".jpg";
                            getGamebrick().duplicate();
                            if (getBall().fireBallCheck)
                            {
                                getGameObjects().remove(getGameObjects().get(j));
                                setScore(getScore() + 200);

                            } 
                            else
                            {
                                if (getGamebrick().y < getBall().y) 
                                {
                                    if (getBall().yDir < 0) 
                                    {
                                        ball.yDir *= -1;
                                    }
                                }
                                else 
                                {
                                    if (getBall().yDir > 0)
                                    {
                                        ball.yDir *= -1;

                                    }
                                }

                                if (getGameObjects().get(j).count1 == getGameObjects().get(j).count2 && !(gameObjects.get(j) instanceof UnBreakableBrick)) 
                                {
                                    getGameObjects().remove(getGameObjects().get(j));
                                    setScore(getScore() + 100);
                                } 
                                else
                                {
                                    gameObjects.get(j).count2++;
                                }
                            }




                            if (Math.random() >= 0.8) 
                            {
                                double x = Math.random();
                                GameObject powerup;

                                if (x >= 5.0 / 9 && x < 6.0 / 9) 
                                {
                                    powerup = getPowerupFactory().createObject("IncreaseSizePowerup");
                                }
                                else if (x >= 1.0 / 9 && x < 2.0 / 9) 
                                {
                                    powerup = getPowerupFactory().createObject("DecreaseSizePowerup");
                                } 
                                else if (x >= 2.0 / 9 && x < 3.0 / 9)
                                {
                                    powerup = getPowerupFactory().createObject("IncreaseSpeedPowerup");
                                }
                                else if (x >= 3.0 / 9 && x < 4.0 / 9)
                                {
                                    powerup = getPowerupFactory().createObject("DecreaseSpeedPowerup");
                                }
                                else if (x >= 4.0 / 9 && x < 5.0 / 9)
                                {
                                    powerup = getPowerupFactory().createObject("ExtraLifePowerup");
                                }
                                else if (x >= 6.0 / 9 && x < 7.0 / 9)
                                {
                                    powerup = getPowerupFactory().createObject("MultiballPowerup");
                                }
                                else if (x >= 8.0 / 9 && x < 9.0 / 9)
                                {
                                    powerup = getPowerupFactory().createObject("PaddlefirePowerup");
                                } 
                                else
                                {

                                    powerup = getPowerupFactory().createObject("FireballPowerup");
                                }

                                powerup.moveTo(getGamebrick().getX(), getGamebrick().getY() + getGamebrick().h);
                                getGameObjects().add(powerup);
                            }
                        }

                    }

                }
            }
        }
    }

    public void action()
    {
        repaint();
    }

    public void Reset(Movingball b) //reset the balls movement and powerups after losing life
    {

        int count = 0;
        for (int i = 0; i < getGameObjects().size(); i++) 
        {
            if (getGameObjects().get(i) instanceof Movingball)
            {
                Movingball mb = (Movingball) getGameObjects().get(i);
                mb.path = "src/sprites/52.png";
                mb.duplicate();
                mb.fireBallCheck = false;

                count++;
            }
        }
        if (count > 1) 
        {
            getGameObjects().remove(b);

        }
        else 
        {
            paddle.x = 512;
            paddle.y = 650;

            b.x = 512;
            b.y = 610;
            b.flag = false;
            b.path = "src/sprites/52.png";
            b.fireBallCheck = false;
            b.duplicate();
            b.xDir = 0;
            b.yDir = -8;
            setCurrentBall(b);
        }


    }
    public void dispose() 
    {
        JFrame parent = (JFrame) this.getTopLevelAncestor();
        parent.dispose();

    }

    private class TAdapter extends KeyAdapter 
    {

        @Override
        public void keyReleased(KeyEvent e) 
        {
            getGamePlayer().keyReleased(e);
            getCurrentBall().keyReleased(e);

        }

        @Override
        public void keyPressed(KeyEvent e)
        {
            getGamePlayer().keyPressed(e);
            getCurrentBall().keyPressed(e);
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) 
            {
                
                
                Menu temp = new Menu(getBoard());
                pauseGame();
                temp.show();
                
            }
        }
    }

    public void unbreakableCheck() //if only unbreakable bricks left ball turns into fireball
    {
        boolean checker = true;

        for (int i = 0; i < getGameObjects().size(); i++) 
        {
            if (getGameObjects().get(i) instanceof Brick)
            {
                if (getGameObjects().get(i) instanceof UnBreakableBrick)
                {
                    checker = checker && true;
                } else {
                    checker = checker && false;
                }
            }
        }

        if (checker == true)
        {

            for (int k = 0; k < getGameObjects().size(); k++)
            {
                if (getGameObjects().get(k) instanceof Movingball)
                {

                    Movingball b = (Movingball) getGameObjects().get(k);
                    b.path = "src/sprites/100.png";
                    b.duplicate();
                    b.fireBallCheck = true;

                }
            }
        }
    }
    
    public void moveBricks() //moving bricks variant
    {
        for(int i =0; i<getGameObjects().size(); i++)
        {
            if(getGameObjects().get(i) instanceof Brick)
            {
                GameObject brickTemp = getGameObjects().get(i);
                
                if(brickTemp.getX()<=100)
                {
                    brickTemp.setDx(2);
                    System.out.println("coming here2");
                }
                else if(brickTemp.getX()>=900)
                {
                    brickTemp.setDx(-2);
                    System.out.println("coming here3");
                }
                    
                
            }
        }
    }
    
    public void pauseGame()
    {
        getTimer().stop();
        this.setVisible(false);
    }
    
    public void resumeGame()
    {
        getTimer().start();
        this.setVisible(true);
    }
    
    public Board getBoard()
    {
        return this;
    }
}