package SistemaDeAtencion;

public class Paciente extends Persona {

    public Paciente( String nombre, String apellido, int edad, String sexo, String telefono, String correo) {
        super( nombre, apellido, edad, sexo, telefono, correo);
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Correo: " + getCorreo());
    }

}
