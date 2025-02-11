package com.gentech.test4;

import org.w3c.dom.css.CSS2Properties;

abstract class C1
{
    abstract void display();

}
abstract class C2 extends C1
{
    static void show()
    {
        System.out.println(" show mtd class c2");
    }
}
class C3 extends C2
{

    @Override
    void display() {
        C2.show();
        System.out.println("display mtd class c1");
    }
}
public class Test417 {
    public static void main(String[] args) {
        C3 c = new C3();
        c.display();

    }

}
