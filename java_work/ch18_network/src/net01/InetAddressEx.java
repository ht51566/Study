package net01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	
	public static void main(String[] args) {
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			System.out.println(local.getHostAddress());
			System.out.println(local.getHostName());
			System.out.println(local.isLoopbackAddress());
			
			InetAddress[] naverIps = InetAddress.getAllByName("naver.com");
			//System.out.println(Arrays.toString(naverIps));
			for(InetAddress i : naverIps) {
				System.out.println(i);
			}
		
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
