//초기에 값을 입력하고, 해당 값만큼 문자를 입력할 수 있는 프로그램
//ex) 3 입력시, 1 - @@ 2 - @@ 3 - @@ 입력하게되면
//@@, @@, @@ 이라고 표시해줌.

import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {
		
	
		
		
		
		Scanner input = new Scanner(System.in);
		int workout_value;
		System.out.println("운동 종류의 총 수와 이름들을 입력하세요.");
		workout_value = input.nextInt();
		String[] Parts = new String[workout_value];
		
		for ( int counter = 0; counter < workout_value; counter++)
		{
			System.out.println("하실 운동의 이름을 입력하세요" + (counter+1));
			Parts[counter] = input.next(); 
		}
		input.close();
		System.out.println("오늘 하실 운동의 목록입니다.");
		for(int counter = 0; counter < workout_value; counter++)
		{
			System.out.println(Parts[counter]);
		}
	}

}
