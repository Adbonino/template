package ar.fiuba.tdd.template;


class Queue  {

    private LinkedList queueList;

    Queue() {
        queueList = new LinkedList();
    }

    public boolean isEmpty() {
        return queueList.isClean();
    }

    int size() {
        return queueList.Size_List();
    }

    void add(Object item) {
        queueList.InsertLast(item);
    }

    public Object top() {
        return queueList.get_Item();
    }

    public void remove() {
        queueList.remove_Item();
    }

    void print_list() {
        queueList.PrintList();
    }


}
