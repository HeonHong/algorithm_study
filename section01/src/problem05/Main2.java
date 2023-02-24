package problem05;

import java.util.Scanner;

public class Main2 {

	//lt(left),rt(right) swap 방식
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int lt= 0, rt = str.length()-1;
		
		//lt,rt가 특수문자인지 확인
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp=s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}//if
		}//while
		answer = String.valueOf(s);
		
		return answer;
	}
	public static void main(String[] args) {

		Main2 main2 = new Main2();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(main2.solution(str));
		
	}

}
