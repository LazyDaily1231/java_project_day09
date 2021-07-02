package 배열사용;

import java.util.Scanner;



public class 인기투표100 {

	public static void main(String[] args) {
		String[] name = {"아이유", "유재석", "BTS"};
		int[] tv = new int[3];//투표수 저장 {0,0,0} 
		
		
		
		//System.out.println(name[0] + ": " + tv[0]);
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		//누적되는것은 반복문의 넣지 않기
		
		
		while (true) {
			//화면을 만들어보자
			System.out.println("인기투표 1)아이유 2)유재석 3)BTS 4)종료");
			System.out.print("선택번호 >> ");
			int num = sc.nextInt();//콘솔입력
			
		
			
			if (num == 4) {//while 문은 종료되는거 부터 먼저 입력하는게 좋다.
				System.out.println("시스템 종료");
				
				for(int i = 0; i >tv.length; i++) {//종료될때까지 반복
					System.out.println(name[i] + ":" + tv[i]);
				}
				
				
				System.out.println(name[0] + ":" + tv[0] + "");
				System.out.println(name[1] + ":" + tv[1] + "");
				System.out.println(name[2] + ":" + tv[2] + "");
				System.exit(0);
			}
			
			
			//해당 index에 있는 배열(의 값을 1증가
			tv[num - 1]++;//따라서 초기에 {0,0,0}로 초기화가 됐기 때문에 1씩 올라가는것을 볼수있음
			System.out.println(name[num - 1]+ "표 득표");
		}
		
		
		
	}

}
