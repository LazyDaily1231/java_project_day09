package 배열응용;

import java.util.Iterator;
import java.util.Random;

public class 랜덤입력 {

	public static void main(String[] args) {
		Random r = new Random(42);//seed값
		int[] score = new int[100];
		
		//랜덤한 값 하나 만들어서
		//배열의 특정한 인덱스에 저장
		
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(101);
		}
		for (int x : score) {
			System.out.println(x);
		}
	
	}

}
