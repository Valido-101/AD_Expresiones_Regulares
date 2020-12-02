package mi_expresion_regular;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Extraer_annio {

	public static void main(String[] args) {
		
		//Instanciamos un string con una fecha
		String fecha = "20/12/2020";
		
		//Instanciamos un string con la expresi�n regular
		String regex = "\\d{1,2}/\\d{1,2}/(\\d{4})";
		
		//Creamos un patr�n compilando el string regex
		Pattern patron = Pattern.compile(regex);
		
		//Creamos un matcher usando el m�todo matcher de patron sobre la fecha
		Matcher matcher = patron.matcher(fecha);
		
		//Encontramos la primera aparici�n del patr�n
		matcher.find();
		
		//Mostramos por pantalla el grupo 1
		System.out.println("El a�o es: "+matcher.group(1));

	}

}
