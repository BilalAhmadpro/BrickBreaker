package brickbreaker;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Application extends JFrame
{

    private JLabel l1;

    public Application() 
    {

        initUI();
    }
    public Application(Board b) 
    {

        setSize(1024, 768);
        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("src/BACKGROUND23.jpg")));
        setLayout(new FlowLayout());
        add(b);
        l1 = new JLabel("");

        add(l1);

    }

    private void initUI() 
    {
        setSize(1024, 768);
        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("src/BACKGROUND23.jpg")));
        setLayout(new FlowLayout());
        add(new Board());
        l1 = new JLabel("");

        add(l1);

    }

    
}