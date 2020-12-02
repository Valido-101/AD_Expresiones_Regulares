package mi_expresion_regular;

import java.util.regex.Pattern;

public class Ejemplo {
	
	public static void main(String[] args) 
	{
		//Instanciamos cuatro strings para comprobar
		String n1 = "Jes�s Valido Zafra";
		String n2 = "Le�n P�rez";
		String n3 = "Josefa";
		String n4 = "Colegio Sagrados Corazones SSCC";

		//Instanciamos la expresi�n regular
		String regex = "[a-zA-Z����������]+\\s[a-zA-Z����������]+\\s[a-zA-Z����������]+";
		
		//Mostramos por pantalla si coincide el patr�n con el string
		System.out.println(Pattern.matches(regex, n1));
		System.out.println(Pattern.matches(regex, n2));
		System.out.println(Pattern.matches(regex, n3));
		System.out.println(Pattern.matches(regex, n4));
	}

}
