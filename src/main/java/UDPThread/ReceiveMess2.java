package UDPThread;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMess2 implements Runnable {


    DatagramSocket socket;

    public ReceiveMess2(DatagramSocket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            while (true) {
                socket.receive(packet);
                String str = new String(packet.getData(), 0, packet.getLength()).trim();
                System.out.println("UDPreceiveMessage : " + str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}






/*




            if (str == null || command.equals("QUIT")) {// ����quit������������
                    done = true;
                    // ReceiveServer.socketlist.remove(this.clientRequest);//��socket���б����Ƴ�
                    // ReceiveServer.addresslist.remove(this.clientRequest.getInetAddress());//�Ƴ��豸ip
                    //ReceiveServer.addresslist.remove(this.clientRequest.getInetAddress().getHostAddress());//�Ƴ��豸ip
                    }
                    else if (command.equals("HELP")) { // ����help��ѯ���������ɽ��ܵ�����
               *//* printmessege("query");
                printmessege("quit");
                printmessege("help");*//*
                    }
                    else if (command.equals("CAD")) { // ��ѯ��ǰ�豸CURRENT ACTIVATED DEVICE
                    //ReceiveServer.socketlist.forEach(socket -> output.println(socket));
                    //ReceiveServer.addresslist.forEach(InetAddress -> output.println(InetAddress.toString()));//��ӡ����ip
                    //ReceiveServer.addresslist.forEach(String -> output.println(String));//��ӡ����ip
                    }
                    else if (command.equals("QUERYALL")) { // ����query
                    op_query_all();
                    }else if (command.equals("DELETE")) { // ����query
                    op_delete();
                    }
                    // else if ����.. //�ڴ˿ɼ��������������ָ��
                    else if (!command.startsWith("HELP") && !command.startsWith("QUIT")
                    && !command.startsWith("QUERY")) {
             *//*   printmessege("Command not Found!Please refer to the HELP!");*//*
                  }*/