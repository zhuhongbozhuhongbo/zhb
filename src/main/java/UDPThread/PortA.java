package UDPThread;

import java.net.DatagramSocket;

public class PortA {
    public static void main(String[] args) throws Exception {
        //use the multi-thread .
        //one thread response for sneding message ,in this field you should use the System.in as the inputStream
        //the other response for receiveing the message
        System.out.println("PortA started!");
        DatagramSocket socket = new DatagramSocket(5683);//ָ���˿ںţ����ڱ�Ķ˿������﷢����Ϣ��
        new Thread(new ReceiveMess1(socket)).start();//���߳̽�����Ϣ
        new Thread(new SendMess1(socket)).start();//���̷߳�����Ϣ

    }
}

//client A :  Port 5684
//client B :  Port 7050