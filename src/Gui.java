import javax.swing.JFrame;

public class Gui extends JFrame {
    JButton button = new JButton("Click Me");
    JTextField textField = new JTextField("This is a text field");
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My GUI Application");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
