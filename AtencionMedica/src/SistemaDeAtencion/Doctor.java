package SistemaDeAtencion;

public class Doctor {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String telefono;
    private String correo;
    private String turno;
    private double salario;
    private double costoConsulta;

    public Doctor( int id, String nombre, String apellido, int edad, String sexo, String telefono, String correo, String turno, double salario, double costoConsulta) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correo = correo;
        this.turno = turno;
        this.salario = salario;
        this.costoConsulta = costoConsulta;
    }

    public void mostrarDatos() {
        System.out.println("Id: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apello: " + getApello());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("Correo " + getCorreo());
        System.out.println("Turno: " + getTurno());
        System.out.println("Salario: " + getSalario());
        System.out.println("Costo de la consulta: " + getCostoConsulta());
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApello() {
        return apellido;
    }

    public void setApello(String apello) {
        this.apellido = apello;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
