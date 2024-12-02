package SistemaDeAtencion;

public class Doctor extends Persona {
    private String turno;
    private double salario;
    private double costoConsulta;

    public Doctor(String nombre, String apellido, int edad, String sexo, String telefono, String correo, String turno, double salario, double costoConsulta) {
        super(nombre, apellido, edad, sexo, telefono, correo);
        this.turno = turno;
        this.salario = salario;
        this.costoConsulta = costoConsulta;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Turno: " + getTurno());
        System.out.println("Salario: " + getSalario());
        System.out.println("Costo de la consulta: " + getCostoConsulta());
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
