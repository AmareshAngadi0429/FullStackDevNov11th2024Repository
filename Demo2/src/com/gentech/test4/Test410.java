package com.gentech.test4;
class Chrome implements Url
{
    @Override
    public void navi()
    {
        System.out.println("through chrome");
    }

}
class FireFox implements Url
{
    @Override
    public void navi()
    {
        System.out.println("through Firefox");
    }
}
class Edge implements Url
{
    @Override
    public void navi()
    {
        System.out.println("through Edge");
    }
}
interface Url
{
    void navi();
}
public class Test410 {
    public static void main(String[] args) {
        Url u;
        Chrome c = new Chrome();
        u=c;
        u.navi();

        Edge e = new Edge();
        u=e;
        e.navi();

        FireFox f = new FireFox();
        u=f;
        u.navi();
    }
}
