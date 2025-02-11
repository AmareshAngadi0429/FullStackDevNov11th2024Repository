package com.gentech.test4;
interface I5
{
    int x = 10;
    int y =10;
    int z = 10;

}
interface I6
{
    int a = 11;
    int b = 11;
    int c = 11;

}
class Tes416
{
    Tes416()
    {
        System.out.println(I6.a+" "+I6.b+" "+I6.c+" "+I5.x+ " "+I5.y+" "+I5.z);
    }
}
public class Test416 {
    public static void main(String[] args) {
        Tes416 t = new Tes416();
    }
}
