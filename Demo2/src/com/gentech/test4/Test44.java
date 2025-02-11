package com.gentech.test4;
class Test411
{
    String name;
    void mtd(String name)
    {
        System.out.println("super class mtd"+name);
    }
}
class Test412 extends Test411
{
    String name;
    Test412(String superName)
    {
        super.name = superName;
        super.mtd(superName);
    }
    void mtd(String name)
    {
        System.out.println("subclss name "+name);
    }
}
public class Test44 {
    public static void main(String[] args) {
        Test412 t = new Test412("Superclass");
        t.mtd("Subclass");
    }
}
