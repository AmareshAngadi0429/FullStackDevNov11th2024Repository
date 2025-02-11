package dem;

import java.util.ArrayList;
import java.util.List;

public class Inven {
    public static void main(String[] args) {
        pal("iammadamfromgadag");

    }
    public static void pal(String xyz)
    {
        List<String> list = new ArrayList<>();
        for(int i=0;i<xyz.length()-1;i++)
        {
            for (int j=i+2;j<xyz.length();j++)
            {
                String s = xyz.substring(i,j);
                char ch[] = s.toCharArray();
                String res ="";
                for (int k=0;k<ch.length;k++)
                {
                    res = ch[k]+res;
                }
                if (res.compareToIgnoreCase(s)==0)
                {
                    list.add(s);
                }
            }
        }
        for (int j=0;j<list.size();j++)
        {
            System.out.println(list.get(j));
        }
    }
}
