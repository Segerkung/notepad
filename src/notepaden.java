import javax.swing.*;

public class notepaden {
    public static void main(String[] args) {
        JFrame frame = new JFrame("notepaden");
        frame.setContentPane(new notepaden().RootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel RootPanel;
    private JTextArea textArea;
}
