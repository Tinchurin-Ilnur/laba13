package com.company;

import java.util.ArrayList;
import java.util.List;

abstract class TransportationServices{
    String name;
    List <String> Description = new ArrayList<>();

public String toString(){
return "TypeOfTransportation: " + name + "\n" + Description;
    }
}

abstract class TransportCompany{
public abstract TransportationServices createTP();
}
class TPbyLand extends TransportCompany{
public TransportationServices createTP(){
return new transportByLand();
    }
}
class TPbySea extends TransportCompany {
public TransportationServices createTP() {
return new transportBySea();
    }
}

class TPbyAir extends TransportCompany {
public TransportationServices createTP() {
return new transportByAir();
    }
}


class transportByLand extends TransportationServices {
public transportByLand() {
        name = "Transportation by land:";
        Description.add("Transport by road");
        Description.add("Transport by cars");
        Description.add("Transport by trucks");
    }
}

class transportBySea extends TransportationServices {
public transportBySea() {
        name = "Transportation by Sea:";
        Description.add("Transport by boat");
        Description.add("Transport by ship");
        Description.add("Transport by oceans");
    }
}

class transportByAir extends TransportationServices {
public transportByAir() {
        name = "transportation by Air:";
        Description.add("Transport by plane");
        Description.add("The most faster transport");
    }
}

public class Main {

public static void main(String[] args) {
        TransportCompany myLandTransport = new TPbyLand();
        TransportCompany mySeaTransport = new TPbySea();
        TransportCompany myAirTransport = new TPbyAir();

        TransportationServices Land = myLandTransport.createTP();
        TransportationServices Sea = mySeaTransport.createTP();
        TransportationServices Air = myAirTransport.createTP();

        System.out.println(Land);
        System.out.println(Sea);
        System.out.println(Air);
    }
}