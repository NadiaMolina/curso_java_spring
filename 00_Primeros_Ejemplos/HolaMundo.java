 class HolaMundo {
	public static void main(String argumentos[]){
		System.out.println("Hola mundo");
		for (int i=0; i<argumentos.length; i++){
			System.out.println("Arg " + i + " = " + argumentos[i]);
		} /* int de entero, bucle Arg y entero igual a los argumentos */
		
		int entero; 
		entero = 2234567890; /*maxima longitud de numero entero en int*/
		
		float decimal = 1234567890123456789f;  /* por defecto es de tipo double y da error; hay que añadir la f si queremos que sea float.
		Si es numero grande redondea*/
		double doblePrecision = 1234567890123456789D; /* añadir D cuando no es decimal pero queremos guardarlo en el double*/
		double doblePrecision2 = 1234567890123456789.1;
		long enteroLargo = 12345678901L; /*entero mas largo que int terminado en L*/
		byte unByte = -124; /* de -128 a 128*/
		
		/* usar long y double ralentiza el programa. es mejor usar algo pequeño si vamos a usar pocos numeros*/
		
		
		char caracter = 'A'; /* para un unico caracter. tipo primitivo. cuidado comilla simple*/
		String texto; /*no es tipo primitivo. es objeto*/
		texto = "Cualquier texto";
		
		System.out.println("entero = " + entero);
		System.out.println("decimal = " + decimal);
		System.out.println("doble = " + doblePrecision);
		System.out.println("doble2 = " + doblePrecision2);
		System.out.println("enteroLargo = " + enteroLargo);
		System.out.println("unByte = " + unByte);
		System.out.println("texto = " + texto + " prueba");
		System.out.println("caracter = " + caracter);
		
		
	}
}

// comentario de una linea//
/*comentario varias lineas */
/*
"C:\Program Files\Java\jdk1.8.0_211\bin\javac.exe" "C:\Users\Admin\Desktop\CURSO_JAVA\HolaMundo.java"  para compilar

cd C:\Users\Admin\Desktop\CURSO_JAVA  para cambiar de ruta

 "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" HolaMundo  para ejecutar
 
 
 
 javac HolaMundo.java  compilar
 java HolaMundo     ejecutar
 java HolaMundo ArgA Argum2 Otroar   ejecutar

*/