import java.util.Arrays;
import java.util.Scanner;

public class Mid_Value {
//	[���� ����]
//	1. N�� �׻� Ȧ���� �־�����.
//  2. N�� 9�̻� 199 ������ �����̴�. (9 �� N �� 199)
	
//	[�Է�]
//	�Է��� ù �ٿ� N �� �־�����.
//	��° �ٿ� N ���� ������ �־�����.
	
//	[���]
//	N ���� ������ ��, �߰����� �ش��ϴ� ������ �������� ����Ѵ�.
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		int len = 0;
		int temp = sc.nextInt();
		
		// n�� �Է�����
		if(temp >=9 && temp <=199 && temp%2 != 0) {
			len = temp;
		}
		int arr[] = new int[len];
		
		//�迭 �� �Է�
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		// �迭 ��������
		Arrays.sort(arr);
		
		// �߰��� ���ϱ�
		int result= new mid().Searched_MidValue(arr);
		System.out.println(result);
		
		
	}
}
class mid{
	int Searched_MidValue(int arr[]) {
		int index = arr.length/2;
		int mid = arr[index];
		return mid;
	}
}


		
