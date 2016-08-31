package ar.fiuba.tdd.template;


class Linked_List  {
    private Node_List First_Node;
    private Node_List Last_Node;

    Linked_List() { First_Node = Last_Node = null; }

    void Insert_Last(Object elem) {
        if (IsClean())
            First_Node = Last_Node = new Node_List(elem);
        else
            Last_Node = Last_Node.Next_Node = new Node_List(elem);
    }

    boolean IsClean(){ return First_Node == null; }

    Object Get_Item() { return First_Node.Item; }

    void Remove_Item() { First_Node = First_Node.Next_Node; }

    int Size_List() {
        Node_List actual = First_Node;
        int Count=0;
        while ( actual != null )
        {
            actual = actual.Next_Node;
            Count++;
        }
        return Count;
    }

    void Print_List() {
        Node_List actual = First_Node;
        while ( actual != null )
        {
            System.out.println(actual.Item.toString() );
            actual = actual.Next_Node;
        }
    }



}
