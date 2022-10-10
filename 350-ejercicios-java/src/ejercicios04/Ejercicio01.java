package ejercicios04;
//escribe por teclado dia de la semana y te dice la primera clase
public class Ejercicio01 {
	public static void main(String[] args) {
		String dia;

		System.out.println("Por favor, introduzca un día de la semana y le diré");
		System.out.print("qué asignatura toca a primera hora ese día: ");
		dia = System.console().readLine();
		dia = dia.toLowerCase(); 

		switch (dia) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "miércoles":
			System.out.println("Programación");
			break;
		case "jueves":
			System.out.println("Sistemas Informáticos");
			break;
		case "viernes":
			System.out.println("Bases de Datos");
			break;
		case "sabado":
		case "sábado":
		case "domingo":
			System.out.println("¡Ese día no hay clase!");
			break;
		default:
			System.out.println("El día introducido no es correcto.");
		}
	}
}
