//세트 수 측정을 도와주는 프로그램
//초기에 목표 세트 수를 입력하고
//한 세트를 완료할 때마다 특정 조작법으로 다음 세트로 넘어감. 

import java.util.Scanner;

public class Workout_set_for {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int count;
		System.out.println("세트 수를 지정하세요.");
		count = input.nextInt();
		input.close();
		
		for(int sets = 0; sets < count; sets++)
		{
			System.out.println((sets + 1) + "번째 세트입니다." + (count - (sets + 1)) + "개의 세트가 남았습니다." );
			//원하는 것 = 세트수가 초기 지정 값에 도달하면 정한 멘트가 나오는 것.
		}
		

	}

}
