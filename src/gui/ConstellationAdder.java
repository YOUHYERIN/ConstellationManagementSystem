package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.ConstellationAdderCancelListener;
import listener.ConstellationAdderListener;
import manager.ConstellationManager;

public class ConstellationAdder extends JPanel {
	
	WindowFrame frame;
	ConstellationManager constellationManager;
   
	public ConstellationAdder (WindowFrame frame, ConstellationManager constellationManager) {
		this.frame = frame;
		this.constellationManager = constellationManager;
		
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
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new ConstellationAdderListener(fieldNumber, fieldName, fieldMainStar, constellationManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new ConstellationAdderCancelListener(frame));
		
		panel.add(labelMainStar);
		panel.add(fieldMainStar);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 4, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
   
}