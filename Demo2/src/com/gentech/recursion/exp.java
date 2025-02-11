package com.gentech.recursion;

class Div
{
    static int  mtd1(int a , int b) throws Exception
    {
        if (b<4)
        {
            throw new Exception("invalid");
        }
        return a/b;

    }


}
public class exp {
    public static void main(String[] args) {
        int result =0;
        try
        {
             result = Div.mtd1(16,3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println(result);
        }

    }

}
