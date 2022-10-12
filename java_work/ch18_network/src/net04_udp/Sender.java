package net04_udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Sender {
	public static void main(String[] args) throws IOException, InterruptedException {

		DatagramSocket socket = new DatagramSocket();
		DatagramPacket inPacket, outPacket;
		
		System.out.println("보내기 시작 >>> ");

		for (int i = 0; i < 3; i++) {
			String data = "메시지 " + i;
			byte[] msg = data.getBytes("utf-8");
			// 보내려는 소포에 내용과 수신인 주소를 적는다.
			outPacket = new DatagramPacket(msg, msg.length, new InetSocketAddress("localhost", 5001));
			socket.send(outPacket);
			System.out.println("[보낸 바이트 수]: " + msg.length);
			Thread.sleep(1000);
			inPacket = new DatagramPacket(msg, msg.length);
			socket.receive(inPacket);
			System.out.println("소포 도착 시간: " + new String(inPacket.getData()));
			
		}
	}
}
