package homework;

public class Fan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan obj = new Fan();
		Fan obj1 = new Fan(MEDIUM, 6, "brown", true);
		obj.display();
		obj1.display();
}
public static final int SLOW=1, MEDIUM=2, FAST=3;
int speed;
boolean on;
double radius;
String color;
Fan()
{
speed=SLOW;	
on=false;
radius=5;
color="blue";
}
Fan(int speed,double radius,String color,boolean on)
{
 this.speed=speed;
 this.radius=radius;
 this.color=color;
 this.on=on;
}
void display() {
	if (on == true) {
		System.out.println("Fan is on \n the speed is =" + speed
				+ "\n the color is =" + color + "\n the radius is ="
				+ radius);
	} else {
		System.out.println("Fan is off \n the color of fan is =" + color
				+ "\n the radius of fan is =" + radius);
	
}
	}

}
