package com.gentech.reflection;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
            exe();
    }
    static String b = "amaresh";

    private static void exe()
    {
        StringBuffer s = new StringBuffer("welcome");
          int v =  s.codePointAt(1);
        System.out.println(v);
        int v2 = s.codePointAt(6);
        System.out.println(v2);
        int v3 = s.codePointCount(0,6);
        System.out.println(v3);
        StringBuffer res = s.repeat("to" ,1);
        System.out.println(res);
        CharSequence c1 = "cdbc";
        CharSequence c2 = "hd";

    }
}
