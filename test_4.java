import java.util.Scanner;

public class test_4 {
	
	String array(String name1, String name2, String name3, String name4) {
		return name1 + "\n" + name2 + "\n" + name3 + "\n" + name4;
	}
	
public static class for_test {
		
		int a()
		{	
			System.out.println("진행하실 세트 수를 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int count = scan.nextInt();
			System.out.println("입력하신 세트 수는 " + count + "입니다. \n운동을 시작합니다.");
			System.out.println("");

			for(int sets = 0; sets < count; sets++)
			{
				if(sets == count-1)
				{
					System.out.println("마지막 세트입니다.");
				}
				else
				{
					System.out.println(sets+1 + "번째 세트가 끝났습니다. 다음 세트를 준비해주세요.");
				}
			}
			return count;
		}
}
	
	

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
		
		
		
		test_4 sample = new test_4();
		String hey = sample.array(name1, name2, name3, name4);
		
		System.out.println("----------------------------------------------");
		System.out.println(parts + "에서 진행하실 운동은 \n" + hey + "입니다. \n잠시 후 첫번째 운동부터 시작하겠습니다.");

		
		System.out.println("첫번째 운동은 " + name1 + " 입니다.\n");
		System.out.println("두번째 운동은 " + name2 + " 입니다. \n");
		
		
		for_test test = new for_test();
		int so = test.a();
		System.out.println(so);
		
		
	}

}

//메소드 이용해서 만든 프로그램.
//return값을 배열로 인식하는 기능 추가 필요
