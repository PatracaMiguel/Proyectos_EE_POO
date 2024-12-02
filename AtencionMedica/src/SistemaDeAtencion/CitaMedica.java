package SistemaDeAtencion;

public class CitaMedica {
    private String mes;
    private String dia;
    private String hora;
    private String motivo;

    public CitaMedica(String mes, String dia, String hora, String motivo, Doctor doctor, Paciente paciente) {
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.motivo = motivo;
    }

    public void detalleCita() {
        System.out.println("Detalle de la cita: ");
        System.out.println("Mes " + getMes() );
        System.out.println("Dia " + getDia() );
        System.out.println("Hora " + getHora() );
        System.out.println("Motivo " + getMotivo() );
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
