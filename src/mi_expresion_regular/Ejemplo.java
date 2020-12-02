package mi_expresion_regular;

import java.util.regex.Pattern;

public class Ejemplo {
	
	public static void main(String[] args) 
	{
		//Instanciamos cuatro strings para comprobar
		String n1 = "Jesús Valido Zafra";
		String n2 = "León Pérez";
		String n3 = "Josefa";
		String n4 = "Colegio Sagrados Corazones SSCC";

		//Instanciamos la expresión regular
		String regex = "[a-zA-ZáéíóúÁÉÍÓÚ]+\\s[a-zA-ZáéíóúÁÉÍÓÚ]+\\s[a-zA-ZáéíóúÁÉÍÓÚ]+";
		
		//Mostramos por pantalla si coincide el patrón con el string
		System.out.println(Pattern.matches(regex, n1));
		System.out.println(Pattern.matches(regex, n2));
		System.out.println(Pattern.matches(regex, n3));
		System.out.println(Pattern.matches(regex, n4));
	}

}
