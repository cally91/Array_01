package com.biz.intarray;

public class IntArray_01 {

	public static void main(String[] args) {
		
		int intkor_01 =90;
		int intkor_02 =70;
		int intkor_03 =80;
		int intkor_04 =77;
		int intkor_05 =90;
		int intkor_06 =78;
		int intkor_07 =60;
		
		int intsum =0;
		intsum += intkor_01;
		intsum += intkor_02;
		intsum += intkor_03;
		intsum += intkor_04;
		intsum += intkor_05;
		intsum += intkor_06;
		intsum += intkor_07;
		System.out.println("국어점수 총점:"+intsum);
		
		float fAvg =0;
		fAvg =intsum /7.0f;
		
		System.out.println("국어점수 학급평균:" +fAvg  );
		
	}

	
		
	}



