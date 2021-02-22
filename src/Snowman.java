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
	private Line hatLine;
	
	public Snowman() {
		bottomCircle = new Ellipse();
		bottomCircle.setLocation (275,325);
		bottomCircle.setSize (175,175);
		bottomCircle.setColor(Color.blue);
		
		midCircle = new Ellipse();
		midCircle.setLocation(305,225);
		midCircle.setSize(115,115);
		midCircle.setColor(Color.blue);
		
		topCircle = new Ellipse();
		topCircle.setLocation(315,142);
		topCircle.setSize(90,90);
		topCircle.setColor(Color.blue);
		
		sun = new Ellipse ();
		sun.setLocation (550,50);
		sun.setSize(100,100);
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
