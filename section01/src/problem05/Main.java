package problem05;

import java.util.Scanner;

public class Main {
		
	public String solution(String input) {
		
		String result="";
		char[] inputArray = input.toCharArray();
		String temp = "";
		String[] tempArray = new String[inputArray.length];
		
		for(int i=0;i<input.length();i++) {
			if((inputArray[i]>=65&&inputArray[i]<=90)
				||(inputArray[i]>=97&&inputArray[i]<=122)) {
				
				temp+=inputArray[i];		
				System.out.println(temp);
			}else {
				tempArray[i]=inputArray[i]+"";
				System.out.println(tempArray[i]);

			}
		}//for
		
		
		for(int i=temp.length()-1;i>=0;i--) {
			System.out.println("여기 오냐?");
			for(int j=0;j<tempArray.length;i++) {
				if("".equals(tempArray[j])) {
					tempArray[j]=temp.substring(i, i+1);
				}
			}
		}
		
		
		for(String toString:tempArray) {
			result += toString;
		}		
		
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		System.out.println(main.solution(input));
		
	}
//https://chragu.com/entry/Java-string-null-check 읽어볼것
}
/*
설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
*/