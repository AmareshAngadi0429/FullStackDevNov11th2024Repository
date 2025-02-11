package com.gentech.VoidMethods;

class ConcatString
{
    void ConStg(String[] s)
    {
        String result = "";
        for (int i = s.length/2;i<s.length;i++)
        {
            result = result + s[i];
        }
        System.out.println(result);

    }
}

public class ConcatSecondHalfStringArray {
    public static void main(String[] args) {
        ConcatString c = new ConcatString();
        c.ConStg(new String[] {"SG","Testing","Institute","Bangalore"});
    }
}
