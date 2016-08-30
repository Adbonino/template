package ar.fiuba.tdd.template;

public class Node_List <T>{
    T Item;
    Node_List Next_Node;

    Node_List(T objeto) { this(objeto, null); }

    Node_List(T  objeto, Node_List node){
        Item = objeto;
        Next_Node = node;
    }

    T Get_Object(){ return Item; }

    Node_List Get_next(){return Next_Node;}
}
