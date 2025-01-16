package com.gentech.reflection;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerialDemo {
    public static void main(String[] args) {
        serial();
    }
    private static void serial()
    {
        FileOutputStream fout = null;
        ObjectOutputStream ob = null;
        Student obj = null;

        try{
            obj = new Student(11,"Amaresh","BE");
            fout = new FileOutputStream("D:\\Excel\\Abc.ser");
            ob = new ObjectOutputStream(fout);
            ob.writeObject(obj);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                ob.close();
                obj = null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
