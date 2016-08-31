package ar.fiuba.tdd.template;

public class LinkedList {

    private NodeList _firstNode;
    private NodeList _lastNode;

    public LinkedList() {
        _firstNode = _lastNode = null ;
    }

    Object get_Item() {
        return _firstNode.getItem();
    }


    boolean isClean() {
        return _firstNode == null;
    }





}
