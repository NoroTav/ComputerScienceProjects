//Import the Gui files for java
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.jar.JarEntry;

public class GUI_ToDoList implements ActionListener {
    JLabel label;
    JFrame frame;
    JPanel panel;
    JEditorPane ep;

//Create the GUI Class and Settings
    public GUI_ToDoList(ArrayList list){
        frame = new JFrame();
        panel = new JPanel();

        panel.setLayout(new GridLayout(0,1));
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        JLabel[] labels = new JLabel[list.size()];
        for(int i=0; i< list.size();i++)
        {
            labels[i] = new JLabel();
            labels[i].setText("YOU NEED TO: " +"\n"+ list.get(i));
            labels[i].setBounds(100,50,50,50);
            panel.add(labels[i]);
            System.out.println(labels[i]);
        }


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setTitle("TODOLISTAPPLICATION");
        frame.setSize(500,800);
        frame.setVisible(true);




    }
//Main Code (Run the GUI)
    public static void main(String[] args){
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
