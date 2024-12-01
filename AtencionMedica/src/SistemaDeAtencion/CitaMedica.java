package SistemaDeAtencion;


public class CitaMedica {
    private int citaID;
    private String dia;
    private String hora;
    private String motivo;
    private Paciente paciente;
    private Doctor doctor;

    public CitaMedica( int id, String dia, String hora, String motivo, Paciente paciente, Doctor doctor) {
        this.citaID = id;
        this.dia = dia;
        this.hora = hora;
        this.motivo = motivo;
        this.paciente = paciente;
        this.doctor = doctor;
        citaID++;
    }

    public void detalleCita()  {
        System.out.println("Detalle de la cita");
        System.out.println("Id: " + getId());
        System.out.println("Dia: " + getDia());
        System.out.println("Hora: " + getHora());
        System.out.println("Motivo: " + getMotivo());
        System.out.println("Paciente: " + paciente.getNombre() + ", Edad: " + paciente.getEdad());
        System.out.println("Doctor: " + doctor.getNombre() );
    }

    public int getId() {
        return citaID;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHora() {
        return hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }


    public Paciente getPaciente() {
        return paciente;
    }


    public Doctor getDoctor() {
        return doctor;
    }


    public int getCitaID() {
        return citaID;
    }


    
    
    
    
}