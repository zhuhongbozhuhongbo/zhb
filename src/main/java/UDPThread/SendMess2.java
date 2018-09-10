package UDPThread;

import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendMess2 implements Runnable {
    DatagramSocket socket;

    public SendMess2(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //�Ӽ�������ȡ����Ҫ���͵���Ϣ��ͨ��socket���ͳ�ȥ
            //InputStream is = System.in;
            byte[] buffer = new byte[1024];
            DatagramPacket packet = null;
            //while(true){
            //int length = is.read(buffer);

            //ע�����´�������ģ�ⰲȫñ��Ŀ��λ������
            //                   ����         ��ѹ          ��ѹ      ���ٶ�     ����       ��      ����ʱ��
            String sendString = "000000" + "000000" + "000000" + "000000" + "111111" + "000000" + "000000" + "000000000000" + "000000000000" + "000000000000" + "000000000000"
                    //                  ����                                              λ��      ��ʶ
                    + "000000000000000000000000000000000000000000000000" + "000000000000" + "1";
            buffer = sendString.getBytes();


            String name = "120.79.24.19";
            //String name = "10.10.10.132";
            //String name = "192.168.1.104";
            //String name = "192.168.43.206";
            InetAddress address = InetAddress.getByName(name);
            packet = new DatagramPacket(buffer, buffer.length, address, 8805);
            socket.send(packet);
            String str = new String(packet.getData(), 0, packet.getLength());
            System.out.println("UDPsendMessage :" + str);
            Thread.sleep(100);
            // }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}