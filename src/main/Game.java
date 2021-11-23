package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

//    creates window
    JFrame window;
    Container container;
//    Create Title Screen, button
    JPanel titleScreenPanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerAtrributesPanel;
//    Creates the text to display
    JLabel titleScreenLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelType;
//    Creates a custom font called titleFont
    Font titleFont = new Font("manaspace", Font.PLAIN, 60);
    Font buttonFont= new Font("Karmatic Arcade", Font.PLAIN, 30);
    Font choiceButtonFont = new Font("yoster island",Font.PLAIN, 30);
    Font textFont = new Font("manaspace", Font.PLAIN,30);
    Font attributesFont = new Font("Orange Kid", Font.PLAIN,30);
//    Creates Button
    JButton startButton, choice1, choice2, choice3, choice4;
//Create text area
    JTextArea mainTextArea;

    TitleScreenHandler titleScreenHandler = new TitleScreenHandler();




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
        startButton.setBorder(null);
        startButton.setFont(buttonFont);
//        function for button- listens for action(when you click start button, button recognises click and calls titleScreenHandler
        startButton.addActionListener(titleScreenHandler);


        //        add button to panel

        startButtonPanel.add(startButton);
        titleScreenPanel.add(titleScreenLabel);





//        this is adding the panel to the container (the container is almost like a base)
        container.add(titleScreenPanel);
        container.add(startButtonPanel);




//        Makes the window appear to the user
        window.setVisible(true);
    }


//Creating Text
    public void createGameScreen(){
//when createGameScreen is called titleScreenPanel and startButtonPanel will be "disabled"(hide away)
     titleScreenPanel.setVisible(false);
     startButtonPanel.setVisible(false);



        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        container.add(mainTextPanel);

        mainTextArea = new JTextArea("Choose your character");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(textFont);


//        Text will wrap automatically without this the text will keep going to the right
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);



        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.black);
//        this sets a custom grid layout (4: vertical, horizontal:1
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        container.add(choiceButtonPanel);

//        choice1 Button
        choice1 = new JButton("Calum");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(choiceButtonFont);
        choiceButtonPanel.add(choice1);

//      choice2 Button
        choice2 = new JButton("Tony");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(choiceButtonFont);
        choiceButtonPanel.add(choice2);
//      choice3 button
        choice3 = new JButton("Will");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(choiceButtonFont);
        choiceButtonPanel.add(choice3);
//      choice4 button
        choice4 = new JButton("Lewis");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(choiceButtonFont);
        choiceButtonPanel.add(choice4);


//        Player Attributes

        playerAtrributesPanel = new JPanel();
        playerAtrributesPanel.setBounds(100, 15,600, 50);
        playerAtrributesPanel.setBackground(Color.black);
        playerAtrributesPanel.setLayout(new GridLayout(1, 2));
        container.add(playerAtrributesPanel);

//        hp
        hpLabel = new JLabel("HP:");
        hpLabel.setFont(attributesFont);
        hpLabel.setForeground(Color.white);
        playerAtrributesPanel.add(hpLabel);

//      hp number
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(attributesFont);
        hpLabelNumber.setForeground(Color.white);
        playerAtrributesPanel.add(hpLabelNumber);

//        weapon
        weaponLabel = new JLabel("Weapon");
        weaponLabel.setFont(attributesFont);
        weaponLabel.setForeground(Color.white);
        playerAtrributesPanel.add(weaponLabel);

//        Weapon type]
        weaponLabelType = new JLabel();
        weaponLabelType.setFont(attributesFont);
        weaponLabelType.setForeground(Color.white);
        playerAtrributesPanel.add(weaponLabelType);





    }


//    button function - the function wil lbe called on when button is clicked

    public class TitleScreenHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event) {

       createGameScreen();

    }
}
}
