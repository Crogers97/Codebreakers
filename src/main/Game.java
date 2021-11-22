package main;

import javax.swing.*;
import java.awt.*;

public class Game {

//    creates window
    JFrame window;

    public static void main(String[] args){

        new Game();
    }
    public Game(){

        window= new JFrame();
//        sets window size
        window.setSize(800, 600);
//        Allows you to close window X on top right
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        This sets the colour of the window that has been Created
        window.getContentPane().setBackground(Color.black);
//        Jframe has a default layout this allows you to make a custom layout
        window.setLayout(null);
//        Makes the window appear to the user
        window.setVisible(true);


    }
}
