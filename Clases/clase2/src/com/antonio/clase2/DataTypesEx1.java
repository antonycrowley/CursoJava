package com.antonio.clase2;

public class DataTypesEx1 {
	
	/*
	 * TIPOS DE DATOS PRIMITIVOS
	 */
	
	float floatVal = 1.0f;		//TIPO DE DATO DE PUNTO FLOTANTE (FLOAT)
	double doubleVal = 4.0;		//TIPO DE DATO DE PUNTO FLOTANTE (DOUBLE)
	int intVal = 20;			//TIPO DE DATO DE TIPO ENTERO (INT) 32 BITS
	byte byteVal = 7;			//TIPO DE DATO DE TIPO ENTERO (BYTE) 8 BITS [-128, 127]
	short shortVal =7;			//TIPO DE DATO DE DE TIPO ENTERO (SHORT) 16 BITS
	long longVal = 5L;			//TIPO DE DATO DE TIPO ENTERO (LONG) 64 BITS

	char charVar = 'a';			//TIPO DE DATO TIPO CHAR, GUARDAR CARACTERES SIMPLES
	boolean flag = true;		//TIPO DE DATO BOOLEAN. GUARDA VALORES BOOLEANOS (TRUE OR FALSE)	
	
	
	
	public static void main(String[] args) {
		String str = "un string";
		System.out.println(str.equals("un string"));;
	}
}
