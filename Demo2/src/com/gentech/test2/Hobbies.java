package com.gentech.test2;
class Return15
{


        String[] ret15()
        {
            String[] s = {"read","write","sing","walk"};
            return s;
        }

}
public class Hobbies {
    public static void main(String[] args) {
        Return15 r = new Return15();
        String[] re = r.ret15();
        for(int i=0;i< re.length;i++)
        {
            System.out.print(re[i]+" ");
        }
    }
}
