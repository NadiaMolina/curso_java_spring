class HolaMundo {
	public static void main(String argumentos[]){
	 System.out.println("Hola Mundo");
	 for (int i= 0; i < argumentos.length; i++){
		 System.out.println("Arg" + i + "="
		 + argumentos[i]);
	}
	int entero=2002314569; // variable tipo entero
	float decimal=1.234567890123456789f; // variable tipo decimal
	double doblePrecision = 1234567890123456789d;
	long enteroLargo=123456789123456789l; // para enteros con más de 10 cifras
	byte unByte=-127; // solo almacenan hasta 127
	System.out.println ("entero = " + entero);
	System.out.println ("decimal = " + decimal);
	System.out.println ("doble = "+ doblePrecision);
	System.out.println ("enteroLargo = "+ enteroLargo);
	System.out.println ("unByte = "+ unByte);

	char caracter= 'A';
	String texto;
	texto= "Cualquier texto";
	System.out.println("texto= " + texto);
	
	
}
}
