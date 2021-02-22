import wheels.users.Frame;
import wheels.users.Ellipse;
import wheels.users.Rectangle;
import wheels.users.Line;
import java.awt.Color;


public class Snowman extends Frame{
	
	private Ellipse bottomCircle;
	private Ellipse midCircle;
	private Ellipse topCircle;
	private Ellipse sun;
	private Rectangle hat;
	private Rectangle grass;
	private Line hatLine;
	
	public Snowman() {
		
		grass = new Rectangle();
		grass.setLocation(0,450);
		grass.setSize(700,150);
		grass.setColor(Color.green);
		
		bottomCircle = new Ellipse();
		bottomCircle.setLocation (275,325);
		bottomCircle.setSize (175,175);
		bottomCircle.setColor(Color.cyan);
		
		midCircle = new Ellipse();
		midCircle.setLocation(305,225);
		midCircle.setSize(115,115);
		midCircle.setColor(Color.cyan);
		
		topCircle = new Ellipse();
		topCircle.setLocation(315,142);
		topCircle.setSize(90,90);
		topCircle.setColor(Color.cyan);
		
		sun = new Ellipse();
		sun.setLocation (500,50);
		sun.setSize(125,125);
		sun.setColor(Color.yellow);
		
		
		hat = new Rectangle();
		hat.setLocation(320,60);
		hat.setSize(82,87);
		hat.setColor(Color.black);
		
		hatLine = new Line();
		hatLine.setP1(310,145);
		hatLine.setP2(415,145);
		hatLine.setThickness (5);
		hatLine.setColor(Color.black);
		
	
	}
	public static void main (String[]args) {
		new Snowman();
	}
}
