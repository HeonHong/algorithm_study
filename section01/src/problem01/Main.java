package problem01;

import java.util.Scanner;



public class Main {
	public int solution(String random, char input){
		
		int count = 0;
		random = random.toLowerCase();
		input = Character.toLowerCase(input);
		
		for(char compare:random.toCharArray()) {
			if(compare == input) ++count;
		}
		//대체 옵션
		//일반 for문
		
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String random = scan.next();
		char input = scan.next().charAt(0);
		
		Main main = new Main();
		System.out.println(main.solution(random, input));

	}

}
