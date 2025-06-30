package bridge;

import bridge.devices.Device;
import bridge.devices.Radio;
import bridge.devices.Tv;
import bridge.remote.AdvancedRemote;
import bridge.remote.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Test with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Test with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        device.printStatus();
        advancedRemote.mute();
        device.printStatus();
    }
}
