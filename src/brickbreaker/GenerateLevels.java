/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class GenerateLevels
{
    private static LevelLayout layout = new LevelLayout();

    public static int[][] getLevel(int count) //checks if level file exists and creates level
    {
        File file = new File("Level" + (count) + ".txt");
        int[][] bgrid = new int[9][9];

        if (!(file.exists()))
        {
            try {

                bgrid = layout.createGrid();
                FileWriter onfile = new FileWriter(file);
                if (file.canWrite()) {
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            onfile.write(bgrid[i][j] + "\n");
                        }
                    }
                    onfile.close();


                }
            } 
            catch (IOException e) 
            {
                System.out.print("Error, Can't write on file");
            }

        } else {
            System.out.println("\nOutput available in file: " + file.getAbsolutePath());
            System.out.println("File already exist in my laptop(pc)");
            bgrid = ReadLevel(file);

        }

        return bgrid;

    }

    public static int[][] ReadLevel(File file) // reads level from the file
    {
        File f = file;
        int[][] grid = new int[9][9];

        Scanner readlevel;
        try {
            readlevel = new Scanner(file);
            while (readlevel.hasNextLine())
            {
                for (int i = 0; i < grid.length; i++) 
                {
                    String gridstring = readlevel.nextLine();
                    for (int j = 0; j < grid[0].length; j++)
                    {
                        grid[j][i] = Integer.parseInt(gridstring);
                    }

                }
            }

        } 
        catch (FileNotFoundException e)
        {
            //	e.printStackTrace();}
        }

        return grid;
    }

    public static LevelLayout getLayout() {
        return layout;
    }

    public static void setLayout(LevelLayout aLayout) {
        layout = aLayout;
    }
}
