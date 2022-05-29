package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ConstellationAdder extends JFrame {
   
   public ConstellationAdder () {
      JPanel panel = new JPanel();
      panel.setLayout(new SpringLayout());
      
      JLabel labelNumber  = new JLabel("Number", JLabel.TRAILING);
      JTextField fieldNumber = new JTextField(10);
      labelNumber.setLabelFor(fieldNumber);
      panel.add(labelNumber);
      panel.add(fieldNumber);
      
      JLabel labelName  = new JLabel("Name", JLabel.TRAILING);
      JTextField fieldName = new JTextField(10);
      labelName.setLabelFor(fieldName);
      panel.add(labelName);
      panel.add(fieldName);
      
      JLabel labelMainStar  = new JLabel("MainStar", JLabel.TRAILING);
      JTextField fieldMainStar = new JTextField(10);
      labelMainStar.setLabelFor(fieldMainStar);
      panel.add(labelMainStar);
      panel.add(fieldMainStar);
      
      panel.add(new JButton("save"));
      panel.add(new JButton("cancel"));
      
      SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
      
      
      this.setSize(300, 300);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setContentPane(panel);
      this.setVisible(true);
   }
   

}