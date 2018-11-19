package examen;

import java.util.Random;

import modelo.Libro;

public class Metodos {

	// ejercicio 1
	public char metodo1(int numero) {
		char resultadoLetra;
		char[] letrasValidas = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };
		if (Integer.toString(numero).length() != 8) {
			return '1';
		}
		return resultadoLetra = letrasValidas[numero % 23];
	}

	// ejercicio 2
	
	public Libro[] metodo (String[] libros) {
		//array de objetos libro que voy a devolver
		Libro[] arrayLibros = new Libro[libros.length];
		//bucle para recorrer el array de cadenas
		for (int i = 0; i < libros.length; i++) {
			String[] partes = libros[i].split("#");
			String id = partes[0];
			String titulo = partes[1];
			String precio = partes[2];
			try {
				arrayLibros[i] = new Libro(Integer.parseInt(id), titulo, Float.parseFloat(precio));
			} catch (NumberFormatException e) {
				arrayLibros[i] = null;
				// TODO: handle exception
			}
		}
		return arrayLibros;
	}
	
	// ejercicio 3
	
	public int[][] metodo3(int jugadores, int partidas){
		int[][] resultado = new int[jugadores][partidas];
		/*
		 * Random rnd = new Random();
		for (int i = 0; i < cuantos; i++)
			System.out.println(inferior + rnd.nextInt(superior - inferior + 1));
			
					for (int j = 0; j < ventas[0].length; j++) {
			for (int i = 0; i < ventas.length; i++) {
				resultado[j] += ventas[i][j];
		 */
		Random rnd = new Random();
		
		for (int j = 0; j < resultado[0].length; j++) {
			for (int i = 0; i < resultado.length; i++) {
				resultado[i][j] = 1 + rnd.nextInt(6 - 1 + 1);
			}
		}
		return resultado;
	}
	
		

	
}
