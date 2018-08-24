package edu.pawel.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return converterVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return converterVolt(v, 40);
    }

    public Volt converterVolt(Volt v, int volt){

        return new Volt(v.getVolts()/volt);
    }
}
