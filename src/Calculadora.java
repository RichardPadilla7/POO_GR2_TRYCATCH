import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // TRY CATCH
            try {
                // Mostrar el menú de opciones
                System.out.println("Seleccione la figura geométrica para calcular su área o perímetro:");
                System.out.println("1. Área del Círculo");
                System.out.println("2. Perímetro del Círculo");
                System.out.println("3. Área del Triángulo");
                System.out.println("4. Perímetro del Triángulo");
                System.out.println("5. Área del Rectángulo");
                System.out.println("6. Perímetro del Rectángulo");
                System.out.println("7. Salir");
                System.out.print("Opción: ");
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1: // Área del Círculo
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = Double.parseDouble(scanner.nextLine());
                        Circulo circulo = new Circulo(radio);
                        System.out.println("El área del círculo es: " + circulo.calcularArea());
                        break;

                    case 2: // Perímetro del Círculo
                        System.out.print("Ingrese el radio del círculo: ");
                        radio = Double.parseDouble(scanner.nextLine());
                        circulo = new Circulo(radio);
                        System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());
                        break;

                    case 3: // Área del Triángulo
                        System.out.print("Ingrese la base del triángulo: ");
                        double base = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese la altura del triángulo: ");
                        double altura = Double.parseDouble(scanner.nextLine());
                        Triangulo triangulo = new Triangulo(base, altura, 0, 0);
                        System.out.println("El área del triángulo es: " + triangulo.calcularArea());
                        break;

                    case 4: // Perímetro del Triángulo
                        System.out.print("Ingrese el lado 1 del triángulo: ");
                        double lado1 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese el lado 2 del triángulo: ");
                        double lado2 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese la base del triángulo: ");
                        base = Double.parseDouble(scanner.nextLine());
                        triangulo = new Triangulo(base, 0, lado1, lado2);
                        System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
                        break;

                    case 5: // Área del Rectángulo
                        System.out.print("Ingrese el largo del rectángulo: ");
                        double largo = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese el ancho del rectángulo: ");
                        double ancho = Double.parseDouble(scanner.nextLine());
                        Rectangulo rectangulo = new Rectangulo(largo, ancho);
                        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
                        break;

                    case 6: // Perímetro del Rectángulo
                        System.out.print("Ingrese el largo del rectángulo: ");
                        largo = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese el ancho del rectángulo: ");
                        ancho = Double.parseDouble(scanner.nextLine());
                        rectangulo = new Rectangulo(largo, ancho);
                        System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
                        break;

                    case 7: // Salir
                        System.out.println("¡Gracias por usar la calculadora de áreas y perímetros!");
                        break;

                    default:
                        System.out.println("Error: Opción no válida.");
                }

                if (opcion == 7) {
                    break;
                }

                // captura excepciones relacionadas con la conversión de cadenas a números
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número válido.");

                // Captura cualquier otra excepción no manejada específicamente.
            } catch (Exception e) {
                System.out.println("Hubo un error!. Intente de nuevo.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
