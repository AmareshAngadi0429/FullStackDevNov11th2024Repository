package com.gentech.polymorphismdemo;
interface OS
{
    void operatingSystemUsedHereIs();

}
class BlackBerry implements OS
{

    @Override
    public void operatingSystemUsedHereIs() {
        System.out.println("BlackBerry mobiles use BlackBerry OS");
    }
}
class Google implements OS
{

    @Override
    public void operatingSystemUsedHereIs() {
        System.out.println("Google Mobiles uses Android OS");
    }
}
class IPhone implements OS
{

    @Override
    public void operatingSystemUsedHereIs() {
        System.out.println("Iphone uses IOS OS");
    }
}
class Nokia implements OS
{

    @Override
    public void operatingSystemUsedHereIs() {
        System.out.println("Nokia mobiles uses Symbian OS");
    }
}
public class DemoOfOperatingSystem {
    public static void main(String[] args) {
        OS os ;
        BlackBerry b = new BlackBerry();
        Google g = new Google();
        Nokia n = new Nokia();
        IPhone i = new IPhone();

        os=b;
        os.operatingSystemUsedHereIs();
        os=g;
        os.operatingSystemUsedHereIs();
        os=n;
        os.operatingSystemUsedHereIs();
        os=i;
        os.operatingSystemUsedHereIs();



    }
}
