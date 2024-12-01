import SistemaDeAtencion.CitaMedica;
import SistemaDeAtencion.Doctor;
import SistemaDeAtencion.Paciente;

import java.util.*;


public class SistemaAtencionMedica {
    public static void main(String[] args) {
        
        ArrayList<Doctor> doctores = new ArrayList<Doctor>();
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        ArrayList<CitaMedica> citas = new ArrayList<CitaMedica>();

        Scanner entrada = new Scanner(System.in);
        int opcion;
       
        do{
            System.out.println("--- Sistema de Atencion Medica --- \n Hospital Comunitario Coatzacoalcos");
            System.out.println("Bienvenido al sistema de atencion medica \n Elija una de las siguientes opciones");
            System.out.println("1. Registrar un  doctor");
            System.out.println("2. Registrar un  paciente");
            System.out.println("3. Registrar una consulta");
            System.out.println("4. Mostrar todas las consultas");
            System.out.println("5. Mostrar todos los doctores");
            System.out.println("6. Mostrar todos los pacientes");
            System.out.println("7. Salir del programa");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese todos los datos del doctor \n  ID, Nombre, Apellido, edad , sexo, Telefono, correo, Turno, salario y  Costo de la consulta");
                    Doctor doctor = new Doctor(entrada.nextInt(), entrada.next(), entrada.next(), entrada.nextInt(), entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.nextDouble(), entrada.nextDouble());
                    doctores.add(doctor);
                    System.out.println(" Doctor agregado, ok");
                    break;

                case 2:
                    System.out.println("Ingrese todos los datos del paciente \n  ID, Nombre, Apellido, Edad, Sexo, Telefono y correo");
                    Paciente paciente = new Paciente( entrada.nextInt(), entrada.next(), entrada.next(), entrada.nextInt(), entrada.next(), entrada.next(), entrada.next());
                    pacientes.add(paciente);
                    System.out.println(" Paciente agregado, ok");
                    break;

                case 3:
                    if (doctores.size() == 0) {
                        System.out.println("No hay doctores registrados");
                        break;
                    }else {
                            if (pacientes.size() == 0) {
                                System.out.println("No hay pacientes registrados");
                                break;
                            } else {
                                System.out.println("Ingrese los datos con el orden  ID, dia, hora y motivo de la cita");
                                CitaMedica cita = new CitaMedica(entrada.nextInt(), entrada.next(), entrada.next(), entrada.next(), pacientes.get(0), doctores.get(0));
                                citas.add(cita);
                                System.out.println(" Cita agregada, ok");
                                break;
                            }
                        }
                case 4:
                        for(int i = 0; i < citas.size(); i++) {
                            citas.get(i).detalleCita();
                }
                    break;
                
                case 5:
                    for (int i = 0; i < doctores.size(); i++) {
                        doctores.get(i).mostrarDatos();
                    }
                    break;   
                
                case 6:
                    for (int i = 0; i < pacientes.size(); i++) {
                        pacientes.get(i).mostrarDatos();
                    }
                    break;
                
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 7);
        entrada.close();
    }
}
        
   


