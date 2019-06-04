package com.biz.intarray;

public class IntArray_02 {

	public static void main(String[] args) {
		
		// 학생 개별 점수를 변수에 일단 저장하는 부분
		// 한생개별 점수는 어떤 규칙을 부여할수 없으므로
		//어쩔수없이 작성해야하는 코드
		int intkor_01 =90;
		int intkor_02 =70;
		int intkor_03 =80;
		int intkor_04 =77;
		int intkor_05 =90;
		int intkor_06 =78;
		int intkor_07 =60;
		// 총점을 계산하는 부분은
		// 거의 코드가 유사한데
		// 끝에 숫자 2자리만 연속에 1씩 증되고 있는 것을 볼수있다.
		// 그렇다면 앞에 학습한
		// for 명령을 이용해서 뭔가 해볼수 있을것 같다.
		int intSum =0;
		for(int i =1 ;i<30; i++) {
			//intSum+=intkor_i; 
		}
		
		String a ="03";
		int intNum_03=0;
		//우리가 생각할때
		// 아래코드는 intNum_03=100;이라고 번역될것으로
		//보이지만 컴퓨터는 인식하지못하는 문법이다.
		//intNum_a=100;
		
		//아래코드도 intNum+a는 intNum03이라고 번역될것으로
		//보이지만 컴퓨터는 인식하지못하는 문법이다.
		//intNum+a=100;
				
		//intsum += intkor_01;
		//intsum += intkor_02;
		//intsum += intkor_03;
		//intsum += intkor_04;
		//intsum += intkor_05;
		//intsum += intkor_06;
		//intsum += intkor_07;
		System.out.println("국어점수 총점:"+intSum);
		
		float fAvg =0;
		fAvg = intSum /7.0f;
		
		System.out.println("국어점수 학급평균:" +fAvg );
		
	}

		
	}

