package ejercicios03;

public class Ejercicio12 {
	public static void main(String[] args) {
		System.out.print("nota del primer examen: ");
		double nota1 = Double.parseDouble(System.console().readLine());

		System.out.print("¿nota quiere sacar en el trimestre? ");
		double notaFinal = Double.parseDouble(System.console().readLine());

		double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;

		System.out.println("Para tener un " + notaFinal + " en el trimestre");
		System.out.println(" necesita sacar un " + nota2 + " en el segundo examen.");

	}
}
