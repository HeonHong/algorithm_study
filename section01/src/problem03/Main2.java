package problem03;

import java.util.Scanner;

public class Main2 {

	//split 사용
	
	public String solution(String str) {
		
		String answer ="";
		//가장 작은 정수형으로 초기화
		int max =Integer.MIN_VALUE;
		//띄어쓰기 기준으로 나누기
		String[] s = str.split(" ");
		
		for(String x:s) {
			int len = x.length();
			//최대값 구하기 알고리즘
			if(len>max) {
				max = len;
				answer = x;
			} 
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Main2 main2 = new Main2();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(main2.solution(str));

	}

}
