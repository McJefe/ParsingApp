package com.company;
import java.util.Scanner;

/* CS202 - Jeff McHale - Program 4
            node.java

The purpose of this class is to create nodes to be stored in
the linear linked list. Through upcasting, the correct object is
dynamically bound at runtime, with its correct functions being called
to work on a specific statement (conditional, function, type)

 */

public class node extends Token
{
    //Reference to base class
    protected Syntax data;
    node next;

    //Default Constructor
    public node() {}

    //Copy Constructor
    public node (Syntax value)
    {
       this.data = value;

        //next = null;
    }

    //Test
    @Override
    public String toString()
    {
        return getClass().getSimpleName() + "[data.token]";
    }

    //Creates a new node to be added in the list
    public node addNode (Syntax data)
    {

        node newNode = new node(data);
        copyNode(newNode);

        return newNode;
    }

    public int copyNode (node toCopy)
    {

        this.data = toCopy.data;

        return 1;
    }



    //Where upcasting takes place. User will input
    //which type of c++ statement they'd like to convert to python
    public node setData (int branch)
    {
        String value;

        Scanner in = new Scanner (System.in);

        //Conditional statement syntax
        if (branch == 1)
        {
            System.out.println ("Enter a Conditional statement");
//            Scanner in = new Scanner (System.in);
            value = in.nextLine();

            Conditionals obj = new Conditionals(value);
            obj.inputData(value);

            //Returns string to be parsed
            obj.parseData(tokenize(value));
            node Node = new node(obj);
            System.out.println("The c++ statement entered was: ");
            Node.display(obj);
            return Node;
        }
        //Function prototype syntax
        else if (branch == 2)
        {
            System.out.println ("Enter a function prototype");
//            Scanner in = new Scanner (System.in);
            value = in.nextLine();

            Functions obj = new Functions(value);
            obj.inputData(value);

            //Returns string to be parsed
            obj.parseData(tokenize(value));
            node Node = new node(obj);
            System.out.println("The c++ statement entered was: ");
            Node.display(obj);
            return Node;
        }
        //Data type declaration syntax
        else if (branch == 3)
        {
            System.out.println ("Enter a data type");
//            Scanner in = new Scanner (System.in);
            value = in.nextLine();

            Types obj = new Types(value);
            obj.inputData(value);

            //Returns string to be parsed
            obj.parseData(tokenize(value));
            node Node = new node(obj);
            System.out.println("The c++ statement entered was: ");
            Node.display(obj);
            return Node;
        }

    //If None of the three types are selected, return null
    return null;
    }



    //Displays data within given node
    public void display(Syntax data)
    {
        data.display();

    }
}




