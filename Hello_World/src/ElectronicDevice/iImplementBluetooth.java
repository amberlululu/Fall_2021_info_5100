package ElectronicDevice;

public interface iImplementBluetooth {
    void pair(String deviceUUID);
    void unpair(String deviceUUID);
    void sendString(String str);
}
