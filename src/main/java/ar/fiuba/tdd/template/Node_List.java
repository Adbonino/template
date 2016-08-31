package ar.fiuba.tdd.template;


class Node_List <T> {
    T Item;
    Node_List Next_Node;

    Node_List(T dato) { this(dato, null); }

    private Node_List(T dato, Node_List nodo) {
        Item = dato;
        Next_Node = nodo;
    }

    T Get_Item() { return Item; }

    Node_List Get_Next_Node() { return Next_Node; }

}
