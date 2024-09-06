import java.awt.*;

public class EjercicioCentro {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Rectangle r = new Rectangle(5,5,150,400);
		Point p=centro(r);
		System.out.println(p);
	}

	public static Point centro(Rectangle r) {
		Point p =  new Point();
		p.y= (r.height/2)+r.y;
		p.x=(r.width/2)+r.x;	
		return p;
	}
}
