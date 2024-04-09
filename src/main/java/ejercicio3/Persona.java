package ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String nombre() {
        return nombre;
    }

    public String apellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
    }
    public List<Persona> filtrarPersonas(List<Persona> personas, Condicion condicion) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : personas) {
            if (condicion.seCumple(persona)) {
                resultado.add(persona);
            }
        }
        return resultado;
    }
}

