package com.biz.intarray;

import java.util.Random;

public class IntArray_05 {
	
	public static void main(String[] args) {

		int[] intkor = new int[30];

		// 임의의 숫자를 생성하기 위한 클래스
		Random rnd = new Random(30);
		// 배열과함께 사용하는 for명령문은
		// 시작값은 0
		// 종료값은 배열 크기의 -1까지 사용한다.
		for (int i = 0; i < 30; i++) {
			// 0부터 49까지 임의의 숫자르 1개 생성하고
			// 거기에 51을 더하여
			// 실제로는 51부터 100까지 숫자를 만들어
			// intkor의 i번째 위치에 대입(할당,저장)
			intkor[i] = rnd.nextInt(50) + 51;
		}
		for (int i = 0; i < 40; i++) {
			System.out.print(intkor[i]);

			if ((i + 1) % 5 == 0) {
				System.out.println();
			} else {
				System.out.print(" , ");
			}
		}

	
	}

}
