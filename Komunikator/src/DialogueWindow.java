import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class DialogueWindow {

    JFrame frame;
    JPanel panel2;
    JScrollPane inputScroll, displayScroll;
    JTextArea textInput, displayArea;
    JButton sendButton;

    public void createWindow(){

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 500));

        displayArea = new JTextArea();
        displayArea.setBackground(Color.PINK);
        displayArea.setEditable(false);
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);

        displayScroll = new JScrollPane(displayArea);
        displayScroll.setPreferredSize(new Dimension(600, 350));
        displayScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(displayScroll, BorderLayout.NORTH);

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(600, 100));
        frame.add(panel2, BorderLayout.SOUTH);

        textInput = new JTextArea();
        textInput.setBackground(Color.CYAN);
        textInput.setLineWrap(true);
        textInput.setWrapStyleWord(true);

        inputScroll = new JScrollPane(textInput);
        inputScroll.setPreferredSize(new Dimension(400, 100));
        inputScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel2.add(inputScroll, new FlowLayout(FlowLayout.LEFT));

        sendButton = new JButton("Wyślij");
        sendButton.setPreferredSize(new Dimension(150, 80));
        panel2.add(sendButton, new FlowLayout(FlowLayout.RIGHT));



        frame.pack();
        frame.setVisible(true);
    }
}
