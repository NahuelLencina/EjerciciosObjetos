import java.awt.*;


public class EjercicioDiagonal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Rectangle r = new Rectangle(3,2,150,400);
		double valorDiag=diagonal(r);
		
		System.out.println("La medida de la diagonal es: " + valorDiag);
	}
	
	public static double diagonal(Rectangle rect) {
	
		Point p = new Point();
		p.x= rect.width+rect.x;
		p.y= rect.height+rect.y;
		return p.distance(rect.x,rect.y);
	}
}
