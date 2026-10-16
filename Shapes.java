/** 
 * A simple graphics program
 */

import java.awt.*;
import javax.swing.*;

public class Shapes extends JPanel {

   private int myWindowWidth = 300;
   private int myWindowHeight = 400;

   public Shapes() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.add (this);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.setVisible (true);
   }


   public void paintComponent (Graphics g) {
      //Experiment with new methods here. Don't forget setColor!
      // g.setColor(Color.magenta);
      // g.fillOval(100,100, 50, 200);
      this.drawTarget(g);
      this.olympicRings(g);
      this.trafficLight(g);
      

   }

   public void drawTarget(Graphics g) {
      g.setColor(Color.red);
      g.fillOval(10, 10, 100, 100);
      g.setColor(Color.black);
      g.fillOval(20, 20, 80, 80);
      g.setColor(Color.red);
      g.fillOval(30, 30, 60, 60);
      g.setColor(Color.black);
      g.fillOval(40, 40, 40, 40);
      g.setColor(Color.red);
      g.fillOval(50, 50, 20, 20);

   }

   public void olympicRings(Graphics g) {
      g.setColor(Color.blue);
      g.drawOval(150, 140, 20, 20);
      g.setColor(Color.black);
      g.drawOval(170, 140, 20, 20);
      g.setColor(Color.red);
      g.drawOval(190, 140, 20, 20);
      g.setColor(Color.yellow);
      g.drawOval(160, 150, 20, 20);
      g.setColor(Color.green);
      g.drawOval(180, 150, 20, 20);
   }

   public void trafficLight(Graphics g){
      g.setColor(Color.black);
      g.drawRect(10, 200, 30, 80);
      g.drawOval(15, 205, 20, 20);
      g.drawOval(15, 230, 20, 20);
      g.drawOval(15, 255, 20, 20);
      g.setColor(Color.green);
      g.fillOval(15, 255, 20, 20);
   }
}
