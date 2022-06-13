package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Constellation.Constellationinput;
import manager.ConstellationManager;

public class ConstellationViewer extends JPanel   {

	WindowFrame frame;
	
	ConstellationManager constellationManager;


	public ConstellationManager getConstellationManager() {
		return constellationManager;
	}


	public void setConstellationManager(ConstellationManager constellationManager) {
		this.constellationManager = constellationManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("MainStar");
		model.addColumn("Contact Info.");
	      
		for(int i=0; i< constellationManager.size(); i++ ) {
			Vector<Object> row = new Vector();
			Constellationinput si = constellationManager.get(i); 
			row.add(si.getNumber());
			row.add(si.getName());
			row.add(si.getMainStar());
			model.addRow(row);
		}
	      
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);  
	      
		this.add(sp);
	}


	public ConstellationViewer(WindowFrame frame, ConstellationManager constellationManager) {
		this.frame = frame;
		this.constellationManager = constellationManager;
	      
		System.out.println("***" + constellationManager.size() + "***");
	      
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("MainStar");
		model.addColumn("Contact Info.");
	      
		for(int i=0; i< constellationManager.size(); i++ ) {
			Vector<Object> row = new Vector();
			Constellationinput si = constellationManager.get(i); 
			row.add(si.getNumber());
			row.add(si.getName());
			row.add(si.getMainStar());
			model.addRow(row);
		}
	      
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);  
	      
		this.add(sp);
		}
}
