package com.gentech.mine;
import static java.lang.System.*;


class Rectangle
{
    private int l;
    private  int b;

    public int getB() {
        return b;
    }
    public void setL(int l){
        this.l = l;
    }
    public int getL(){
        return l;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int area()
    {
        return l*b;
    }
}
interface One
{
    int x=10;
    int setA(int a);
    default void show()
    {
        out.println("hiii");
    }
}
abstract class b
{   int x ;
    abstract int getX(int x);
}
class c extends b implements One{
    int a;
    @Override
    public int setA(int a) {
        this.a=a;
        return a;
    }

    @Override
    int getX(int x) {
        return x;
    }
}
interface Vehicle {
    void changeGear();

    void speedUp();

    void applyBrakes();
}


class Bicycle implements Vehicle{

    private int speed;
    private int gear;

    

    @Override
    public void changeGear() {

    }

    @Override
    public void speedUp() {
        speed +=speed;
        out.println(speed);

    }

    @Override
    public void applyBrakes() {

    }

    public void setSpeed(int speed) {
        this.speed=speed;
    }
}

class Bike implements Vehicle {

    private  int speed;
    private  int gear;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void changeGear() {
        gear +=gear;
        out.println(gear);
    }

    @Override
    public void speedUp() {
        speed +=speed;
        out.println(gear);
    }

    @Override
    public void applyBrakes() {
        speed-=speed;
        out.println(speed);
    }
}
public class Exm {
    public static void main(String[] args) {

       c m = new c();
       m.show();




    }
}
class parent{
    public  void name()
    {
        out.println("Amaresh");
    }
}
class child extends parent{
    @Override
    public void name()
    {
        out.println("Rishi");
    }
}
