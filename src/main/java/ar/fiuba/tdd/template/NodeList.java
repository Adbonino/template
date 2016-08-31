package ar.fiuba.tdd.template;


class NodeList {
    Object item;
    NodeList NextNode;

    NodeList(Object dato) {
        this(dato, null);
    }

    private NodeList(Object dato, NodeList nodo) {
        item = dato;
        NextNode = nodo;
    }

    Object GetItem() {
        return item;
    }

    NodeList GetNext_Node() {
        return NextNode;
    }


}
