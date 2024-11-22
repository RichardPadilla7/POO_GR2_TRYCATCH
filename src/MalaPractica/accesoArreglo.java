package MalaPractica;

public class accesoArreglo {

    public void accederElemento(int[] arreglo, int indice){
        try{
            //Se intenta acceder al elemento con el indice especificado
            int elemento = arreglo[indice];
            System.out.println("Elemento: " + elemento);
        } catch (ArrayIndexOutOfBoundsException e) {
            //Maneja la excepcion en el caso que el indice este fuera del rango
            System.err.println("ERROR: INDICE FUERA DEL RANGO");
        }
    }

    public static void main(String[] args) {
        accesoArreglo obj = new accesoArreglo();

        //ARRAY DE EJEMPLO
        int[] arregloEjemplo = {10,20,30,40,50,60};

        //INDICE VALIDO
        obj.accederElemento(arregloEjemplo,3);
        //INDICE NO VALIDO
        obj.accederElemento(arregloEjemplo,6);
    }
}