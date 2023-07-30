
package com.mycompany.trafficlightsimulator;



public class TrafficLightSimulator {

    public static void main(String[] args) {
      RedLightThread redLightThread = new RedLightThread();
        GreenLightThread greenLightThread = new GreenLightThread();
        YellowLightThread yellowLightThread = new YellowLightThread();

        redLightThread.start();
        greenLightThread.start();
        yellowLightThread.start();
}
     
    
}
