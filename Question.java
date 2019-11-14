package t2;
import java.util.Random;
import java.util.Scanner;
//100以内加减乘除
public class Question {
	public static void main(String[] args) {
	
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		for (int i = 1; i <= 50; i++) {
			// 1）随机生成题目question（包括数据和符号），计算答案answer
			String question = null;
			int answer = 0;
			int a, b;
			int c;
			c = r.nextInt(2);
			do {
				a = r.nextInt(101);
				b = r.nextInt(101);
			} while ((c == 1 && a < b)
					|| (c == 0 && a + b > 100));
			if (c == 0) {
				question = a + "+" + b;
				answer = a + b;
			} else if (c == 1) {
				question = a + "-" + b;
				answer = a - b;
			} else if (c == 2) {
				question = a + "+" + b;
				answer = a + b;
			} else {
				question = a + "-" + b;
				answer = a - b;
			}

			// 2)输出题目question
			System.out.println(i + ")" + question + "="+answer);
			
		}
		in.close();
	}
}

