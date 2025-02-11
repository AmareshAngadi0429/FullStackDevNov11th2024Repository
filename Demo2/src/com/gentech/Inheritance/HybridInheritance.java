package com.gentech.Inheritance;
class VehicleType
{
    VehicleType(String vtype)
    {
        System.out.println("vehicle info:-------");
        System.out.println("VehicleType is : "+vtype);
    }
}


class VehicleCompany extends VehicleType
{

    VehicleCompany(String vtype,String cname)
    {
        super(vtype);
        System.out.println("Company name : "+cname);
    }
}
class ModelName extends VehicleCompany
{
    ModelName(String vtype,String cname,String mname)
    {
        super(vtype,cname);
        System.out.println("Model name is : "+mname);
    }
}
class RulesForVehicleType extends VehicleType
{
    RulesForVehicleType(String vtype,int speedLimit,String seatBelt)
    {
        super(vtype);
        System.out.println("rules to be fallowed are :--");
        System.out.println("speedLimit is : "+speedLimit);
        System.out.println("seatBelt is "+ seatBelt);
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        RulesForVehicleType r = new RulesForVehicleType("car",100,"compulsory");
        ModelName m = new ModelName("car","maruti suziki","Swift");
    }
}
