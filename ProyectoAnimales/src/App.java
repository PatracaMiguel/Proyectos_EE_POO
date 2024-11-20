import Animales.*;

public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animales  = new Animal[3];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Lobo();

        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].getAlimentos());
            System.out.println(animales[i].getHabitad());
            System.out.println(animales[i].getSonoido());
            System.out.println(animales[i].getNombreCientifico());
        }
    }
}
