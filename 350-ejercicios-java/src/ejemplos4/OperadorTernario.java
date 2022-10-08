package ejemplos4;

public class OperadorTernario {
	public static void main(String[] args) {
		System.out.print("Introduzca la nota numérica: ");
		int notaNumerica = Integer.parseInt(System.console().readLine());

		String notaCadena = notaNumerica < 5 ? "suspenso" : "aprobado";

		System.out.println("Nota: " + notaCadena);
	}
}
