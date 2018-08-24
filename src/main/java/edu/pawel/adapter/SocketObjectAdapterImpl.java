package edu.pawel.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = socket.getVolt();
        return converVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getVolt();
        return converVolt(v, 10);
    }

    public Volt converVolt (Volt v,int volt){
        return new Volt(v.getVolts()/volt);
    }
}
