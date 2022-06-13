package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.ConstellationViewer;
import gui.WindowFrame;
import manager.ConstellationManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ConstellationViewer constellationviewer = frame.getConstellationviewer();
		ConstellationManager constellationManager = getObject("constellationmanager.ser");
		constellationviewer.setConstellationManager(constellationManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(constellationviewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static ConstellationManager getObject(String filename) {
		ConstellationManager constellationManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			constellationManager = (ConstellationManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return constellationManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return constellationManager;
	}

}
