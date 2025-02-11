package com.gentech.interfacedemo;
interface Hospitals
{
    void hName(String name);
}
interface Doctors extends Hospitals
{
    void doctorName(String name);
}
interface Nurse extends Doctors
{
    void nurseName(String name);
}
class Base1 implements Hospitals,Doctors,Nurse
{

    @Override
    public void nurseName(String name) {
        System.out.println("Nurse : "+name);
    }

    @Override

    public void doctorName(String name) {
        System.out.println("Doctor Name : "+ name);
    }
    @Override
    public void hName(String name) {
        System.out.println("Hospital Name : "+name);
    }
}
public class MultiLevelInterFace {
    public static void main(String[] args) {
        Base1 b = new Base1();
        b.hName("Annadaneshwara Hospital");
        b.doctorName("John Luther");
        b.nurseName("Merry Thomas");
    }
}
