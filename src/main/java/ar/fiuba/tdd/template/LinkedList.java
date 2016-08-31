package ar.fiuba.tdd.template;


class LinkedList {
    private NodeList firstNode;
    private NodeList lastNode;

    LinkedList() {
        firstNode = lastNode = null;
    }

    void InsertLast(Object elem) {
        if (isClean()) {
            firstNode = lastNode = new NodeList(elem); }
        else {
            lastNode = lastNode.NextNode = new NodeList(elem);
        }
    }

    boolean isClean() {
        return firstNode == null;
    }

    Object get_Item() {
        return firstNode.Item;
    }

    void remove_Item() {
        firstNode = firstNode.NextNode;
    }

    int Size_List() {
        NodeList actual = firstNode;
        int count=0;
        while ( actual != null ) {
            actual = actual.NextNode;
            count++;
        }
        return count;
    }

    void PrintList() {
        NodeList actual = firstNode;
        while ( actual != null ) {
            System.out.println(actual.Item.toString() );
            actual = actual.NextNode;
        }
    }



}
