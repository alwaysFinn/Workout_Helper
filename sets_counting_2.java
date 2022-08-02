import java.util.Scanner;

public class sets_counting_2 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("진행하실 세트 수를 입력하세요.");
		int Sets = input.nextInt();
		input.close();
		
		String Next = "next"; //사용자가 대답할 내용 
		String Stop = "stop";
		String Answer = "null"; // Answer = next or stop 을 판단하여 1. 다음 세트 진행/ 2. 현 세트 멈춤 판단.
		
		if (Answer.equals(Next))
		{
			System.out.println("다음 세트를 진행합니다." + "개의 세트가 남았습니다.");
		}
		else if (Answer.equals(Stop));
		{
			System.out.println( "번쨰 세트가 끝났습니다." +  "개의 세트가 남았습니다.");
		}
		//여기까지 프로그램의 동작여부를 판단할 수 있는 부분. next라고 입력하면 다음 세트 시작, stop이라고 입력하면 현 세트 중지
		
		
		
		

	}

}
