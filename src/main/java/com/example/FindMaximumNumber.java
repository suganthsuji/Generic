package com.example;

public class FindMaximumNumber {
    /*
    Function to Find the Maximum Integer Value b/w  a, b  and c
     */
    void findMaxInteger(Integer a , Integer b ,Integer c)
    {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
        {
            System.out.println("A is Maximum Value");
        }
        else if (b.compareTo(c) > 0 && b.compareTo(a) > 0)
        {
            System.out.println("B is Maximum Value");
        }
        else if (c.compareTo(a) > 0 && c.compareTo(b) > 0)
        {
            System.out.println("C is Maximum Value");
        }
        else
        {
            System.out.println("All Values are Equal");
        }
    }
    void findMaxFloat(Float a,Float b,Float c){

        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
        {
            System.out.println("D is Maximum Value\n");
        }
        else if (b.compareTo(c) > 0 && b.compareTo(a) > 0)
        {
            System.out.println("E is Maximum Value\n");
        }
        else if (c.compareTo(a) > 0 && c.compareTo(b) > 0)
        {
            System.out.println("F is Maximum Value\n");
        }
        else
        {
            System.out.println("All Values are Equal\n");
        }
    }

}
