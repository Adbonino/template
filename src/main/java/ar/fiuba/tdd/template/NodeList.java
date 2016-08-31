package ar.fiuba.tdd.template;


class NodeList {
    Object Item;
    NodeList NextNode;

    NodeList(Object dato) {
        this(dato, null);
    }

    private NodeList(Object dato, NodeList nodo) {
        Item = dato;
        NextNode = nodo;
    }

    Object GetItem() {
        return Item;
    }

    NodeList GetNext_Node() {
        return NextNode;
    }


}
