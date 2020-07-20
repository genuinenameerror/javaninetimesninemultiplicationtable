package ninetimesninemultiplicationtable;
import java.util.Scanner;

public class ninetimesninemultiplicationtable {
	public static int[] calculate(int times) { // 계산 저장
		int[] result = new int[9];		
		for (int n=0; n<result.length;n++) {
			result[n]= times * (n+1);
//				s[n]= m + " x " + (n+1) + " = " + k[n];							
		}		
		return result;		
	}
	public static void print(int[] result) { // 화면에 출력
		String[] st = new String[9];
		for (int n=0; n<result.length;n++) {
			st[n] = result[n]/(n+1) + " x " + (n+1) + " = " + result[n];
			System.out.println(st[n]);
		}		
	}
	public static void main(String[] args) {	
		System.out.println("");
		System.out.println("몇 단부터 출력할까요? ");
		Scanner scanner = new Scanner(System.in); 
		int newnumber = scanner.nextInt(); // 입력된 정수값 저장 
		System.out.println("입력된 수 : " + newnumber);
		if (newnumber <2) {
			System.out.println("잘못 입력했습니다");
			
		}
		else if (newnumber>9) {
			System.out.println("잘못 입력했습니다");
		}
		else {
			int[] k = calculate(newnumber);
			print(k);			
		}
	}

}
