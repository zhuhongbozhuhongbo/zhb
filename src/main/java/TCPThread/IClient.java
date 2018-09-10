package TCPThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramSocket;
import java.net.Socket;

import UDPThread.ReceiveMess2;
import UDPThread.SendMess2;

public class IClient {
    public static void main(String[] args)
            throws IOException {


        System.out.println("����ִ��TCP����");
        Socket s = new Socket("120.79.24.19", 8080);//"10.10.10.134"
        //�ͻ�������ClientThread�̲߳��϶�ȡ���Է�����������
        new Thread(new Clientxian(s)).start();


        //��ȡ��Socket��Ӧ�������
        PrintStream ps = new PrintStream(s.getOutputStream());
        String line = null;
        //���϶�ȡ�������벢���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((line = br.readLine()) != null) {
            //���û��ļ�����������д��Socket��Ӧ�������
            ps.println(line);
        }

    }
}
/*
<query><userid>001</userid><passwd>aaa</passwd><field>numberPlate</field><type>DSI</type><querymode>findByProjectInformation</querymode><p0>empty</p0><p1>empty</p1><p2>empty</p2><p3>̫�������Ŀ</p3><p4>empty</p4><p5>empty</p5></query>
 */

/*
<query><userid>001</userid><passwd>aaa</passwd><field>all</field><type>PDI</type><querymode>findByProjectProvince</querymode><p0>empty</p0><p1>����</p1><p2>empty</p2><p3>null</p3><p4>null</p4><p5>null</p5></query>
 */
/*
<query><userid>001</userid><passwd>aaa</passwd><field>all</field><type>DSI</type><querymode>findByProjectInformation</querymode><p0>empty</p0><p1>empty</p1><p2>empty</p2><p3>̫�������Ŀ</p3><p4>empty</p4><p5>empty</p5></query>
 */

/*
<query><userid>001</userid><passwd>aaa</passwd><field>numberPlate</field><type>DSI</type><querymode>findByProjectInformation</querymode><p0>empty</p0><p1>empty</p1><p2>empty</p2><p3>̫�������Ŀ</p3><p4>empty</p4><p5>empty</p5></query>
 */