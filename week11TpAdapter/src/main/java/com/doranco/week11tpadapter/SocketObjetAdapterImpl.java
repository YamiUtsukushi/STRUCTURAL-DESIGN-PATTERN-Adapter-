/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpadapter;

/**
 *
 * @author JiJi
 */
public class SocketObjetAdapterImpl implements SocketAdapter{
    
    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {        
        return sock.getVolt();       
    }

    @Override
    public Volt get12Volt() {
        Volt v = new Socket().getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = new Socket().getVolt();
        return convertVolt(v,40);
    }
    
    
    private Volt convertVolt(Volt v, int i){
    
        return new Volt(v.getVolts()/i);
    }
    
    
}
