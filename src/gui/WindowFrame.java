package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.ConstellationManager;

public class WindowFrame extends JFrame {

	ConstellationManager constellationManager;
	
	MenuSelection menuselection;
	ConstellationAdder constellationadder;
	ConstellationViewer constellationviewer;

	public WindowFrame(ConstellationManager constellationManager) {
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.constellationManager = constellationManager;
		menuselection = new MenuSelection(this);
		constellationadder = new ConstellationAdder(this, this.constellationManager);
		constellationviewer = new ConstellationViewer(this, this.constellationManager);
		
		this.add(menuselection);		
		
		this.setVisible(true);
	}
	
	public void setupPanel (JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ConstellationAdder getConstellationadder() {
		return constellationadder;
	}

	public void setConstellationadder(ConstellationAdder constellationadder) {
		this.constellationadder = constellationadder;
	}

	public ConstellationViewer getConstellationviewer() {
		return constellationviewer;
	}

	public void setConstellationviewer(ConstellationViewer constellationviewer) {
		this.constellationviewer = constellationviewer;
	}
}