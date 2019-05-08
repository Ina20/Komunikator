import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DialogueWindow {

    JFrame frame;
    JPanel panel2;
    JScrollPane inputScroll;
    JTextArea textInput, displayArea;
    JButton sendButton;

    public void createWindow(){

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 500));

        displayArea = new JTextArea();
        displayArea.setPreferredSize(new Dimension(600, 350));
        displayArea.setBackground(Color.PINK);
        displayArea.setEditable(false);
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);
        displayArea.setVisible(true);
        frame.add(displayArea, BorderLayout.NORTH);

        //to jeszcze nie działa, ale będzie xD
/*
        inputScroll = new JScrollPane();
        inputScroll.setPreferredSize(new Dimension(600, 350));
        inputScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        inputScroll.add(displayArea);
        frame.add(inputScroll, BorderLayout.NORTH);
*/

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(600, 100));
        frame.add(panel2, BorderLayout.SOUTH);

        textInput = new JTextArea();
        textInput.setPreferredSize(new Dimension(400, 100));
        textInput.setBackground(Color.CYAN);
        textInput.setLineWrap(true);
        textInput.setWrapStyleWord(true);
        panel2.add(textInput, new FlowLayout(FlowLayout.LEFT));

        sendButton = new JButton("Wyślij");
        sendButton.setPreferredSize(new Dimension(150, 80));
        panel2.add(sendButton, new FlowLayout(FlowLayout.RIGHT));



        frame.pack();
        frame.setVisible(true);
    }
}
