/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.doranco.week11tpadapter;

/**
 *
 * @author JiJi
 */
public class Week11TpAdapter {

    public static void main(String[] args) {
        
        testClassAdapter();
        testObjetAdapter();
              
    }
    
    private static  void testObjetAdapter(){
    
        SocketAdapter socketAdapter = new SocketObjetAdapterImpl();
        
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        
        System.out.println("v3 votls utilise l'objet Adapter = " + v3.getVolts());
        System.out.println("v12 votls utilise l'objet Adapter = " + v12.getVolts());
        System.out.println("v120 votls utilise l'objet Adapter = " + v120.getVolts());
        
    }
    
    private static void testClassAdapter(){
         
            SocketAdapter socketAdapter = new SocketClassAdapterImpl();
            
            Volt v3 = getVolt(socketAdapter, 3);
            Volt v12 = getVolt(socketAdapter, 12);
            Volt v120 = getVolt(socketAdapter, 120);
            
            System.out.println("v3 votls utilise la class Adapter = " + v3.getVolts());
            System.out.println("v12 votls utilise la class Adapter = " + v12.getVolts());
            System.out.println("v120 votls utilise la class Adapter = " + v120.getVolts());
        }
            
    
    private static Volt getVolt(SocketAdapter adapter, int i){

    
            switch (i) {
            case 3: return adapter.get3Volt();
            case 12: return adapter.get12Volt();
            case 120 : return adapter.get120Volt();
                
                
            default:return null;
        }
    }
    
}
        
        
    

