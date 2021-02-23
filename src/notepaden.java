import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;



public class notepaden {
    public static void main(String[] args) {
        JFrame frame = new JFrame("notepaden");
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        frame.setContentPane(new notepaden().RootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel RootPanel;
    private JTextArea textArea;
}
//För någon anledning kan jag inte implementa actionlistener, och förstår inte varför
