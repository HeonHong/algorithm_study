package problem04;

import java.util.Scanner;

public class Main {

	public String solution(String word) {
		char[] array = word.toCharArray();
		String reverse = "";
		
		for(int i=array.length-1;i>=0;i--) {
			reverse+=array[i];
		}
		
		return reverse;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		
		int n = scan.nextInt();
		String[] array = new String[n];
		
		for(int i=0;i<n;i++) {
			String reversed = main.solution(scan.next());
			array[i]=reversed;
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		
	}
}
