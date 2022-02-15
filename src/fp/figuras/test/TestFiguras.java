package fp.figuras.test;

import java.time.LocalDate;
import java.time.LocalTime;

import fp.figuras.Circulo;
import fp.figuras.CirculoImpl;
import fp.figuras.Triangulo;
import fp.figuras.TrianguloImpl;
import fp.figuras.TrianguloImpl2;
import fp.figuras.Monigote;
import fp.figuras.MonigoteImpl;

public class TestFiguras {

	public static void main(String[] args) {
		
		//circulo es una interfaz
		Circulo c1 = new CirculoImpl();
		
		c1.hacerVisible();
		
		Triangulo t2 = new TrianguloImpl();
		t2.hacerVisible();
		
		Triangulo t1 = new TrianguloImpl2();
		t1.hacerVisible();
		
		t2.moverHorizontalmenteDespacio(100);
		
		t2.cambiarTamanyo(50, 10);
		
		// Fecha actual
		LocalDate fecha = LocalDate.now();
		
		// Hora actual
		LocalTime hora = LocalTime.now();
		
		// Fecha descubrimiento de américa
		LocalDate fechaDescubrimientoAmerica = LocalDate.of(1492,10,12);
		
		// Hora del medio día
		LocalTime medioDia = LocalTime.of(12,00,0);
		
		// Objeto de un monigote
		Monigote m1 = new MonigoteImpl();
		m1.hacerVisible();
		
		// Cadena
		String cadena = "Fundamentos de programación";
		
		// Número real
		Double numReal = 2.44;
		
		// Impresión por consola
		System.out.println("La fecha del dia de hoy es: " + fecha);
		System.out.println("La hora actual es: " + hora);
		System.out.println("La fecha del descubrimiento de america es: " + fechaDescubrimientoAmerica);
		System.out.println("La hora del medio dia es: " + medioDia);
		System.out.println(numReal);
		System.out.println(cadena);
		
		//Apuntes de la clase del 15/02/2022
		Float f1 = 2.44F; // Se puede con F o f
		System.out.println("Objeto real2" + f1);
		
		Integer n = 5;
		System.out.println("Objeto entero" + n);
		
		Long l = 5L; // Se puede con L o l
		System.out.println("Objeto entero" + l);
		
		Character car = 'F';
		System.out.println("Objeto caracter" + car);
		
		Integer a = 3;
		Boolean b = a>2 && a<5;
		System.out.println(b);
		
		Boolean b2 = a>2 || a<5;
		System.out.println(b2);
		
		Integer n1=5;
		Integer n2=2;
		System.out.println(n1/n2); //Devuelve un entero aproximado por abajo
		
		      //Para que muestre los decimales siendo tipo entero
		System.out.println(n1.doubleValue()/n2); 
		System.out.println((double)n1/n2);
		Double d2 = 2.0;
		System.out.println(n1/d2);
	
		
				
		


	}

}
