package BuenaPractica;

public class accesoArreglo {

    public void accederElemento(int[] arreglo, int indice){
        if(indice>=0 && indice<arreglo.length){
            int elemento = arreglo[indice];
            System.out.println("El elemento en la posicion "+indice+" es: "+elemento);
        }
        else{
            System.out.println("El elemento no se encuentra entre los indices del arreglo");
        }
    }

    public static void main(String[] args) {
        accesoArreglo obj = new accesoArreglo();

        int[] arreglo1={1,2,3,4,5,6,7,8,9,10};

        obj.accederElemento(arreglo1,7);

        obj.accederElemento(arreglo1,11);
    }
}