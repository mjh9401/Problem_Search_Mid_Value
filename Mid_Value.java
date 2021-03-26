import java.util.Arrays;
import java.util.Scanner;

public class Mid_Value {
//	[제약 사항]
//	1. N은 항상 홀수로 주어진다.
//  2. N은 9이상 199 이하의 정수이다. (9 ≤ N ≤ 199)
	
//	[입력]
//	입력은 첫 줄에 N 이 주어진다.
//	둘째 줄에 N 개의 점수가 주어진다.
	
//	[출력]
//	N 개의 점수들 중, 중간값에 해당하는 점수를 정답으로 출력한다.
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		int len = 0;
		int temp = sc.nextInt();
		
		// n의 입력조건
		if(temp >=9 && temp <=199 && temp%2 != 0) {
			len = temp;
		}
		int arr[] = new int[len];
		
		//배열 값 입력
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		// 배열 오름차순
		Arrays.sort(arr);
		
		// 중간값 구하기
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


		
