import java.util.Scanner;

public class example {
	
	public static void wo_type() {
		Scanner scan = new Scanner(System.in);
		System.out.println("진행하실 운동 부위와 해당 부위의 운동 종류를 입력하세요." + "\n ※운동 부위를 가장 먼저 입력하셔야 합니다.");
		
		try {
			while (scan.hasNextLine())
			{
				
				String line = scan.nextLine().toLowerCase();
				
				if(line.equals("##"))
				{
					System.exit(0);
					scan.close();
				}
			}
		} finally {
			if (scan != null)
				scan.close();
		}
		}


	public static void main(String[] args) {
		
		wo_type();
		
		

	}

}


//초기 설정 시 운동 부위 입력 후 운동 종류 입력하는 프로그램.