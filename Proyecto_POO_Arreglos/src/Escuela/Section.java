package Escuela;

import java.util.ArrayList;

public class Section {
    private String NRC;
    private ArrayList<Student> arrayStu;

    public Section(){
        this.NRC = "21761";
        arrayStu = new ArrayList<>();
    }

    public void addStudent (Student st){
        arrayStu.add(st);
        System.out.println("Estudiante agregado , Ok");
    }

    public void searchStudent(int id){
        for(int i = 0; i < arrayStu.size() ; i++){
            if (id == arrayStu.get(i).getId()) {
                System.out.println("Id: " + arrayStu.get(i).getId());
                System.out.println("Nombre: " + arrayStu.get(i).getName());
                System.out.println("Edad: " + arrayStu.get(i).getAge());
                System.out.println("Género: " + arrayStu.get(i).getGender());
            }

        }
        for (Student student : arrayStu) {
            if (id == student.getId()){

            }
        }
    }

    public void deleteStudent(int id){
        for(int i = 0; i < arrayStu.size() ; i++){
            if (id == arrayStu.get(i).getId()) {
                arrayStu.remove(i);
                System.out.println("Estudiante borrado , Ok");
            }
        }
    }

    @Override
    public String toString() {
        return "Section [NRC=" + NRC + ", arrayStu=" + arrayStu + "]";
    }

    public void imprimirPorGenero(String generoFiltro) {
        System.out.println("Estudiantes del género " + generoFiltro + ":");
        boolean encontrado = false;

        for (Student student : arrayStu) {
            if (student.getGender().equalsIgnoreCase(generoFiltro)) {
                System.out.println(student);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron estudiantes con el género " + generoFiltro + ".");
        }
    }

    
    
}