package com.biz.intarray;

public class IntArray_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수값을 저장할수 있는 기억 공간을 30개 예약하고
		 * 그 기억공간에 대표 이름 intkor를 붙여라
		 * 
		 * ==>int형 (type)배열 30개를 만들고
		 *  대표이름으로 intkor를 붙여라
		 *  
		 *  ==> 30개의 연속된 기억공간을 예약하고,
		 *  처음시작곤간에 0을 시작하여
		 *  각 공간에 십진수 고유의 주소값을 붙여 나간다.
		 */
		int[] intkor=new int[30];
		
		//30개의 호수가 있는 intkor 에 각각 값들을 대입
		intkor[0]=90;
		intkor[1]=80;
		intkor[2]=70;
		intkor[3]=88;
		intkor[4]=66;
		intkor[5]=89;
		intkor[6]=85;
		intkor[7]=90;
		
		// 배열은 일반 변수와 달리
		// 그 배열을 활용 하때 for 반복문을 사용 할 수 있는 특징
		int intSum=0;
		for (int i =0; i<8; i++) {
			intSum +=intkor[i];
			
		}
		intSum= 0;
		intSum+=intkor[0];
		intSum+=intkor[1];
		intSum+=intkor[2];
		intSum+=intkor[3];
		intSum+=intkor[4];
		intSum+=intkor[5];
		intSum+=intkor[6];
		intSum+=intkor[7];
		
		
	}

}
