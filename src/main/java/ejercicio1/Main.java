package ejercicio1;

public class Main {
    public static void main(String[] args) {
        AprendiendoLambdas a = new AprendiendoLambdas();

        //1
        a.unMetodo((b) -> {
            System.out.println("abcd" + b);
        });

        //2
        a.unMetodo(() -> System.out.println("abcd"));

        //3
        a.unMetodo((variable) -> {
            System.out.println("abcd");
        });

        //4
        a.unMetodo((String variable) ->{
            System.out.println("abcd");
            return true;
        });

        //5
        a.unMetodo((Long variable) -> {
            System.out.println("abcd");
            return 10L;
        });
    }
}

//1. - Se llama al método `unMetodo(B b)` de la clase `AprendiendoLambdas`.
//   - El parámetro `b` en la expresión lambda es de tipo `B`, por lo que se invoca el método `metodo(String b)` de la interfaz `B`.

//2. - Se invoca el método `metodo()` de la interfaz `A`.
//   - La expresión lambda no toma ningún parámetro y no especifica ningún tipo, por lo que se deduce que es compatible con la interfaz `A`.
//
//3. - Se llama al método `unMetodo(A a)` de la clase `AprendiendoLambdas`.
//   - La expresión lambda toma un parámetro `variable`, pero no especifica ningún tipo, por lo que se deduce que es compatible con la interfaz `A`.
//   - Se invoca el método `metodo()` de la interfaz `A`.
//
//4. - La expresión lambda toma un parámetro `variable` de tipo `String`.
//   - La expresión lambda es compatible con la interfaz `C` porque tiene un método que toma un `String` como parámetro y devuelve un booleano.
//   - Se invoca el método `metodo(String c)` de la interfaz `C`.
//
//5. - Se llama al método `unMetodo(D<Long, Long> d)` de la clase `AprendiendoLambdas`.
//   - La expresión lambda toma un parámetro `variable` de tipo `Long`.
//   - La expresión lambda es compatible con la interfaz `D<Long, Long>` porque tiene un método que toma un `Long` como parámetro y devuelve un `Long`.