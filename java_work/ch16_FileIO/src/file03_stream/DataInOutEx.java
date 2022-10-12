package file03_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutEx {

	public static void main(String[] args) throws IOException {

		DataOutputStream dos = new DataOutputStream(new FileOutputStream("prime.dat"));

		dos.writeUTF("어느 날이 좋은 날에");
		dos.writeBoolean(false);
		dos.writeDouble(3.14);

		dos.flush();
		dos.close();

		System.out.println("출력 완료");

		// 다 읽고 나면 EOFException 발생시킴
		DataInputStream dis = new DataInputStream(new FileInputStream("prime.dat"));
		for (int i = 0; i < 3; i++) {

			try {
				String name = dis.readUTF();
				boolean ok = dis.readBoolean();
				double d1 = dis.readDouble();
				
				System.out.println(name + " : " + ok + " : " + d1);
			} catch (EOFException e) {
				System.out.println("다 읽었네 ㅋㅋㅋ 바이~");
				break;
			}

			
		}
	}
}
