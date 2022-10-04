package api06_format;

import java.text.DecimalFormat;

public class Decimal01 {
	public static void main(String[] args) {
		double num = 1234567.89;
		int a = 5;
		int b = 7;

		// String phone = "010-1234-1234";
		// 10진수, 소수점 이하 반올림
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		// 소수점 첫자리까지 표시(그 이하 반올림)
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		// 0: 자리수 표시 빈자리 0으로 채우기
		df = new DecimalFormat("00000000.0000");
		System.out.println(df.format(num));
		// #: 자리수 표시 빈 자리 채우지 않기 : "###-####-####"
		df = new DecimalFormat("#");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));

		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		// 부호 표시
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));

		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		// 세 자리마다 , 표시
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		// E: 지수 표시
		df = new DecimalFormat("00.0E0");
		System.out.println(df.format(num));
		// 음양 표시
		df = new DecimalFormat("+#,###;-#,###");
		System.out.println(df.format(a - b));
		// 100 곱해서 %표시
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num));
		// Unicode 기호(￦) 표시
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));

	}
}
