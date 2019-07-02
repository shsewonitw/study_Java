package tje.component2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuActionEventEx extends JFrame {
	Container contentPane;
	JLabel label = new JLabel("Hello");
	
	public MenuActionEventEx() {
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		contentPane = getContentPane();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250,200);
		setVisible(true);
	}
	
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItems = new JMenuItem[4];
		String [] itemTitles = {"Color", "Font", "Top", "Bottom"};
		JMenu fileMenu = new JMenu("Text");
		for(int i = 0 ; i < menuItems.length ; i++) {
			menuItems[i] = new JMenuItem(itemTitles[i]);
			menuItems[i].addActionListener(new MenuActionListener());
			fileMenu.add(menuItems[i]);
		}
		mb.add(fileMenu);
		this.setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			if(cmd.equals("Color")) 				
				label.setForeground(Color.BLUE);
			else if(cmd.equals("Font"))
				label.setFont(new Font("Ravie",Font.ITALIC, 30));
			else if(cmd.equals("Top"))
				label.setVerticalAlignment(SwingConstants.TOP);
			else
				label.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		
	}
	public static void main(String[] args) {
		new MenuActionEventEx();
	}
}
