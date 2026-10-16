import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

// Starter Code for TextEditorApp
// chales 10/2025
//
public class FindAndReplace {
    private JFrame frame;
    private JTextField smallTextRegion;
    private JTextArea textArea;

    public FindAndReplace() {
        textArea = new JTextArea(); //makes the area where airports are shown
        textArea.setEditable(false);

        frame = new JFrame("Find and Replace Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel(new BorderLayout()); //this adds the panel on the bottom with buttons
        // uncomment the two lines bellow and comment the third line to have textarea scroll
        JScrollPane scrollPane = new JScrollPane(textArea); //this makes the airport area scrollable
        panel.add(scrollPane, BorderLayout.CENTER);
        //panel.add(scrollPane, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout());
        smallTextRegion = new JTextField(20);

        //make buttons
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        JButton findAirport = new JButton("Find Airport");
        JLabel instructionLabel = new JLabel("Type city in text box");

        //this made buttons on screen
        controlPanel.add(smallTextRegion);
        controlPanel.add(submitButton);
        controlPanel.add(resetButton);
        controlPanel.add(findAirport);
        controlPanel.add(instructionLabel);

        submitButton.setActionCommand(" ");
        resetButton.setActionCommand(" ");
        findAirport.setActionCommand("Find Airport");



    }

    private class ButtonCLickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
        }
    }
     submitButton.addActionListener(new ButtonClickListener);
        findAirport.addActionListener(new ButtonClickListener);

    public static void main(String[] args) {
        FindAndReplace app = new FindAndReplace();
    }
}