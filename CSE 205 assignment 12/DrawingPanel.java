// Assignment #: 12
//         Name: Haonan Li
//    StudentID: 1206621204
//      Lecture: M W 12:00-1:15
//  Description: The DrawingPanel class defines a panel where dots
//               are drawn using javax.swing.Timer

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawingPanel extends JPanel
 {
  private int diameter; //diameter of a dot
  private Color currentColor;
  private ArrayList<Dot> dotList;
  private int currentX, currentY;
  private int moveX, moveY; //how much to move horizontally or vertically
  private Timer timer;
  private int delay;   //delay of Timer
 
  //The constructor initializes instance variables, and starts the timer
  public DrawingPanel(Color color, Color backColor)
   {
       moveX=3;
       moveY=3;
       diameter=5;
       delay=20;
       currentX=0;
       currentY=0;
	   currentColor = color;
	   dotList = new ArrayList<Dot>();
	   setBackground(backColor);
	   timer = new Timer(delay, new MoveListener());
	   timer.start();
       
 /**********************************************************
 To be completed
**********************************************************/

   }
   
   public void resume()
   {
	   timer.start();
   }

   public void suspend()
   {
	   timer.stop();
   }

   public void reverseX()
   {
	   moveX=moveX*-1;
	   if (timer.isRunning()==false)
   	   {
   		   timer.start();
       }
	
   }

   public void reverseY()
   {
	   moveY=moveY*-1;
	   if (timer.isRunning()==false)
   	   {
   		   timer.start();
       }
	   	 
   }

   public void setDelay(int DELAY)
   {
	   timer.setDelay(DELAY);
   }


/**********************************************************
multiple methods to be completed
**********************************************************/

  //set the color of the dot
  public void setColor(Color another)
   {
       currentColor = another;
   }

  //get the color of the dot
  public Color getColor()
   {
       return currentColor;
   }

  //paintComponent method draws multiple dots in the dotList
  public void paintComponent(Graphics page)
   {
       super.paintComponent(page);
       for(int i=0;i<dotList.size();i++)
       {
		   ((Dot)dotList.get(i)).draw(page);
	   }
/**********************************************************
To be completed
**********************************************************/

   }

  //MoveListener defined an action to be taken for each tick of the Timer.
  //It changes the dot's x and y coordinate using moveX and moveY
  //and draw a dot with the new coordinate. The dots drawn before will
  //remain in the panel. If the dot reaches any boundary, it will rebound
  //into the opposite direction
  private class MoveListener implements ActionListener
   {
        public void actionPerformed(ActionEvent event)
          {

/**********************************************************
To be completed
**********************************************************/
                    currentX += moveX;
		            currentY += moveY;

		           
		            if (currentX <= 0 || currentX >= getSize().getWidth()-diameter)
		            {
		               moveX = moveX * -1;
		            }
		               

		            if (currentY <= 0 || currentY >= getSize().getHeight()-diameter)
		            {
		               moveY = moveY * -1;
		            }
		            
		            
	                 dotList.add(new Dot(currentX,currentY,currentColor,diameter));
		         
		       

                 repaint();
          }
   }
 }
