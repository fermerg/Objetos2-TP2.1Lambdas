package ejercicio1;

public class AprendiendoLambdas {
    public void unMetodo(A a) {
        a.metodo();
        System.out.println("se invoco metodo a /n");
    }
    public void unMetodo(B b) {
        b.metodo("unString");
        System.out.println("se invoco el metodo b /n");
    }
    public void unMetodo(C c) {
        System.out.println(c.metodo("otroString") ? "true" : "false");
        System.out.println("se inv el c /n");
    }
    public void unMetodo(D<Long, Long> d) {
        d.metodo(10L);
        System.out.println("se invoko el d /n");
    }
}
