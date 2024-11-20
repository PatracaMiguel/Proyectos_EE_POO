package Proyecto.src.Animales;
public class Perro extends Canido {
    @Override 
    public String getAlimentos(){
        return "Perro: su alimentación es canivora";
    }

    @Override 
    public String getHabitad(){
        return "Perro: su habitad es doméstico";
    }

    @Override 
    public String getSonoido(){
        return "Perro: su sonido es ladrido";
    }

    @Override 
    public String getNombreCientifico(){
        return "Perro: Canis lupus familiaris ";
    }



}