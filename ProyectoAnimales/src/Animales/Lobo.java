package Animales;

public class Lobo extends Felino {
    @Override 
    public String getAlimentos(){
        return "Perro: su alimentación es canivora";
    }

    @Override 
    public String getHabitad(){
        return "Perro: su habitad es bosque";
    }

    @Override 
    public String getSonoido(){
        return "Perro: su sonido es ladrido";
    }

    @Override 
    public String getNombreCientifico(){
        return "Perro: Canis lupus";
    }

}
