import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleClicker extends JPanel implements MouseListener {

	private int xClick = -10;
	private int yClick = -10;
    
    public SimpleClicker () {
        JFrame myFrame = new JFrame();      
        myFrame.setSize (300, 300);
        myFrame.add (this);
        myFrame.setVisible (true);
                
        addMouseListener (this);
    }

	public void paintComponent(Graphics g){
		if (xClick != -10 && yClick != -10) {
			g.setColor(Color.red);
			g.fillOval(xClick-350, yClick-350, 700, 700);
		}
		
	}
    
    public void mouseClicked (MouseEvent event) {
		xClick = event.getX();
		yClick = event.getY();
		repaint();

	}
	
	public void mouseReleased (MouseEvent event) {
	}
	
	public void mousePressed (MouseEvent event) {
	}
	
	public void mouseEntered (MouseEvent event) {
	}
	
	public void mouseExited (MouseEvent event) {
	}
}
