// Assignment #: 12
// Name: Haonan Li
// StudentID: 1206621204
// Lecture: M W 12:00-1:15
// Description: Dot class

import javax.swing.*;
import java.awt.*;
public class Dot
{
	int x;
	int y;
	Color color;
	int DIAMETER;
	//declare the variable
	public Dot(int x1,int y1,Color color1,int diameter)
	{
		x = x1;
		y = y1;
		color = color1;
		DIAMETER=diameter;
	}
	//draw method is use to draw a dot
	public void draw(Graphics page)
	{
		page.setColor(color);
		page.fillOval(x,y,DIAMETER,DIAMETER);
	}
}