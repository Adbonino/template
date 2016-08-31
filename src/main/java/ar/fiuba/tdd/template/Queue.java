package ar.fiuba.tdd.template;


class Queue  {

    private Linked_List Queue_List;

    Queue() {  Queue_List = new Linked_List(); }

    public boolean isEmpty() { return Queue_List.IsClean(); }

    int size() { return Queue_List.Size_List(); }

    void add(Object item) { Queue_List.Insert_Last(item);  }

    public Object top() { return Queue_List.Get_Item();   }

    public void remove() { Queue_List.Remove_Item(); }

    void print_list() { Queue_List.Print_List(); }


}
