package com.gentech.VoidMethods;

class StringRev
{
    void rev(String[] s1)
    {
        int k=0;
        String[] s2 = new String[s1.length/2 +s1.length%2];
        for(int i=s1.length/2;i<s1.length;i++)
        {
            s2[k]=s1[i];
            k++;
        }
        for(int j=s2.length-1;j>=0;j--)
        {
            System.out.print(s2[j]+" ");
        }
    }
}

public class Assign2ndHalfOfOneDStringAryIntoAnotherAryAndRead2ndHalfInRevOrd {
    public static void main(String[] args) {
        StringRev s = new StringRev();
        s.rev(new String[]{"Amaresh","Manoj","Harish","Srinidi","Vasu","Chinmay","Samarth"});
    }
}
