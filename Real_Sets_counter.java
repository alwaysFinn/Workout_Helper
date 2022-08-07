import java.util.Scanner;



public class Real_Sets_counter {
	
	public static class user_sets{
		
		int sets()
		{
		System.out.println("진행하실 세트 수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int set = scan.nextInt();
		return set;
		}
	}

	public static void main(String[] args) {
		
		
		user_sets user_input = new user_sets();
		int user_sets = user_input.sets();
		
		
		System.out.println("세트 종료 시 : stop" + "\n다음 세트 시작 시 : go 를 입력하세요." + "\n마지막 세트 진행 시 stop을 입력하지 않아도 됩니다.");
		for(int i = 0; i <= (user_sets);)
		{
			
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			
			
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
				System.out.println(i + "번째 세트가 종료되었습니다. 휴식시간은 n분이며, " + (user_sets - i) + "개의 세트가 남았습니다.");
			}
			
			if(i == user_sets)
			{
				break;
			}
			
		}

	}

}
