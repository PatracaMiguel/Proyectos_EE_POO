package Proyecto.src.Animales;
public class Gato extends Felino {
    @Override 
    public String getAlimentos(){
        return "Gato: su alimentación es canivora";
    }

    @Override 
    public String getHabitad(){
        return "Gato: su habitad es doméstico";
    }

    @Override 
    public String getSonoido(){
        return "Gato: su sonido es maullido";
    }

    @Override 
    public String getNombreCientifico(){
        return "Gato: miau";
    }

}