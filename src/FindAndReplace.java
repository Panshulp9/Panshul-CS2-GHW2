import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
// Starter Code for TextEditorApp
// chales 10/2025
//
public class FindAndReplace {
    private JFrame frame;
    private JTextField smallTextRegion;
    private JTextArea largeTextRegion;

    public FindAndReplace() {
        largeTextRegion = new JTextArea();
        largeTextRegion.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(largeTextRegion);


        frame = new JFrame("Find and Replace Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel(new BorderLayout());
        // uncomment the two lines bellow and comment the third line to have textarea scroll
        // JScrollPane scrollPane = new JScrollPane(textArea);
        // panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(scrollPane, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout());
        smallTextRegion = new JTextField(20);

        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        JButton findAirport = new JButton("Find Airport");
        JLabel instructionLabel = new JLabel("Type city in text box");

        controlPanel.add(smallTextRegion);
        controlPanel.add(submitButton);
        controlPanel.add(resetButton);
        controlPanel.add(findAirport);
        controlPanel.add(instructionLabel);

        panel.add(controlPanel, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setVisible(true);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                largeTextRegion.setText(smallTextRegion.getText());

            }
        }
        );
        findAirport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String city = smallTextRegion.getText();

                if(city.equalsIgnoreCase("Boston")) {
                    largeTextRegion.append(" - Boston Logan International Airport (BOS)");
                }
                else if(city.equalsIgnoreCase("New York")) {
                    largeTextRegion.append(" - John F. Kennedy International Airport (JFK)");
                }
                else if(city.equalsIgnoreCase("Chicago")) {
                    largeTextRegion.append(" - O'Hare International Airport (ORD)");
                }
                else if(city.equalsIgnoreCase("Abu Dhabi")){
                    largeTextRegion.append(" - Zayed International Airport (AUH)");
                }
                else if(city.equalsIgnoreCase("Dammam")){
                    largeTextRegion.append(" - King Fahad International Airport (DMM)");
                }
                else if(city.equalsIgnoreCase("New Delhi")){
                    largeTextRegion.append(" - Indra Gandhi International Airport (DEL)");
                }
                else if(city.equalsIgnoreCase("Dubai")){
                    largeTextRegion.append(" - Dubai International Airport (DXB)");
                }
                else if(city.equalsIgnoreCase("Hong Kong")){
                    largeTextRegion.append(" - Hong Kong International Airport (HKG)");
                }
                else if(city.equalsIgnoreCase("Doha")){
                    largeTextRegion.append(" - Hammad International Airport (DOH)");
                }
                else if(city.equalsIgnoreCase("London - Heathrow")){
                    largeTextRegion.append(" - London Heathrow International Airport (LHR)");
                }
                else if(city.equalsIgnoreCase("Washington DC")){
                    largeTextRegion.append(" - Dulles International Airport (IAD)");
                }
                else if(city.equalsIgnoreCase("Paris")){
                    largeTextRegion.append(" - Charles De Gulle International Airport (CDG)");
                }
                else if(city.equalsIgnoreCase("Zurich")){
                    largeTextRegion.append(" - Zurich International Airport (ZRH)");
                }
                else if(city.equalsIgnoreCase("Frankfurt")){
                    largeTextRegion.append(" - Frankfurt International Airport (FRA)");
                }
                else if(city.equalsIgnoreCase("Rome")){
                    largeTextRegion.append(" - Rome Fiumicino Leonardo da Vinci Airport (FCO)");
                }
                else if(city.equalsIgnoreCase("Madrid")){
                    largeTextRegion.append(" - Adolfo Suárez Madrid-Barajas Airport (MAD)");
                }
                else if(city.equalsIgnoreCase("Riyadh")){
                    largeTextRegion.append(" - King Khaled International Airport (RUH)");
                }
                else if(city.equalsIgnoreCase("Beijing")){
                    largeTextRegion.append(" - Beijing Daxing International Airport (PKX)");
                }
                else if(city.equalsIgnoreCase("Shanghai")){
                    largeTextRegion.append(" - Shanghai Pudong International Airport (PVG)");
                }
                else if(city.equalsIgnoreCase("Mumbai")){
                    largeTextRegion.append(" - Chatrapati Shivaji Maharaj International Airport (BOM)");
                }
                else if(city.equalsIgnoreCase("Sydney")){
                    largeTextRegion.append(" - Sydney International Airport (SYD)");
                }
                else if(city.equalsIgnoreCase("Buenos Aires")){
                    largeTextRegion.append(" - Ezeiza International Airport (EZE)");
                }
                else {
                    largeTextRegion.append("Airport not found.");
                }
            }
        });


        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                smallTextRegion.setText("");
                largeTextRegion.setText("");
            }
        });
    }


    public static void main(String[] args) {
        FindAndReplace app = new FindAndReplace();
    }
}