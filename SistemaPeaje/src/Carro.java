public class Carro extends Vehiculo {
    static int valorPeaje = 10000;

    //Constructor para la clase Carro  
    Carro(String placa) {
        super(placa); //invoca al constructor de la clase Vehiculo
    }

    //Metodo para obtener el valor del peaje
    //retorna el valor del peaje del carro
    public int getValorPeaje() {
        return valorPeaje;
    }

    //Metodo para establecer el valor del peaje
    //@Param Establece el valor del peaje del carro
    static void setValorPeaje(int valorPeaje) {
        Carro.valorPeaje = valorPeaje;
    }

    //Metodo para imprimir la informacion del carro
    void imprimir() {
        System.out.println("Este es un Carro con placa: " + this.placa);
        System.out.println("El valor del peaje del carro es: " + valorPeaje);
    }
}
