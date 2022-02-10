package fp.figuras.test;

import fp.figuras.Circulo;
import fp.figuras.CirculoImpl;
import fp.figuras.Triangulo;
import fp.figuras.TrianguloImpl;
import fp.figuras.TrianguloImpl2;

public class TestFiguras {

	public static void main(String[] args) {
		
		//circulo es una interfaz
		Circulo c1 = new CirculoImpl();
		// TODO Auto-generated method stub
		c1.hacerVisible();
		
		Triangulo t2 = new TrianguloImpl();
		t2.hacerVisible();
		
		Triangulo t1 = new TrianguloImpl2();
		t1.hacerVisible();
		
		t2.moverHorizontalmenteDespacio(100);
		
		t2.cambiarTamanyo(50, 10);


	}

}
