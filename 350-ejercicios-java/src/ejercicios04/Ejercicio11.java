package ejercicios04;

//Escribe un programa que dada una hora determinada (horas y minutos),
 //calcule los segundos que faltan para llegar a la medianoche.

public class Ejercicio11 {
	public static void main(String[] args) {

		System.out.print("Introduce una hora del día, ");
		System.out.println("primero la hora y luego los minutos.");

		System.out.print("hora: ");
		int hora = Integer.parseInt(System.console().readLine());

		System.out.print("minuto: ");
		int minuto = Integer.parseInt(System.console().readLine());

		int segundosTranscurridos = (hora * 3600) + (minuto * 60);
		int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;

		System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", hora, minuto,
				segundosHastaMedianoche);
	}
}
