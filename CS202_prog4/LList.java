package com.company;

/* CS202 - Jeff McHale - Program 4
            LList.java

The purpose of this class is to generate a linear linked list.
Here, objects of type conditionals, functions, and types will be
contained within the same list. In order to utilize the LLL,
two copies will be made.

1) Contain all C++ statements passed in
2) Contain all converted Python statements

 */




public class LList extends node
{
    private node[] list = new node[1];

    private node head;

    //Default Constructor
    public LList () {}

    //Copy Constructor
    public LList(node hd)
    {
        //super();
        head = hd;
    }

    public node insert (node head)
    {
        return insert (head, head.data);
    }

    //Inserts a node into the linear linked list
    public node insert (node head, Syntax data)
    {
        node[] list = new node[1];

        if (head == null)
        {
            return addNode(data);
        }
        else
            head.next = insert(head.next, data);

        return head;

    }

    //Recurisvely displays all nodes in the list
    public int display()
    {
        node current = head;

        if (current == null)
            return 0;


        current.data.display();

//        String str = data.token;
//       head.data.display();
//        super.display();
//        display (head.next);

        return 1;
    }

}
