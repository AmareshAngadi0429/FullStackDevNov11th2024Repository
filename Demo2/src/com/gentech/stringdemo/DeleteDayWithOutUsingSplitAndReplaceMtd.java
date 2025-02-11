package com.gentech.stringdemo;
class DElDay
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
                i=i+3;
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
public class DeleteDayWithOutUsingSplitAndReplaceMtd {
    public static void main(String[] args) {
        DElDay.mtd("sundaymondaytuesdaywednesdaythursdayfridaysaturday");
    }
}
