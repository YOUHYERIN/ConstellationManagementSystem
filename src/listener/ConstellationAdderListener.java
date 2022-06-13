package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Constellation.Constellationinput;
import Constellation.Constellationkind;
import Constellation.SpringConstellation;
import exception.MainStarFormatException;
import manager.ConstellationManager;

public class ConstellationAdderListener implements ActionListener {
	JTextField fieldNumber;
	JTextField fieldName;
	JTextField fieldMainStar;
	
	ConstellationManager constellationManager;
	
	public ConstellationAdderListener(
			JTextField fieldNumber, 
			JTextField fieldName, 
			JTextField fieldMainStar, ConstellationManager constellationManager) {
		this.fieldNumber = fieldNumber;
		this.fieldName = fieldName;
		this.fieldMainStar = fieldMainStar;
		this.constellationManager = constellationManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Constellationinput constellation = new SpringConstellation(Constellationkind.Spring);
		try {
			constellation.setMainStar(fieldMainStar.getText());
			constellation.setNumber(Integer.parseInt(fieldNumber.getText()));
			constellation.setName(fieldName.getText());
			constellationManager.addConstellation(constellation);
			putObject(constellationManager, "constellationmanager.ser");
			constellation.printInfo();
		} catch (MainStarFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(ConstellationManager constellationManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(constellationManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
