package com.gentech.Inheritance;
class Parent
{
    Parent(String fathername,String mothername,String surname)
    {
        System.out.println("Father name : "+fathername);
        System.out.println("Mother name : "+mothername);
        System.out.println("Sur name : "+ surname);
    }
}
class Child extends Parent
{
    Child(String fathername,String mothername,String surname,String selfname)
    {
        super(fathername, mothername, surname);
        System.out.println("Child name is : "+selfname);
    }
}
class GrandChild extends Child
{
    GrandChild(String fathername,String mothername,String surname,String selfname,String gchildname)
    {
        super(fathername,mothername,surname,selfname);
        System.out.println("Grandchild name is : "+gchildname);
    }
}

public class MultilevelWithSuperClassContainingParaConst {
    public static void main(String[] args) {
        GrandChild g = new GrandChild("james","sophia","George","Jacob","Candy");


    }
}
