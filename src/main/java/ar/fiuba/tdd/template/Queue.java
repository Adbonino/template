package ar.fiuba.tdd.template;


class Queue  {

    private LinkedList QueueList;

    Queue() {  QueueList = new LinkedList(); }

    public boolean isEmpty() {
        return QueueList.IsClean();
    }

    int size() {
        return QueueList.Size_List();
    }

    void add(Object item) {
        QueueList.InsertLast(item);
    }

    public Object top() {
        return QueueList.Get_Item();
    }

    public void remove() {
        QueueList.Remove_Item();
    }

    void print_list() {
        QueueList.PrintList();
    }


}
