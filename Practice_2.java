import java.util.Scanner;

public class Practice_2 {
	

	public static void main(String[] args) {
		
		String[] Workout;
		String[] Chest;
		
		
		Scanner Parts = new Scanner(System.in);
		System.out.println("운동 부위를 입력하세요");
		//뒤에 부위를 입력하면 그에 해당하는 array 불러오기
		//아마 if 사용,,?
		
		
		String Part = Parts.nextLine();
		
		System.out.println("운동 부위 : " + Part + "\n" + Part +" 운동을 시작합니다.");
		//line 10 ~ 15까지 운동 부위 설정 및 노출
		
	}

}

