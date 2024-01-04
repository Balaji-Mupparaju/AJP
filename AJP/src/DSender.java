//DSender.java
import java.net.*;
public class DSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String str = "Welcome to socketdatagram class";
        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 6666);
        ds.send(dp);
        ds.close();
    }
}
