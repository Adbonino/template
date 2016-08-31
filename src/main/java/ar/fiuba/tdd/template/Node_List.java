package ar.fiuba.tdd.template;


class Node_List  {
    Object Item;
    Node_List Next_Node;

    Node_List(Object dato) { this(dato, null); }

    private Node_List(Object dato, Node_List nodo) {
        Item = dato;
        Next_Node = nodo;
    }

    Object Get_Item() { return Item; }

    Node_List Get_Next_Node() { return Next_Node; }

}
