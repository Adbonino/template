package ar.fiuba.tdd.template;


public interface Queue <T>{
    boolean isEmpty(); //OK
    int size();
    void add(T item);
    T top(); //retornar el primer item, lanzar exception si esta vacia.
    void remove(); //remover el primer item, lanzar exception si esta vacia.
}
