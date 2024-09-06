import java.awt.*;

public class EjercicioPuntoMedio {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Point p1 = new Point(6,2); 
		Point p2 = new Point(8,6);
        Point puntoMedio = puntoMedio(p1, p2);
        System.out.println("El punto medio es: (" + puntoMedio.x + ", " + puntoMedio.y + ")");
	}
		
	public static Point puntoMedio(Point p1, Point p2){
        int xMedio = (p1.x + p2.x) / 2;
        int yMedio = (p1.y + p2.y) / 2;
        // Devolvemos un nuevo punto con las coordenadas calculadas
        return new Point(xMedio, yMedio);
	}
}
