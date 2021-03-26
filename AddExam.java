import java.util.ArrayList;
import java.util.Scanner;

public class AddExam {
//	자연수 N은 1부터 9999까지의 자연수이다. (1 ≤ N ≤ 9999)
	
//	[입력]
//	입력으로 자연수 N이 주어진다.
	
//	[출력]
//	각 자릿수의 합을 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum = 0;
		int temp = sc.nextInt();
		
		//입력조건 1~9999 자연수
		if(temp >=1 && temp <=9999) {
			num = temp;
		}
		
		// 자리수 추출하기
		while(num !=0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);
	}

}
