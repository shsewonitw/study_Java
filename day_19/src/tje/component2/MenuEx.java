package tje.component2;

import javax.swing.*;
import java.awt.*;

public class MenuEx extends JFrame {
	MenuEx() {
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("Save"));
		fileMenu.add(new JMenuItem("Save As"));
		
		mb.add(fileMenu);
		
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		this.setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new MenuEx();
	}
}