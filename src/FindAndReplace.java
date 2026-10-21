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
    private JFrame frame; // mainframe
    private JTextField smallTextRegion; //the typable area
    private JTextArea textArea; // the area that displays the airport and city

    public FindAndReplace() {
        frame = new JFrame("Find and Replace Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        textArea = new JTextArea(); //makes the area where airports are shown


        JPanel panel = new JPanel(new BorderLayout()); //this adds the panel on the bottom with buttons
        // uncomment the two lines bellow and comment the third line to have textarea scroll
        JScrollPane scrollPane = new JScrollPane(textArea); //this makes the airport area scrollable
        panel.add(scrollPane, BorderLayout.CENTER);
        //panel.add(scrollPane, BorderLayout.CENTER);


        JPanel controlPanel = new JPanel(new FlowLayout());
        frame.add(panel, BorderLayout.CENTER); // add the panel with text area to frame
        frame.add(controlPanel, BorderLayout.SOUTH); // add the typable region panel to the frame

        smallTextRegion = new JTextField(20);




        //make buttons
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        JButton findAirport = new JButton("Find Airport");
        JLabel instructionLabel = new JLabel("Type city in text box");

        //this made buttons on screen and adds the action listener on the buttons that are waiting for a command
        controlPanel.add(smallTextRegion);
        submitButton.addActionListener(new ButtonClickListener());
        resetButton.addActionListener(new ButtonClickListener());
        findAirport.addActionListener(new ButtonClickListener());
        controlPanel.add(submitButton);
        controlPanel.add(resetButton);
        controlPanel.add(findAirport);
        controlPanel.add(instructionLabel);

        frame.setVisible(true);

    }

// this listens to the command (button) and the city in the typed area to spit out the correct information
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            String city = smallTextRegion.getText();
            if(command.equals("Submit")){
                textArea.append(city);
            }
            if(command.equals("Reset")){
                smallTextRegion.setText("");
                textArea.setText("");
            }
            if(city.equalsIgnoreCase("Boston") && command.equals("Find Airport")) {
                textArea.append(" Boston - Boston Logan International Airport (BOS)");
            }
            else if(city.equalsIgnoreCase("New York") && command.equals("Find Airport")) {
                textArea.append(" New York - John F. Kennedy International Airport (JFK)");
            }
            else if(city.equalsIgnoreCase("Chicago")&& command.equals("Find Airport")) {
                textArea.append(" Chicago - O'Hare International Airport (ORD)");
            }
            else if(city.equalsIgnoreCase("Abu Dhabi")&& command.equals("Find Airport")){
                textArea.append(" Abu Dhabi - Zayed International Airport (AUH)");
            }
            else if(city.equalsIgnoreCase("Dammam")&& command.equals("Find Airport")){
                textArea.append(" Dammam - King Fahad International Airport (DMM)");
            }
            else if(city.equalsIgnoreCase("New Delhi")&& command.equals("Find Airport")){
                textArea.append(" New Delhi - Indra Gandhi International Airport (DEL)");
            }
            else if(city.equalsIgnoreCase("Dubai")&& command.equals("Find Airport")){
                textArea.append(" Dubai - Dubai International Airport (DXB)");
            }
            else if(city.equalsIgnoreCase("Hong Kong")&& command.equals("Find Airport")){
                textArea.append(" Hong Kong - Hong Kong International Airport (HKG)");
            }
            else if(city.equalsIgnoreCase("Doha")&& command.equals("Find Airport")){
                textArea.append(" Doha - Hammad International Airport (DOH)");
            }
            else if(city.equalsIgnoreCase("London - Heathrow")&& command.equals("Find Airport")){
                textArea.append(" London - London Heathrow International Airport (LHR)");
            }
            else if(city.equalsIgnoreCase("Washington DC")&& command.equals("Find Airport")){
                textArea.append(" Washington DC - Dulles International Airport (IAD)");
            }
            else if(city.equalsIgnoreCase("Paris")&& command.equals("Find Airport")){
                textArea.append(" Paris - Charles De Gulle International Airport (CDG)");
            }
            else if(city.equalsIgnoreCase("Zurich")&& command.equals("Find Airport")){
                textArea.append(" Zurich - Zurich International Airport (ZRH)");
            }
            else if(city.equalsIgnoreCase("Frankfurt")&& command.equals("Find Airport")){
                textArea.append(" Frankfurt - Frankfurt International Airport (FRA)");
            }
            else if(city.equalsIgnoreCase("Rome")&& command.equals("Find Airport")){
                textArea.append(" Rome - Rome Fiumicino Leonardo da Vinci Airport (FCO)");
            }
            else if(city.equalsIgnoreCase("Madrid")&& command.equals("Find Airport")){
                textArea.append(" Madrid - Adolfo Suárez Madrid-Barajas Airport (MAD)");
            }
            else if(city.equalsIgnoreCase("Riyadh") && command.equals("Find Airport")){
                textArea.append(" Riyadh - King Khaled International Airport (RUH)");
            }
            else if(city.equalsIgnoreCase("Beijing")&& command.equals("Find Airport")){
                textArea.append(" Beijing - Beijing Daxing International Airport (PKX)");
            }
            else if(city.equalsIgnoreCase("Shanghai")&& command.equals("Find Airport")){
                textArea.append(" Shanghai - Shanghai Pudong International Airport (PVG)");
            }
            else if(city.equalsIgnoreCase("Mumbai")&& command.equals("Find Airport")){
                textArea.append(" Mumbai - Chatrapati Shivaji Maharaj International Airport (BOM)");
            }
            else if(city.equalsIgnoreCase("Sydney")&& command.equals("Find Airport")){
                textArea.append(" Sydney - Sydney International Airport (SYD)");
            }
            else if(city.equalsIgnoreCase("Buenos Aires")&& command.equals("Find Airport")){
                textArea.append(" Buenos Aires - Ezeiza International Airport (EZE)");
            }
            else if (city.equalsIgnoreCase("Cairo") && command.equals("Find Airport")){
                textArea.append(" Cairo - Cairo International Airport");
            }
            //the else is for any other city that is not in the list I made
            else if (command.equals("Find Airport")){
                textArea.append("Airport not found");
            }
        }
    }


    public static void main(String[] args) {
        FindAndReplace app = new FindAndReplace();
    }
}