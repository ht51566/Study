package net04_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receiver {
	
	public static void main(String[] args) {
		try {
			start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void start() throws IOException {
		DatagramSocket socket = new DatagramSocket(5001);
		DatagramPacket inPacket, outPacket;
		
		byte[] in = new byte[10];
		byte[] out;
		
		while(true) {
			inPacket = new DatagramPacket(in, in.length);
			socket.receive(inPacket);
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
					
			System.out.println(address+"/"+port);
			
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			//현재 일시를 SimpleDateFormat 객체의 형태로 만들어 문자열로 저장
			String time = sdf.format(new Date());
			out = time.getBytes();
			outPacket = new DatagramPacket(out, out.length, address, port);
			socket.send(outPacket);
		}
	}
	
	
}
