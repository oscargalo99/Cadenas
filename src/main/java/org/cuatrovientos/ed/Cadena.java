package org.cuatrovientos.ed;

public class Cadena {

	public int longitud(String cadena) {
		return cadena.length();
	}

	public int vocales(String cadena) {
		int cnt = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
				cnt += 1;
			}
		}
		return cnt;
	}

	public String invertir(String cadena) {
		String salida = "";
		for (int i=cadena.length()-1;i>=0;i--)
			  salida = salida + cadena.charAt(i);
		return salida;
	}

	public int contarLetra(String cadena, char caracter) {
		int cnt = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				cnt += 1;
			}
		}
		return cnt;
	}

}
