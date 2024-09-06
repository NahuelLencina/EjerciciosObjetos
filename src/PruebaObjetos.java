import java.awt.*;


public class PruebaObjetos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Point p;
		p=new Point (3,4);

		Rectangle caja = new Rectangle(0,0,200,100);
		
		caja.width+=2; //Cambiamos el largo del rectangulo.
		
		caja.translate(200, 1000); // cambia la posicion del rectangulo Metodo translate
		
		
		System.out.println(p);
		System.out.println(caja);
		
		
		
		 mover(caja, 50, 100);
		 System.out.println(caja);
		
		// Rectangle caja2 = caja;
		// System.out.println(caja2.width);
		
		// caja.grow(50,50);
		// System.out.println(caja2.width);
		
		
		
		// System.out.println(caja2.width);
		// caja.grow(50,50);
		// System.out.println(caja2.width);

	}
	
	 static void mover(Rectangle c, int dx, int dy) {
		c.x = c.x + dx;
		c.y = c.y + dy;
		}
	

}