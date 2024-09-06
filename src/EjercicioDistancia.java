import java.awt.*;


public class EjercicioDistancia {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
	    Point p1 = new Point(3, 4);
        Point p2 = new Point(9, 8); 
		
        
        
		double dist=distancia(p1,p2);
         p1.x+=1; // cambiamos la posicion de x e y
         p1.y+=15;
		 System.out.println("La distancia entre los puntos es: " + dist);
	}
	
	public static double distancia(Point p1, Point p2) {
		return p1.distance(p2);		
	}
}
