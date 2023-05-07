/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package brickbreaker;
import java.util.*;




public class LevelLayout 
{
    Brick b;
    static int[][] grid = new int[9][9];
    static int layout;
    private ArrayList < GameObject > bricksList = new ArrayList < > ();
    protected int changeX = 100;
    protected int changeY = 100;
    private GameObject brick;
    private FactoryCreater factoryCreater = new FactoryCreater();

    private AbstractFactory brickFactory;
    private int brickCount = 0;
    static int levelCount = 0;
    public boolean[] lockedLevels = new boolean[levelCount + 1];


    public static int[][] createGrid() // Randomly creates a grid for brick positions
    {

        layout = (int)((Math.random() * 2) + 1);

        double a;
        
        if (layout == 1) {
            for (int i = 0; i < 9; i++) 
            {
                a = Math.random();
                for (int j = 0; j < 9; j++) 
                {
                    if (a >= 0.25) {
                        grid[j][i] = 1;
                    } else {
                        grid[j][i] = 0;
                    }
                }
            }
        }

        if (layout == 2) 
        {
            for (int i = 0; i < 9; i++)
            {
                a = Math.random();
                for (int j = 0; j < 9; j++)
                {
                    if (a >= 0.2) {
                        grid[i][j] = 1;
                    } else {
                        grid[i][j] = 0;
                    }

                }
            }
        }
        return grid;

    }

    public void UpdateLevel(int[][] grid) // sets bricks in the grid
    {

        brickFactory = factoryCreater.createFactory("BrickFactory");
        bricksList.clear();
        levelCount++;
        Random r = new Random();
        for (int i = 0; i < 9; i++) 
        {
            int n = r.nextInt(9) + 1;

            for (int j = 0; j < 9; j++) 
            {


                if (grid[i][j] == 1)
                {
                    int n1 = r.nextInt(4);
                    if (n1 == 0) 
                    {
                        brick = brickFactory.createObject("onehitBrick");
                    }
                    if (n1 == 1) 
                    {
                        brick = brickFactory.createObject("threehitBrick");

                    }

                    if ((n1 == 2 && i % 3 == 0) || (levelCount > 5 && r.nextDouble() > 0.87))
                    {
                        brick = brickFactory.createObject("unremoveBrick");

                    }
                    else
                    {
                        brick = brickFactory.createObject("twohitBrick");
                    }


                    brick.moveTo(changeX, changeY);
                    brick.path = "src/sprites/" + n + ".jpg";
                    ((Brick) brick).duplicate();

                    brick.imageNumber = n;
                    bricksList.add(brick);
                    brickCount++;
                }
                changeX += 96;
            }

            changeX = 100;
            changeY += 32;
        }


    }


    public int getBrickCount() // returns the number of bricks produced
    {
        return brickCount;
    }

    public ArrayList < GameObject > getBricks() // returns array of bricks stored
    {
        return bricksList;
    }


}