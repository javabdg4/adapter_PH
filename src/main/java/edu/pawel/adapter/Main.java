package edu.pawel.adapter;

public class Main {
    public static void main(String... args){

        objectAdapter();
        classAdapter();

        
    }

    public static void objectAdapter(){
        SocketAdapter socketAdapter =new SocketObjectAdapterImpl();
        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();
        System.out.println(v12.getVolts());
    }

    public static void classAdapter(){
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();
        System.out.println(v12.getVolts());
    }

    public static Volt getVolt(SocketAdapter socketAdapter, int volt){
        switch (volt){
            case 3:
                return socketAdapter.get3Volt();
            case 12:
                return socketAdapter.get12Volt();
            case 120:
                return socketAdapter.get120Volt();
            default:
                return null;
        }
    }

}
