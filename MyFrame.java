import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(){
	super();
	this.getContentPane().add(new MyPanel());
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(300,300);
	this.setVisible(true);
	
	}
}
