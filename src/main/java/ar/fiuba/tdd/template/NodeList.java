package ar.fiuba.tdd.template;


public class NodeList {

    private Object item;
    private NodeList nextNode;

    NodeList(Object dato) {
        this(dato, null);
    }

    private NodeList(Object dato, NodeList nodo) {
        item = dato;
        nextNode = nodo;
    }

    Object getItem() {
        return item;
    }

    NodeList getNext_Node() {
        return nextNode;
    }

}
