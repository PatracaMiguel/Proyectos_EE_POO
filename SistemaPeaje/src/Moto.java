public class Moto extends Vehiculo {
    //Variable estatica para el valor del peaje
    static int valorPeaje = 5000;


    //Constructor para la clase Moto
    Moto(String placa) {
        super(placa);
    }  

    //Metodo para obtener el valor del peaje
    //retorna el valor del peaje de la moto
    public int getValorPeaje() {
        return valorPeaje;
    }

    //Metodo para establecer el valor del peaje
    //@Param Establece el valor del peaje de la moto
    static void setValorPeaje(int valorPeaje) {
        Moto.valorPeaje = valorPeaje;
    }


    //Metodo para imprimir la informacion de la moto
    void imprimir (){
        System.out.println("Este es un Moto con placa: " + this.placa);
        System.out.println("El valor del peaje de la moto es: " + valorPeaje);
    }
}
