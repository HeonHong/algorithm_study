package problem03;

import java.util.Scanner;

public class Main3 {
	
	//indexOf와 substring 사용
	
	public String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE, pos;
		
		//띄어쓰기 없으면 인덱스 값 -1리턴
		while((pos=str.indexOf(" "))!=-1) {
			
			String tmp = str.substring(0,pos);
			//pos가 5인 경우 0~4까지
			int len = tmp.length();
			
			if(len>max) {
				max=len;
				answer = tmp;
			}
			str = str.substring(pos+1);
			
		}//while
		
		//마지막 문장은 띄어쓰기가 없기 때문에 while문을 그냥 지나간다.
		//이러한 문제를 해결하기 위해 마지막 문장이 걸릴 수 있게 처리해준다.
		if(str.length()>max) answer = str;
		
		return answer;
	}

	public static void main(String[] args) {

		Main3 main3 = new Main3();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(main3.solution(str));
		
	}

}
