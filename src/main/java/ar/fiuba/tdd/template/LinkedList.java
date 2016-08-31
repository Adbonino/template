package ar.fiuba.tdd.template;


class LinkedList {
    private NodeList _FirstNode$;
    private NodeList _LastNode;

    LinkedList() {
        _FirstNode$ = _LastNode = null;
    }

    void InsertLast(Object elem) {
        if (IsClean()) {
            _FirstNode$ = _LastNode = new NodeList(elem);
        }
        else {
            _LastNode = _LastNode.NextNode = new NodeList(elem);
        }
    }

    boolean IsClean(){
        return _FirstNode$ == null;
    }

    Object Get_Item() {
        return _FirstNode$.Item;
    }

    void Remove_Item() {
        _FirstNode$ = _FirstNode$.NextNode;
    }

    int Size_List() {
        NodeList actual = _FirstNode$;
        int Count=0;
        while ( actual != null )
        {
            actual = actual.NextNode;
            Count++;
        }
        return Count;
    }

    void PrintList() {
        NodeList actual = _FirstNode$;
        while ( actual != null )
        {
            System.out.println(actual.Item.toString() );
            actual = actual.NextNode;
        }
    }



}
