package ejercicios03;

public class Ejercicio01 {
	public static void main(String[] args) {
		int x;
		int y;
		String linea;

		System.out.println("Este programa multiplica dos números enteros.");
		System.out.print("Introduzca el primer número: ");
		linea = System.console().readLine();
		x = Integer.parseInt(linea);
		System.out.print("Introduzca el segundo número: ");
		linea = System.console().readLine();
		y = Integer.parseInt(linea);

		System.out.println(x + " * " + y + " = " + (x * y));
	}
}
