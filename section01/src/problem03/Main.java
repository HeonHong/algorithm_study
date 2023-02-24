package problem03;

import java.util.Scanner;

//확인 필요
public class Main {
	
	public String solution(String input) {
		
		
		String longer = "";
		
		if(input.length()>=99) input = input.substring(0,100);
		
		String[] inputArray = input.split(" ");
		
		for(int i=0;i<inputArray.length-1;i++) {
			if(i==0) longer = inputArray[0];
			longer = longer.length()>=inputArray[i+1].length() ? longer : inputArray[i+1];
		}
		return longer;
	}

	public static void main(String[] args) {
		
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		 
		System.out.println(main.solution(input));
	}

}
/*
 * 설명
 * 
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 
 * 문장속의 각 단어는 공백으로 구분됩니다.
 * 
 * 
 * 입력 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 
 * 출력 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * 
 * 단어를 답으로 합니다.
 */