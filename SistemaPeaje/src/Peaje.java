import java.util.*;

public class Peaje {
    String nombre;
    String departamento;
    Vector<Vehiculo> vehiculos;
    int totalRecaudado = 0;
    static int totalCamiones = 0;
    static int totalMotos = 0;
    static int totalCarros = 0;

    //Constructor para la clase Peaje
    Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new Vector<>(); //Se crea el vector de vehiculos
    }

    public String getNombre() {
        return nombre;
    }

    //Metodo que establece el nombre de la estacion de peaje
    //@Param Establece el nombre de la estacion de peaje
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo que establece el departamento de la estacion de peaje
    //@Param Establece el departamento de la estacion de peaje
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //metodo que devuelve el departamento de la estacion de peaje
    //@return Devuelve el departamento de la estacion de peaje
    public String getDepartamento() {
        return departamento;
    }

    //metodo que permite agregar un vehiculo a la estacion de peaje
    //@Param Agrega un vehiculo a la estacion de peaje
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    //metodo que calcula el total de peaje de la estacion de peaje
    //@return Devuelve el total de peaje de la estacion de peaje
    public int calcularTotalPeaje(Vehiculo vehiculo) {
        if (vehiculo instanceof Camion) { //Si el vehiculo es un camion
            totalCamiones++; //Se incrementa el total de camiones
            Camion camion = (Camion) vehiculo;
            totalRecaudado += Camion.valorPeajeEje * camion.numeroEje; //Se incrementa el total de peaje de la camion   
            return camion.numeroEje * Camion.valorPeajeEje; //Se devuelve el total de peaje del camion

        } else if (vehiculo instanceof Moto) { //Si el vehiculo es una moto
            totalMotos++;//Se incrementa el total de motos}
            totalRecaudado += ((Moto) vehiculo).getValorPeaje(); //Se incrementa el total de peaje de la moto
            return ((Moto) vehiculo).getValorPeaje(); //Se devuelve el total de peaje de la moto

        } else if (vehiculo instanceof Carro) { //Si el vehiculo es un carro
            totalCarros++; //Se incrementa el total de carros
            totalRecaudado += ((Carro) vehiculo).getValorPeaje(); //Se incrementa el total de peaje de la carro
            return ((Carro) vehiculo).getValorPeaje(); //Se devuelve el total de peaje de la carro
        } else return -1; 
    }

    //metodo que imprime la informacion de la estacion de peaje
    public void imprimir() {
        System.out.println("Estacion de peaje: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Total de camiones: " + totalCamiones);
        System.out.println("Total de motos: " + totalMotos);
        System.out.println("Total de carros: " + totalCarros);
        System.out.println("Total de peaje: " + totalRecaudado);
        System.out.println("Vehiculos: ");
       
    }
}
