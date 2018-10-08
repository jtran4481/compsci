package projects;

import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JMenu;

public class MouseDraw extends JFrame{
	JMenuBar mainMenuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	JMenuItem newMenuItem = new JMenuItem("New");
	JMenuItem exitMenuItem = new JMenuItem("Exit");
	
	Graphics2D g20;
	
	
	
	public MouseDraw() {
		
		//JFrame constructor
		setTitle("Artistic Creations by John");
		setResizable(false);
		setSize(600, 400);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitForm(e);
			}
			
			
		});
		
		getContentPane().setLayout(new GridBagLayout());
		
		setJMenuBar(mainMenuBar);
        fileMenu.setMnemonic('F');
        mainMenuBar.add(fileMenu);
        fileMenu.add(newMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
		newMenuItem.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						newMenuItemActionPerformed(e);
					}
			
				});
				exitMenuItem.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent e)
							{
								exitMenuItemActionPerformed(e);
							}
						}
						
						);
				
				
	}
	private void exitForm(WindowEvent e) {
		g20.dispose();	
		System.exit(0);
			
		
	}
	
	
	private void newMenuItemActionPerformed(ActionEvent e) {
		
	}
	
	private void exitMenuItemActionPerformed(ActionEvent e) {
		int response;
		response = JOptionPane.showConfirmDialog(null, 
				"Are you sure you want to exit the program?",
				"Exit Program",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE
				);
				
		if (response == JOptionPane.NO_OPTION) {
			return;
		} else {
			exitForm(null);
		}
			
	}
	
	
	
	
	
	
}
