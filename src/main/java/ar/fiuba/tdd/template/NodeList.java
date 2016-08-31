package ar.fiuba.tdd.template;


class NodeList {

    Object item;
    NodeList nextNode;

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
