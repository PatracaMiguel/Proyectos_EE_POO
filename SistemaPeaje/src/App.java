public class App {
    public static void main(String[] args) throws Exception {
        Peaje peaje = new Peaje("Coatza1","Centro");
        Camion camion = new Camion("PKI-889", 2);
        peaje.agregarVehiculo(camion);
        Moto moto = new Moto("PKI-829");
        peaje.agregarVehiculo(moto);
        Carro carro = new Carro("PLI-899");
        peaje.agregarVehiculo(carro);
        peaje.imprimir();
        System.out.println("Total de peaje: " + peaje.calcularTotalPeaje(camion));
    }
}
