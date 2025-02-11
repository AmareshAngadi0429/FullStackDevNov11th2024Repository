package com.gentech.test2;
class Return
{
    String mtd1()
    {
        String s = "Amaresh";
        return s;
    }
}
public class Returnstring {
    public static void main(String[] args) {
        Return r = new Return();
        String re = r.mtd1();
        System.out.println(re);
    }
}
