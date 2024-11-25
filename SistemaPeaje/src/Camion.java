public class Camion extends Vehiculo {
    static int valorPeajeEje = 5000;
    int numeroEje = 0;


    //Constructor para la clase Camion
    Camion(String placa, int numeroEje) {
        super(placa);
        this.numeroEje = numeroEje;
    }

    //Metodo para obtener el valor del peaje
    //retorna el valor del peaje de la camion
    public int getValorPeajeEje() {
        return valorPeajeEje;
    }

    //Metodo para establecer el valor del peaje
    //@Param Establece el valor del peaje de la camion
    static void setValorPeajeEje(int valorPeajeEje) {
        Camion.valorPeajeEje = valorPeajeEje;
    }

    //Metodo para imprimir la informacion de la camion
    void imprimir() {
        System.out.println("Este es una Camion con placa: " + this.placa);
        System.out.println("El valor del peaje de la camion es: " + valorPeajeEje);
        System.out.println("El numero de ejes de la camion es: " + numeroEje);
    }
    
}
