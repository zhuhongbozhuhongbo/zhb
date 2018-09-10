package UDPThread;

import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendMess1 implements Runnable {   //���̷߳�����Ϣ
    DatagramSocket socket;

    public SendMess1(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //�Ӽ�������ȡ����Ҫ���͵���Ϣ��ͨ��socket���ͳ�ȥ
            InputStream is = System.in;
            byte[] buffer = new byte[1024];
            DatagramPacket packet = null;
            while (true) {
                int length = is.read(buffer);
                packet = new DatagramPacket(buffer, length, InetAddress.getByName("10.10.10.132"), 8800); // "localhost""120.79.24.19"   ���͸�Ŀ��������5683�˿�
                socket.send(packet);
                String str = new String(packet.getData(), 0, packet.getLength()).trim();
                System.out.println("UDPsendMessage :" + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}