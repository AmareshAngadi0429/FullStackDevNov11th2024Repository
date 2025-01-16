package com.gentech.reflection;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DserialDemo {
    public static void main(String[] args) {
        Dserial();
    }
    private static void Dserial()
    {
        FileInputStream fin = null;
        ObjectInputStream in = null;
        Student obj = null;

        try
        {
            fin = new FileInputStream("D:\\Excel\\Abc.ser");
            in = new ObjectInputStream(fin);
            obj = (Student) in.readObject();
            obj.showCourseName();
            obj.showFirstName();
            obj.showRollNo();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                fin.close();
                obj=null;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
