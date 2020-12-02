package mi_expresion_regular;

import java.util.regex.Pattern;

public class Ejemplo {
	
	public static void main(String[] args) 
	{
		String n1 = "Jesús Valido Zafra";
		String n2 = "León Pérez";
		String n3 = "Josefa";
		String n4 = "Colegio Sagrados Corazones SSCC";
		
		String regex = "[a-zA-ZáéíóúÁÉÍÓÚ]+\\s[a-zA-ZáéíóúÁÉÍÓÚ]+\\s[a-zA-ZáéíóúÁÉÍÓÚ]+";
		
		System.out.println(Pattern.matches(regex, n1));
		System.out.println(Pattern.matches(regex, n2));
		System.out.println(Pattern.matches(regex, n3));
		System.out.println(Pattern.matches(regex, n4));
	}

}
