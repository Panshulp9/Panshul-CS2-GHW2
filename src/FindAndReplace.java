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

        controlPanel.add(smallTextRegion);
        controlPanel.add(submitButton);
        controlPanel.add(resetButton);

        panel.add(controlPanel, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setVisible(true);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                largeTextRegion.setText(smallTextRegion.getText());
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