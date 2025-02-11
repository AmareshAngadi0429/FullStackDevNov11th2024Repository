package com.gentech.stringdemo;
class Comma
{
    static void mtd(String s)
    {
        char[] ch = s.toCharArray();
        String res = "";
        int i=0;
        while (i < ch.length)
        {
            if((ch[i]=='D'|| ch[i]=='d') && (ch[i+1]=='A' || ch[i+1]=='a') && (ch[i+2]=='Y' || ch[i+2]=='y'))
            {
                res += ch[i];
                res += ch[i+1];
                res += ch[i+2];
                res += ",";
                i = i+3;
            }
            else
            {
                res += ch[i];
                i++;
            }

        }
        System.out.println(res);
    }
}
public class InsertComma {
    public static void main(String[] args) {
        Comma.mtd("sundaymondaytuesdaywednesdaythursdayfridaysaturday");
    }
}
