
import java.util.Scanner;
public class pista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido");
		
		 while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Calcular velocidad promedio");
	            System.out.println("2. Salir");
	            System.out.print("Elija una opción: ");
	            int opcion = scanner.nextInt();

	            if (opcion == 1) {
	                calcularVelocidadPromedio(scanner);
	            } else if (opcion == 2) {
	                System.out.println("¡finalizacion!");
	                break;
	            } else {
	                System.out.println("Opción inválida. Por favor, elija una opción válida.");
	            }
	        }

	        scanner.close();
	    }

	    private static void calcularVelocidadPromedio(Scanner scanner) {
	        System.out.print("Ingrese el número de vueltas realizadas por el vehículo: ");
	        int vueltas = scanner.nextInt();

	        double tiempoTotal = 0;
	        for (int i = 1; i <= vueltas; i++) {
	            System.out.print("Ingrese el tiempo de la vuelta " + i + " (en segundos): ");
	            double tiempoVuelta = scanner.nextDouble();

	            if (tiempoVuelta <= 0) {
	                System.out.println("Tiempo inválido. El tiempo debe ser mayor que cero.");
	                i--; // Restamos uno para que vuelva a ingresar el tiempo de la misma vuelta.
	                continue;
	            }

	            tiempoTotal += tiempoVuelta;
	        }

	        double velocidadPromedio = vueltas / tiempoTotal;
	        System.out.println("La velocidad promedio del vehículo es: " + velocidadPromedio + " vueltas por segundo.");
	    }
	}


	


