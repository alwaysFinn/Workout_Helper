import java.util.Scanner;

public class GoandStop {
	
	public static void goandstop() {
		
		String Go = "go";
		String Stop = "stop";
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();
				
		
		if(answer.equals(Go))
		{
			System.out.println("새로운 세트를 시작합니다.");
		}
		else if(answer.equals(Stop))
		{
			System.out.println("세트가 끝났습니다. 다음 세트로 넘어갑니다.");
		}
	}
	

	public static void main(String[] args) {
		
		goandstop();

	}

}
//사용자의 입력값에 따라 새로운 세트를 시작할지, 현 세트를 멈출지 정하는 프로그램.
