package ar.fiuba.tdd.template;


class LinkedList {
    private NodeList FirstNode;
    private NodeList LastNode;

    LinkedList() { FirstNode = LastNode = null; }

    void InsertLast(Object elem) {
        if (IsClean())
            FirstNode = LastNode = new NodeList(elem);
        else
            LastNode = LastNode.NextNode = new NodeList(elem);
    }

    boolean IsClean(){ return FirstNode == null; }

    Object Get_Item() { return FirstNode.Item; }

    void Remove_Item() { FirstNode = FirstNode.NextNode; }

    int Size_List() {
        NodeList actual = FirstNode;
        int Count=0;
        while ( actual != null )
        {
            actual = actual.NextNode;
            Count++;
        }
        return Count;
    }

    void PrintList() {
        NodeList actual = FirstNode;
        while ( actual != null )
        {
            System.out.println(actual.Item.toString() );
            actual = actual.NextNode;
        }
    }



}
