package com.biz.Stringarray;

public class StrArray_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strName = "홍길동";
		// 문자열.split("")메서드는
		//문자열(면수)에 담긴 문자열들을
		// 한글자씩 문해해서
		//문자열 개수만큼의 배열을 생성해준다.
		String[] strNames = strName.split("");
		
		
		int intNum =10;
		int intNum2= intNum+100;
		
		for(int i=0; i<strNames.length;i++) {
			System.out.println(strNames[i]);
		}
	}

	// makeStrings() 메서드의 형태만 만들고
	// 내부의 구체적인 기능은 작성하지은 상태
	// 이런 코드를 proto type이라고한다.
	// 보통 proto type을 만들었을때
	// return 문을 만들어야하는데
	// return 형이 숫자이면 return0이라고 작성하고
	// 그외 형일경우는 return null이라고 한다
	public static String[] makeStrings(String strNtions) {
		return null;

	}
}
