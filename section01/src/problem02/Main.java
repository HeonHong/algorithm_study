package problem02;

import java.util.Scanner;

public class Main {

	public Character solution(char compare) {
		
		if(Character.toLowerCase(compare)==compare) {
			return Character.toUpperCase(compare);
		}else {
			return Character.toLowerCase(compare);
		}
		
		//다른 옵션 : 아스키코드 값 이용
		
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String output="";
		Main main = new Main();
		
		if(input.length()>=99) input = input.substring(0, 100);
		//마지막 인덱스를 100까지 쓰면 인덱스값 99번까지 출력함
		
		for(char compare:input.toCharArray()) {
			output = output+main.solution(compare);
		}
		System.out.println(output);
	}

}
//2. 대소문자 변환
//설명
//
//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//
//문자열은 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.