import java.awt.*;

public class EjercicioEstaDentro {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Rectangle r = new Rectangle(3,2,150,400);
		Point p = new Point (153,402); 
		
		System.out.println("El punto se encuentra adentro? "+estaDentro(p,r));
	}
	
	 public static boolean estaDentro(Point p, Rectangle r) {
		 Boolean ban=false;
		 
		 if(p.x>=r.x && p.x <= r.x+r.width) {
			 if(p.y>=r.y && p.y<= r.y+r.height)
				 ban=true;
		 }	 
		 return ban; 
	 }
}
