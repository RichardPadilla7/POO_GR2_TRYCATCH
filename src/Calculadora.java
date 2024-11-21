import java.util.Scanner;

public class CalculadoraDeAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Logger = Registrar información sobre errores y excepciones que puedan ocurrir en la ejecución

        while (true) {
            //USO DEL TRY CATCH
            try {
                // Mostrar el menú de opciones
                System.out.println("Seleccione la figura geométrica para calcular su área:");
                System.out.println("1. Círculo");
                System.out.println("2. Triángulo");
                System.out.println("3. Rectángulo");
                System.out.println("4. Salir");
                System.out.print("Opción: ");
                int opcion = Integer.parseInt(scanner.nextLine());

                // Manejo de cada caso
                switch (opcion) {
                    case 1: // Círculo
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = Double.parseDouble(scanner.nextLine());
                        if (radio < 0) {
                            // LOGGER.warning("El usuario ingresó un radio negativo.");
                            System.out.println("Error: El radio no puede ser negativo.");
                        } else {
                            Circulo circulo = new Circulo(radio); //Objeto
                            System.out.println("El área del círculo es: " + circulo.calcularArea());
                        }
                        break;

                    case 2: // Triángulo
                        System.out.print("Ingrese la base del triángulo: ");
                        double base = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese la altura del triángulo: ");

                        double altura = Double.parseDouble(scanner.nextLine());

                        if (base < 0 || altura < 0) {
                            System.out.println("Error: Las dimensiones no pueden ser negativas.");
                        } else {
                            Triangulo triangulo = new Triangulo(base, altura);// Objeto
                            System.out.println("El área del triángulo es: " + triangulo.calcularArea());
                        }
                        break;

                    case 3: // Rectángulo
                        System.out.print("Ingrese el largo del rectángulo: ");
                        double largo = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese el ancho del rectángulo: ");

                        double ancho = Double.parseDouble(scanner.nextLine());

                        if (largo < 0 || ancho < 0) {
                            System.out.println("Error: Las dimensiones no pueden ser negativas.");
                        } else {
                            Rectangulo rectangulo = new Rectangulo(largo, ancho); // Objeto
                            System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
                        }
                        break;

                    case 4: // Salir
                        System.out.println("¡Gracias por usar la calculadora de áreas!");
                        break; // Cierra el ciclo del while
                    default:
                        System.out.println("Error: Opción no válida.");
                }

                if (opcion == 4) {
                    break; // Rompe el ciclo completo de  while que deberia hacer y lo cierra al sistema
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número válido.");
            } catch (Exception e) {
                System.out.println("Error inesperado");
            }

            System.out.println();
        }

        scanner.close();
    }
}