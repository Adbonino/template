package ar.fiuba.tdd.template;


class LinkedList {
    private NodeList firstNode;
    private NodeList lastNode;

    LinkedList() {
        firstNode = lastNode = null;
    }

    void insertLast(Object elem) {
        if (isClean()) {
            firstNode = lastNode = new NodeList(elem);
        }
        else {
            lastNode = lastNode.NextNode = new NodeList(elem);
        }
    }

    boolean isClean() {
        return firstNode == null;
    }

    Object get_Item() {
        return firstNode.item;
    }

    void remove_Item() {
        firstNode = firstNode.NextNode;
    }

    int size_List() {
        NodeList actual = firstNode;
        int count = 0;
        while ( actual != null ) {
            actual = actual.NextNode;
            count++;
        }
        return count;
    }

    void printList() {
        NodeList actual = firstNode;
        while ( actual != null ) {
            System.out.println(actual.item.toString() );
            actual = actual.NextNode;
        }
    }



}
