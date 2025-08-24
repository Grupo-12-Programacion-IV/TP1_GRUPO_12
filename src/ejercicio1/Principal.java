package ejercicio1;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Persona empleado1= new Empleado("asistente al gerente regional","47070552","Dwight","Schrute",LocalDate.of(1989, 7, 12),"M","CALLE FALSA 123", "1123103152", "dwightschrute@gmail.com");
		Persona empleado2= new Empleado();
		Persona empleado3= new Empleado("gerente regional","26017361","Michael","Scott",LocalDate.of(1977, 4, 4),"M","Calle Real 345", "1150465780", "michaelscott@gmail.com");
		Persona empleado4= new Empleado();
		Persona empleado5= new Empleado("CEO", "92902121","Francisca","Balmaceda", LocalDate.of(1973, 10, 4), "F", "Corrientes 369","1144087382","franbal73@gmail.com");
		
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(empleado3.toString());
		System.out.println(empleado4.toString());
		System.out.println(empleado5.toString());
		
		
		System.out.println("El próximo legajo será el: "+ Empleado.devuelveProximoLegajo());
	}

	
	
	
}
