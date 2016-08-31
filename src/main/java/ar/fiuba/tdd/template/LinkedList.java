package ar.fiuba.tdd.template;


class LinkedList {
    private NodeList firstNode;
    private NodeList lastNode;

    private LinkedList nextList;

    void insertLast(Object elem) {
        if (isClean()) {
            firstNode = lastNode = new NodeList(elem);
        } else {
            lastNode = lastNode.nextNode = new NodeList(elem);
        }
    }

    boolean isClean() {
        return firstNode == null;
    }

    Object get_Item() {
        return firstNode.item;
    }

    void remove_Item() {
        firstNode = firstNode.nextNode;
    }

    int size_List() {
        NodeList actual = firstNode;
        int count = 0;
        while ( actual != null ) {
            actual = actual.nextNode;
            count++;
        }
        return count;
    }

    void printList() {
        NodeList actual = firstNode;
        while ( actual != null ) {
            System.out.println(actual.item.toString() );
            actual = actual.nextNode;
        }
    }

}
