package com.demo.language;

import com.demo.Main;

public class VariablesDemo {
    public static final double PI = 3.14;
    public static void main(String[] args) {
//        String[] myArgs = new String[2];
//        myArgs[0]="Its";
//        myArgs[1]="Friday";
//        Main.main(myArgs);
        String filename ="data\\output.txt";
        boolean  found = true;
        //sout press tab
        System.out.println(filename + " was found :" + found );
        demoOps();
        demoCast();
    }
    public static void demoOps()
    {
        int i =9;
        int result = 10+  ++i;
        System.out.println(result);//20,10
    }

    public static void demoCast()
    {
        byte num1=10;
        byte num2=20;
        byte result = (byte) (num1 + num2);//cast
        System.out.println(result);


    }
}
