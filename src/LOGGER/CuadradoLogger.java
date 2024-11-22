package LOGGER;
import java.util.logging.Logger; // Importamos la libreria Logger para registrar mensajes.

public class CuadradoLogger {
    // Creamos un objeto Logger para registrar mensajes, asociado al nombre de la clase.
    private static final Logger logger = Logger.getLogger(CuadradoLogger.class.getName());

    public static void main(String[] args) {
        double lado = 5.0;
        double area = lado * lado;
        double perimetro = 4 * lado;

        // Registramos el valor del lado del cuadrado.
        logger.info("Lado del cuadrado: " + lado);

        // Registramos el resultado del cálculo del área.
        logger.info("Área del cuadrado: " + area);

        // Registramos el resultado del cálculo del perímetro.
        logger.info("Perímetro del cuadrado: " + perimetro);

        // Con esto se registran mensajes informativos para el lado, el área y el perímetro en la terminal
    }
}




