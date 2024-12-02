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
            System.out.println("Bienvenido al sistema de atencion medica \n ¿Qué desea hacer ?:");
            System.out.println("1. Dar de alta un nuevo doctor");
            System.out.println("2. Dar de alta un nuevo paciente");
            System.out.println("3. Registrar una nueva cita");
            System.out.println("4. Mostrar todas las consultas");
            System.out.println("5. Mostrar todos los doctores");
            System.out.println("6. Mostrar todos los pacientes");
            System.out.println("7. Salir del programa");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese todos los datos del doctor que atenderá la consulta \n   Nombre, Apellido, edad , sexo, Telefono, correo, Turno, salario y  Costo de la consulta");
                    Doctor doctor = new Doctor( entrada.next(), entrada.next(), entrada.nextInt(), entrada.next(), entrada.next(), entrada.next(), entrada.next(), entrada.nextDouble(), entrada.nextDouble());
                    doctores.add(doctor);
                    System.out.println(" Doctor agregado al sistema");
                    break;

                case 2:
                    System.out.println("Ingrese todos los datos del paciente \n   Nombre, Apellido, Edad, Sexo, Telefono y correo");
                    Paciente paciente = new Paciente(  entrada.next(), entrada.next(), entrada.nextInt(), entrada.next(), entrada.next(), entrada.next());
                    pacientes.add(paciente);
                    System.out.println(" Paciente agregado al sistema");
                    break;

                    
                case 3: 
                        System.out.println("Ingrese los datos con el orden  ,mes, dia, hora y motivo de la cita");
                        CitaMedica cita = new CitaMedica(entrada.next(), entrada.next(), entrada.next(), entrada.next(), doctores.get(0), pacientes.get(0));
                        citas.add(cita);
                        System.out.println(" Cita agregada, ok");
                        break;

                case 4:
                        for(int i = 0; i < citas.size(); i++) {
                            citas.get(i).detalleCita();
                        }
                        break;

                case 5:
                        if (doctores.size() == 0) {
                            System.out.println("No hay doctores registrados");
                            break;
                        }else {
                            for (int i = 0; i < doctores.size(); i++) {
                                doctores.get(i).mostrarDatos();
                            }
                                    break;
                                }
                
                case 6:
                        if (pacientes.size() == 0) {
                            System.out.println("No hay pacientes registrados");
                            break;
                        } else {
                            for (int i = 0; i < pacientes.size(); i++) {
                                pacientes.get(i).mostrarDatos();
                            }
                            break;   
                        }
                case 7:
                        System.out.println("Saliendo del programa...");
                        break;
            }
        } while (opcion != 7);
        entrada.close();
    }
}
        
   


