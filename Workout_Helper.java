import java.util.Arrays;
import java.util.Scanner;


public class Workout_Helper {
	
	
	
public static class time{
		
		String break_time()
		{
			System.out.println("휴식 시간을 분단위로 입력하세요." + "\nex)1분 30초, 2분");
			Scanner scan = new Scanner(System.in);
			String time = scan.nextLine();
			return time;
		}
	}
//사용자가 휴식시간을 지정할 수 있는 scanner입니다. 

public static class user_sets{
	
	int sets()
	{
	System.out.println("진행하실 세트 수를 입력하세요.");
	Scanner scan = new Scanner(System.in);
	int set = scan.nextInt();
	return set;
	}
}

//사용자가 세트 수를 지정할 수 있는 scanner입니다.
	

	

	public static void main(String[] args) {
		
		
		System.out.println("해당 프로그램은 사용자의 운동을 도와주는 프로그램입니다.");
		
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("운동 부위를 설정하세요.");
		String parts = scan.nextLine();
		
		System.out.println("입력하신 부위는 (" + parts + ")입니다.");
		System.out.println("(" + parts + ")에서 진행하실 운동을 ★순서대로★ 입력하세요. \n운동은 4개까지 입력 가능합니다.");
		
		String name1 = scan.nextLine();
		String name2 = scan.nextLine();
		String name3 = scan.nextLine();
		String name4 = scan.nextLine();
		//사용자가 진행 할 운동 목록을 받는 부분
		
		
		String hey[] = {name1, name2, name3, name4};
		
		System.out.println("----------------------------------------------");
		System.out.println(parts + "에서 진행하실 운동은 \n" + Arrays.toString(hey).replace("[", "").replace("]", "") + "입니다. \n잠시 후 첫번째 운동부터 시작하겠습니다.");
		
		
		

		for(int j = 0; j <= hey.length-1;) //사용자가 입력한 4가지의 운동을 하나씩 표현하기 위한 반복문입니다. hey.length로 하면 오류가 발생하기에 -1을 기입했습니다.
			
		{
			System.out.println((j+1) + "번째 운동은 " + hey[j] + " 입니다.\n"); 
		
			time user_breaktime = new time();
			String user_input_breaktime = user_breaktime.break_time();
		
		
			user_sets user_input = new user_sets();
			int user_sets = user_input.sets();
		
		
			System.out.println("세트 종료 시 : stop" + "\n다음 세트 시작 시 : go 를 입력하세요." + "\n마지막 세트 진행 시 stop을 입력하지 않아도 됩니다.");
			
			
			for(int i = 0; i <= (user_sets);) // 한 운동을 할 때 사용되는 프로그램입니다. 지정한 수 안에서 작동하며, 사용자가 특정 문구를 입력하면 그에 맞게 반응합니다.
			{
			
				Scanner scan1 = new Scanner(System.in);
				String input = scan1.nextLine();
			
			
				String go = "go";
				String stop = "stop";
		
				if(input.equals(go))
				{
					i++;
					System.out.println(i + "번째 세트를 시작합니다.");
				}
					if(i == user_sets)
					{
						System.out.println("마지막 세트입니다.");
					
					}
					else if(input.equals(stop))
					{
						System.out.println(i + "번째 세트가 종료되었습니다. 휴식시간은 " + user_input_breaktime + "이며, " + (user_sets - i) + "개의 세트가 남았습니다.");
					}
			
					if(i == user_sets)
					{
						break;
						
					}
			
			}
		j++;
		if(j == hey.length)
		{
			System.out.println("---------------------------------------------");
			System.out.println("이상으로 오늘의 " + parts + " 운동이 끝났습니다. 수고하셨습니다." + "\n내일도 득근..!");
		}
		}
		
		
		
		
	
		
	}

}

//최종 수정일 : '22. 08. 08
//완성본