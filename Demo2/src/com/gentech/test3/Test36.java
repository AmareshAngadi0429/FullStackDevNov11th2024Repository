package com.gentech.test3;
class Tes61
{
    {
        System.out.println("this is a instance block of 1st class");
    }

}
class Tes62
{

    {

        Tes61 t = new Tes61();
        System.out.println("this is instance of sub class");
    }
}
public class Test36 {
    public static void main(String[] args) {
        Tes62 t = new Tes62();

    }
}
