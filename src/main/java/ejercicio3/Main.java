package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Elena", "García"));
        personas.add(new Persona("Pedro", "Martínez"));
        personas.add(new Persona("Ana", "López"));
        personas.add(new Persona("Juan", "Pérez"));

        Persona persona = new Persona("", "");

        List<Persona> nombresQueEmpiezanConE = persona.filtrarPersonas(personas, p -> p.nombre().startsWith("E"));
        System.out.println("Nombres que empiezan con 'E': " + nombresQueEmpiezanConE);

        List<Persona> nombresCuyaCantidadDeLetrasEsPar = persona.filtrarPersonas(personas, p -> p.nombre().length() % 2 == 0);
        System.out.println("Nombres cuya cantidad de letras es par: " + nombresCuyaCantidadDeLetrasEsPar);
    }
}