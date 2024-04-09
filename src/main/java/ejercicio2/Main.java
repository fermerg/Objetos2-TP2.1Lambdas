package ejercicio2;

public class Main {
    public static void main(String[] args) {
        AprendiendoLambdas unnombre = new AprendiendoLambdas();

        unnombre.unMetodo(s -> s.length() %2 == 0);
        unnombre.unMetodo(s -> s.startsWith("a"));
    }
}

//Escriba una clase Main para poder llamar al metodo AprendiendoLambdas#unMetodo(C c) de la
//siguiente forma:
//a. Utilizando un lambda dado que imprima true si el largo del String es par, false en caso contrario.
//b. Utilizando un lambda dado que imprima true si el String empieza con a minúscula, false en caso
//contrario.
