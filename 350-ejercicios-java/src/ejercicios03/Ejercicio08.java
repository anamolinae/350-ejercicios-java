package ejercicios03;

public class Ejercicio08 {
	public static void main(String[] args) {
		System.out.print("horas trabajadas durante la semana: ");
		int horasTrabajadas = Integer.parseInt(System.console().readLine());
		System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
	}
}
