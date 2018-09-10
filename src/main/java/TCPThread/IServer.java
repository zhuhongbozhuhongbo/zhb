package TCPThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class IServer {
    public static void main(String[] args)
            throws IOException {

/*
		DatagramSocket socket = new DatagramSocket(7000);//ָ���˿ںţ����ڱ�Ķ˿������﷢����Ϣ��
		new Thread(new ReceiveMess1(socket)).start();//���߳̽�����Ϣ
		new Thread(new SendMess1(socket)).start();//���̷߳�����Ϣ
*/

        System.out.println("TCP����������");
        ServerSocket ss = new ServerSocket(8080);

        while (true) {
            //���д������������һֱ�ȴ����˵�����
            Socket s = ss.accept();

            System.out.println("a Client has connected!");
            //ÿ���ͻ������Ӻ�����һ��ServerThread�߳�Ϊ�ÿͻ��˷���
            new Thread(new Serverxian(s)).start();
        }

    }
}