import java.util.ArrayList;
import java.util.Scanner;

public class AddExam {
//	�ڿ��� N�� 1���� 9999������ �ڿ����̴�. (1 �� N �� 9999)
	
//	[�Է�]
//	�Է����� �ڿ��� N�� �־�����.
	
//	[���]
//	�� �ڸ����� ���� ����Ѵ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum = 0;
		int temp = sc.nextInt();
		
		//�Է����� 1~9999 �ڿ���
		if(temp >=1 && temp <=9999) {
			num = temp;
		}
		
		// �ڸ��� �����ϱ�
		while(num !=0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);
	}

}
