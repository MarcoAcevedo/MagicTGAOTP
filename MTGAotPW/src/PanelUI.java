import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelUI {
	private JFrame f1;
	private JPanel p1;
	private JButton b1;
	private JLabel l1;
	
	public PanelUI(){
		gui();
	}
	
	public void gui(){
		f1=new JFrame("insert f1 title here");
		f1.setVisible(true);
		f1.setSize(1280, 720);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel(new GridBagLayout());
		p1.setBackground(Color.GRAY);
		
		b1=new JButton("insert b1 name here");
		l1=new JLabel("insert l1 name here");
		
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(10,10,10,10);
		
		c.gridx=0;
		c.gridy=1;
		p1.add(b1,c);
		
		c.gridx=1;
		c.gridy=2;
		p1.add(l1,c);
		
		f1.add(p1);//BorderLayout is OP ,BorderLayout.WEST
	}

}
