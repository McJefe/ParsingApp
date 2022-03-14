package com.company;


/* CS202 - Jeff McHale - Program 4
          Functions.java

The purpose of this derived class is to manage function prototype
definitions. Here, a function prototype in c++ will be inputted
and converted to a python function prototype.

 */

public class Functions extends Syntax
{
    private String value;
    private String [] parseString;

    //Default Constructor
    public Functions() {}

    //Copy Constructor
    public Functions(String data)
    {
        super.token = data;
    }

    //String to be converted will be set to base class' field
    public String inputData (String value)
    {
        super.token = value;

        return super.token;
    }

    //Takes in a string to convert into python
    public String [] parseData (String [] value)
    {
        String [] str = new String [value.length];

        int count = 0;

        //Array of strings is iterated over, replacing values
        //in each index when necessary
        for (int i = 0; i < value.length; ++i)
        {

            //Janky solution. Python function prototypes only define what 'type' it is
            //at the beginning of the function (I.E. types are not defined for variables)
            //If count is greater than 1, then we know we've replaced the first type declaration
            //in the supplied c++ statement. Thus making corresponding types turn into ""

                if (value[i].equals("int") || value[i].equals("char") || value[i].equals("bool")
                        || value[i].equals("void)") || value[i].equals("float") || value[i].equals("double"))
                {
                    ++count;

                    if (count == 1) {
                        value[i] = "def";
                    } else
                        value[i] = "";
                }

            //Semicolon
            if (value[i].equals(";"))
                value[i] = ":";
            //Logicals
            if (value[i].equals("||"))
                value[i] = "or";
            if (value[i].equals("&&"))
                value[i] = "and";
            //Braces
            if (value[i].equals("{") || value[i].equals("}"))
                value[i] = "";


            //Anything that isn't parsed is copied over as is
            str[i] = (value[i]);
        }


        return str;

    }

    //Checks if inputted string is legal c++
    public boolean checkValue()
    {
        return true;
    }

    //Displays data field
    public void display()
    {
        super.display();
    }
}
