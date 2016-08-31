package ar.fiuba.tdd.template;

public class Main {
    public static void main(String[] args) {

        System.out.println("This is just a template project");

        Queue cola = new Queue();

        Character caracter = '$';
        Integer entero = 34567;
        String cadena = "Hola";

        cola.add(caracter);
        cola.add(entero);
        cola.add(cadena);
        cola.print_list();
        cola.size();



        System.out.println("Cantidad de elementos: " + cola.size() );

    }

}