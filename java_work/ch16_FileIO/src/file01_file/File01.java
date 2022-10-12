package file01_file;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class File01 {

	public static void main(String[] args) throws IOException, URISyntaxException {

		File file1 = new File("d:\\ace\\temp");
		// File 객체 - 다루려는 파일의 경로를 저장, 생성, 삭제, 확인 등등
		System.out.println(file1);
		File file2 = new File("d:/ace/temp/wow.txt");
		System.out.println(file2);

		System.out.println(file1.exists());
		System.out.println(file2.exists());

		if (!file1.exists()) {
			file1.mkdir();
		}

		if (!file2.exists()) {
			file2.createNewFile();
		}
		System.out.println(file1.exists());
		System.out.println(file2.exists());

		String fileName = "d:/ace/temp/ab cd/a.txt";
		URI uri = new URI("file:///" + fileName.replaceAll(" ", "%20"));
		// URL url = uri.toURL();
		// System.out.println(uri);
		// System.out.println(url);
		File file3 = new File(uri);
		System.out.println(file3);
		if (!file3.exists()) {
			file3.createNewFile();
		}
		System.out.println(file3.exists());

		System.out.println("------------------------------");
		File[] contents = file1.listFiles();
		System.out.println(Arrays.toString(contents));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

		for (File f : contents) {
			System.out.println("---------------------------------");
			System.out.println(f.getName());
			System.out.println(f.getParent());
			System.out.println(f.getPath());
			System.out.println(f.isDirectory());
			System.out.println(f.isFile());
			System.out.println(sdf.format(f.lastModified()));
			System.out.println(f.length());

		}

		System.out.println("------------------------------");
		String dir = "d:/ace/web";
		File file = new File(dir);
		if (file.exists() && file.isDirectory()) {
			File[] arr = file.listFiles();
			System.out.println("===============================");
			System.out.println("     Files from " + file);
			System.out.println("===============================");

			recursivePrint(arr, 0, 0);
		}

	}

	private static void recursivePrint(File[] arr, int index, int level) {
		// 파일, 디렉터리가 더 이상 없으면 종료
		if (arr.length == index) {
			return;
		}
		// 레벨에 따라 들여쓰기
		for (int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		if (arr[index].isFile()) {
			System.out.println(arr[index].getName());
		} else if (arr[index].isDirectory()) {
			System.out.println("[DIR] " + arr[index].getName());
			recursivePrint(arr[index].listFiles(), 0, level + 1);
		}

		recursivePrint(arr, ++index, level);
	}
}
