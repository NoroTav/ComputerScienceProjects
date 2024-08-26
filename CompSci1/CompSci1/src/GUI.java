//Import the Gui files for java
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI  implements ActionListener {
    JLabel label;
    JFrame frame;
    JPanel panel;
    JEditorPane ep;
    private int count = 0;

//Create the GUI Class and Settings
    public GUI(){
        frame = new JFrame();
        panel = new JPanel();
        ep = new JEditorPane();
        JButton button  = new JButton("Click Me!");
        label = new JLabel("Number of clicks: 0");
        ep.setText("Type here");
        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button, ep);
        panel.add(label) ;

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Gui");
        frame.pack();
        frame.setVisible(true);
    }
//Main Code (Run the GUI)
    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: "+ count);
    }
}
