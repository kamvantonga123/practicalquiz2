package za.ac.wsu.s220529973;

public class Circle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
private float radius;
private int y;
private int x;
public void setRadius(int radius)
		{
	radius=radius;
		}
public void setY(int y)
{
   y=y;
}
public void setX(int x)
{
   x=x;	
}
public float getRadius()
{
	return radius;
}
public int getY()
{
	return y;
}
public int getX()
{
	return x;
}
void calculateArea()
{
    System.out.println("The area of the circle is: "+getRadius()*getRadius()*Math.PI);
}
void calculateCircumference()
{
	System.out.println("The circumference of the circle is: "+2*Math.PI*getRadius());			
}
void calculateDiameter()
{
	System.out.println("The diameter of the circle is: "+2*getRadius());
}
}
