package main;

import javax.swing.*;
import java.awt.*;

public class Game {

//    creates window
    JFrame window;
    Container container;
//    Create Title Screen, button
    JPanel titleScreenPanel, startButtonPanel;
//    Creates the text to display
    JLabel titleScreenLabel;
//    Creates a custom font called titleFont
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 80);
    Font buttonFont= new Font("Times New Roman", Font.PLAIN, 30);
//    Creates Button
    JButton startButton;


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

        container = window.getContentPane();

//        Creates the New panel (Title Screen)
        titleScreenPanel = new JPanel();
//        Creates a Space for the text( these are the dimension of this space)
        titleScreenPanel.setBounds(100,100,600,150);
//        Sets the background colour of the new panel
        titleScreenPanel.setBackground(Color.black);
//        This Creates the new label
        titleScreenLabel = new JLabel("CODEBREAKER");
//        Sets colour for the text
        titleScreenLabel.setForeground(Color.yellow);
//       sets font to custom font that was created
        titleScreenLabel.setFont(titleFont);



//        creates new Button panel
        startButtonPanel = new JPanel();
//        Creates a space for button
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.black);

//Creates new Button
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(buttonFont);


        //        add button to panel

        startButtonPanel.add(startButton);
        titleScreenPanel.add(titleScreenLabel);





//        this is adding the panel to the container (the container is almost like a base)
        container.add(titleScreenPanel);
        container.add(startButtonPanel);




//        Makes the window appear to the user
        window.setVisible(true);
    }
}
