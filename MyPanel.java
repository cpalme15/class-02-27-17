import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener, KeyListener{
	private JButton jb=null;
public MyPanel()
{
		super();
		jb=new JButton("Change Color");
		this.add(jb);
		jb.addActionListener(this);
		jb.addMouseListener(new myHelper());
		this.addMouseListener(new myHelper());
		this.addKeyListener(this);
		
		this.setFocusable(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	String x=e.getActionCommand();
	switch (x)
	{
	case "Change Color":
		this.setBackground(Color.green);
		break;
	}
	
}


private class myHelper extends MouseAdapter {// use if only want to use some of the methods from Mouslistener and not all of them is a class

	public void mouseClicked(MouseEvent e)
	{
		System.out.println("You clicked at:"+e.getX()+","+e.getY());
	}
	public void mouseEntered(MouseEvent e) {
		MyPanel.this.setBackground(Color.red);
		jb.setBackground(Color.yellow);
	}

	
	public void mouseExited(MouseEvent e) {
		MyPanel.this.setBackground(Color.green);
	}
}


@Override
public void keyTyped(KeyEvent e) {
	
	
}

@Override
public void keyPressed(KeyEvent e) {
	switch (e.getKeyCode()){
	
	case KeyEvent.VK_BACK_SLASH:
		   this.setBackground(Color.blue);
		   break;
	case KeyEvent.VK_W:
		this.setBackground(Color.BLACK);
			}
	
}

@Override
public void keyReleased(KeyEvent e) {
	
	
}
}
