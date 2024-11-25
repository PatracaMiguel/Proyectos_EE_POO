import java.util.Scanner;
import Escuela.*;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Section lis301 = new Section();
        int opcion;
        
        do {
            // Mostrar el menú de opciones
            System.out.println("\n1) Agregar");
            System.out.println("2) Buscar");
            System.out.println("3) Borrar");
            System.out.println("4) Imprimir por género");
            System.out.println("5) Imprimir todos");
            System.out.println("6) Salir");
            System.out.print("Ingresa opción: ");
            
            // Leer la opción
            opcion = in.nextInt();

            switch (opcion) {
                case 1: // Agregar estudiante
                    System.out.println("Ingresa Id, Nombre, Edad, Género:");
                    int id = in.nextInt();
                    String nombre = in.next();
                    int edad = in.nextInt();
                    String genero = in.next();
                    
                    Student st = new Student(id, nombre, edad, genero);
                    lis301.addStudent(st);
                    System.out.println("Estudiante agregado, ok");
                    break;

                case 2: // Buscar estudiante
                    System.out.print("Ingresa Id a buscar: ");
                    int idBusqueda = in.nextInt();
                    lis301.searchStudent(idBusqueda);
                    break;

                case 3: // Borrar estudiante
                    System.out.print("Ingresa Id de estudiante a borrar: ");
                    int idBorrar = in.nextInt();
                    lis301.deleteStudent(idBorrar);
                    break;

                case 4: // Imprimir por género
                    System.out.print("Ingresa el género (M/F): ");
                    String generoFiltro = in.next();
                    lis301.imprimirPorGenero(generoFiltro);
                    break;

                case 5: // Imprimir todos los estudiantes
                    System.out.println(lis301.toString());
                    break;

                case 6: // Salir
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 6);

        in.close();
    }
}